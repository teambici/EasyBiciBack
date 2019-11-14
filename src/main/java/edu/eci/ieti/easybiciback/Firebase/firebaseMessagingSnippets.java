package edu.eci.ieti.easybiciback.Firebase;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;

import org.json.simple.JSONObject;

/**
 * firebaseMessagingSnippets
 */
public class firebaseMessagingSnippets {
    public void sendToToken(String Token) throws FirebaseMessagingException {
        // [START send_to_token]
        // This registration token comes from the client FCM SDKs.


        // See documentation on defining a message payload.
        Message message = Message.builder()
            .putData("score", "850")
            .putData("time", "2:45")
            .setToken(Token)
            .build();

        // Send a message to the device corresponding to the provided
        // registration token.
        String response = FirebaseMessaging.getInstance().send(message);
        // Response is a message ID string.
        System.out.println("Successfully sent message: " + response);
        // [END send_to_token]
      }
      public void sendMsg(String Token) throws IOException{
            String url = "https://fcm.googleapis.com/fcm/send";
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Authorization", "key=AIzaSyAWmcI1gP0ObvwxLaFbOtjpQceEntQwpp0");

            JSONObject msg=new JSONObject();
            msg.put("message","test8");

            JSONObject parent=new JSONObject();

            parent.put("to", Token);
            parent.put("data", msg);

            con.setDoOutput(true);

            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'POST' request to URL : " + url);
            System.out.println("Post parameters : " + parent.toString());
            System.out.println("Response Code : " + responseCode+" "+con.getResponseMessage());
    }
}
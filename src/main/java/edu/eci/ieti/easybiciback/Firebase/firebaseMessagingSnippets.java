package edu.eci.ieti.easybiciback.Firebase;

import java.io.IOException;
import java.io.OutputStreamWriter;
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
    
    public void sendnoti(String Token, String email,String imagen) throws IOException{
        String url = "https://fcm.googleapis.com/fcm/send";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Authorization", "key=AIzaSyAWmcI1gP0ObvwxLaFbOtjpQceEntQwpp0");
            JSONObject msg=new JSONObject();
            msg.put("body",email +" quiere alquilar tu bicicleta");
            msg.put("title","Peticion de Reserva");
            msg.put("icon","https://easybiciback.herokuapp.com/Image/bcfed6-72ac-d21-3448-000d201bd534");
            msg.put("image","https://easybiciback.herokuapp.com/Image/"+imagen);
            JSONObject parent=new JSONObject();
            parent.put("to", Token);
            parent.put("notification", msg);
            parent.put("link","https://easybicii.herokuapp.com/notifications");
            con.setDoOutput(true);
        OutputStreamWriter os = new OutputStreamWriter(con.getOutputStream());
        os.write(parent.toString());
        os.flush();
        os.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + parent.toString());
        System.out.println("Response Code : " + responseCode+" "+con.getResponseMessage());
    }
    public void sendconfirmacion(String Token, String email,String imagen,String estado) throws IOException{
        String url = "https://fcm.googleapis.com/fcm/send";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Authorization", "key=AIzaSyAWmcI1gP0ObvwxLaFbOtjpQceEntQwpp0");
            JSONObject msg=new JSONObject();
            msg.put("body","tu reserva a sido" + estado);
            msg.put("title","Peticion de Reserva");
            msg.put("icon","https://easybiciback.herokuapp.com/Image/bcfed6-72ac-d21-3448-000d201bd534");
            msg.put("image","https://easybiciback.herokuapp.com/Image/"+imagen);
            JSONObject parent=new JSONObject();
            parent.put("to", Token);
            parent.put("notification", msg);
            parent.put("link","https://easybicii.herokuapp.com/notifications");
            con.setDoOutput(true);
        OutputStreamWriter os = new OutputStreamWriter(con.getOutputStream());
        os.write(parent.toString());
        os.flush();
        os.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + parent.toString());
        System.out.println("Response Code : " + responseCode+" "+con.getResponseMessage());
    }
}
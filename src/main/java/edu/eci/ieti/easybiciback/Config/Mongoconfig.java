package edu.eci.ieti.easybiciback.Config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
public class Mongoconfig {

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {

         MongoClientURI uri = new MongoClientURI(
        "mongodb+srv://UsuarioF:ctG7ni8BmhUJ6QGO@datatask-ceboq.mongodb.net/test?retryWrites=true&w=majority");

        MongoClient mongoClient = new MongoClient(uri);

        return new SimpleMongoDbFactory( mongoClient, "test");

    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {

        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());

        return mongoTemplate;

    }

}
package edu.eci.ieti.easybiciback.POJO;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Hogar {
    @Id
    private String id;
    
}
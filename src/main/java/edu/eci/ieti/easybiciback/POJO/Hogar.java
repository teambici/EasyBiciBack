package edu.eci.ieti.easybiciback.POJO;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Hogar {
    @Id
    private String id;
    private String IdDueño;
    private List<Cicla> ciclas;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdDueño() {
        return IdDueño;
    }

    public void setIdDueño(String idDueño) {
        IdDueño = idDueño;
    }

    public List<Cicla> getCiclas() {
        return ciclas;
    }

    public void setCiclas(List<Cicla> ciclas) {
        this.ciclas = ciclas;
    }

   
    
}
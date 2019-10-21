package edu.eci.ieti.easybiciback.POJO;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Comentario {
    @Id
    private String id;
    private String comentado;
    private String comentarista;
    private String comentario;

    public Comentario() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComentado() {
        return comentado;
    }

    public void setComentado(String comentado) {
        this.comentado = comentado;
    }

    public String getComentarista() {
        return comentarista;
    }

    public void setComentarista(String comentarista) {
        this.comentarista = comentarista;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
}
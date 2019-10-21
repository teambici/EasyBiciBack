package edu.eci.ieti.easybiciback.POJO;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Servicio {
    @Id
    private String id;
    private String cicla;
    private String usuario;
    private Date inicioServicio;
    private Date finServicio;
    private int costo;

    public Servicio() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCicla() {
        return cicla;
    }

    public void setCicla(String cicla) {
        this.cicla = cicla;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getInicioServicio() {
        return inicioServicio;
    }

    public void setInicioServicio(Date inicioServicio) {
        this.inicioServicio = inicioServicio;
    }

    public Date getFinServicio() {
        return finServicio;
    }

    public void setFinServicio(Date finServicio) {
        this.finServicio = finServicio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }


}
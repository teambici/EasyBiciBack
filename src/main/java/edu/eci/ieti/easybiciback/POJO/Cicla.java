package edu.eci.ieti.easybiciback.POJO;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cicla {
    @Id
    private String id;
    private String descripcion;
    private Double puntuacion;
    private String imagen;
    private String hogar;

    public Cicla() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getHogar() {
        return hogar;
    }

    public void setHogar(String dueño) {
        this.hogar = hogar;
    }
    
}

package edu.eci.ieti.easybiciback.POJO;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Usuario {
    @Id
    private String id;
    private String nombre;
    private String correo;
    private String tarjeta;
    private Double puntuacion;
    private Ubicacion ubicacion;
    private String documento;
    private String contrasena;
    

    public Usuario() {
    }

    public Usuario(String nombre, String correo, String tarjeta, Double puntuacion, Ubicacion ubicacion, String documento,
            String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.tarjeta = tarjeta;
        this.puntuacion = puntuacion;
        this.ubicacion = ubicacion;
        this.documento = documento;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
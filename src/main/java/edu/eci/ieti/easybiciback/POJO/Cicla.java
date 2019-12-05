package edu.eci.ieti.easybiciback.POJO;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cicla {
    @Id
    private String id;
    private String descripcion;
    private Double puntuacion;
    private String imagen;
    private Boolean disponible;
    private String dueno;
    private String tipo;
    private Date fechamante;
    private Integer precio;
    private String marca;
    private String color;
    private Ubicacion ubicacion;
    private String bikeCode;

    public Cicla() {
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getBikeCode() {
        return bikeCode;
    }

    public void setBikeCode(String bikeCode) {
        this.bikeCode = bikeCode;
    }

    public Cicla(String id,String bikecode, String descripcion, Double puntuacion, String imagen, Boolean disponible, String dueno, String tipo, Date fechamante, Integer precio, String marca, String Color,Ubicacion ubicacion) {
        this.id = id;
        this.bikeCode=bikecode;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
        this.imagen = imagen;
        this.disponible = disponible;
        this.dueno = dueno;
        this.tipo = tipo;
        this.fechamante = fechamante;
        this.precio = precio;
        this.marca = marca;
        this.color = Color;
        this.ubicacion=ubicacion;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String Color) {
        this.color = Color;
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
    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }



	public String getDueno() {
		return dueno;
	}



	public void setDueno(String dueno) {
		this.dueno = dueno;
	}
        
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechamante() {
        return fechamante;
    }

    public void setFechamante(Date fechamante) {
        this.fechamante = fechamante;
    }

 

    
    
    
  
   
    
}

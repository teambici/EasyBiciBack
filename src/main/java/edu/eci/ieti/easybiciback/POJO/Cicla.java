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
    private String fotocicla;

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

    public Cicla( String descripcion, Double puntuacion, String imagen, Boolean disponible, String dueno, String tipo, Date fechamante) {
        
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
        this.imagen = imagen;
        this.disponible = disponible;
        this.dueno = dueno;
        this.tipo = tipo;
        this.fechamante = fechamante;
    }

    public String getFotocicla() {
        return fotocicla;
    }

    public void setFotocicla(String fotocicla) {
        this.fotocicla = fotocicla;
    }

    
    
    
  
   
    
}

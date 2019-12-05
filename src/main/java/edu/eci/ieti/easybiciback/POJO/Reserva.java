/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.ieti.easybiciback.POJO;

import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class Reserva {
    private String id;
    private String bici;
    private String user;
    private Date horaInicio;
    private Date horaFin;
    private String estado;
    private float total;
    
    public Reserva(String id, String bici, String user, Date horaInicio, Date horaFin, float total,String estado) {
        this.id = id;
        this.bici = bici;
        this.user = user;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.total = total;
        this.estado=estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Reserva() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBici() {
        return bici;
    }

    public void setBici(String bici) {
        this.bici = bici;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
   
}

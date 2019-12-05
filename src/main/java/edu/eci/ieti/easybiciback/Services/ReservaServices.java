/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.ieti.easybiciback.Services;

import edu.eci.ieti.easybiciback.POJO.Reserva;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 2112107
 */
public interface ReservaServices {
    List<Reserva> getReservaList();    
    Reserva getReservaById(String reservaId);
    List<Reserva> getReservaByUser(String userId);
    List<Reserva> getReservaByBike(String bikeId);
    Reserva updateReserva (Reserva reserva);
    void removeReserva(String reservaId);
    Reserva createReserva(Reserva reserva);
    List<Reserva> getReservaUser(String userId);
    Reserva confirmacion(Reserva reserva);
}

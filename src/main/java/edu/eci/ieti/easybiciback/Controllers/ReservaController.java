/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.ieti.easybiciback.Controllers;

/**
 *
 * @author easybici 
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.ieti.easybiciback.POJO.Reserva;
import edu.eci.ieti.easybiciback.Services.ReservaServices;

@RestController
@CrossOrigin
public class ReservaController {
    @Autowired
    ReservaServices ReservaServices;
    @RequestMapping(value="/Reserva",method = RequestMethod.GET)
	public ResponseEntity<?> listAllReserves(){
	    try {
	        return new ResponseEntity<>(ReservaServices.getReservaList(),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
	    }
    }
        @RequestMapping(value="/Reserva/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> listAllReservesById(@PathVariable("id") String reservaId){
	    try {
	        return new ResponseEntity<>(ReservaServices.getReservaById(reservaId),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
	    }
    }
    @RequestMapping(value="/Reserva/user/{userId}",method = RequestMethod.GET)
	public ResponseEntity<?> listAllReservesbyuser(@PathVariable("userId") String userId){
	    try {
	        return new ResponseEntity<>(ReservaServices.getReservaByUser(userId),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
	    }
    }  
    @RequestMapping(value="/Reserva/bike/{bikeId}",method = RequestMethod.GET)
	public ResponseEntity<?> listAllReservesbyBike(@PathVariable("bikeId") String bikeId){
	    try {
	        return new ResponseEntity<>(ReservaServices.getReservaByBike(bikeId),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
	    }
    }   
     @RequestMapping(value = "/Reserva", method = RequestMethod.POST)
	public ResponseEntity<?> saveReserva(@RequestBody Reserva u) {
		try {
			
			return new ResponseEntity<>(ReservaServices.createReserva(u),HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);

		}

    }
       @RequestMapping(value = "/Reserva/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> confirmacionReserva(@RequestBody Reserva u) {
		try {
			return new ResponseEntity<>(ReservaServices.confirmacion(u),HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);

		}

    }
        @RequestMapping(value = "/Reserva/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> removeUser(@PathVariable("id") String ReservaId) {
		try {
			ReservaServices.removeReserva(ReservaId);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);

		}

    }
    @RequestMapping(value="/Reserva/alluser/{userId}",method = RequestMethod.GET)
	public ResponseEntity<?> listAllReservesuser(@PathVariable("userId") String userId){
	    try {
	        return new ResponseEntity<>(ReservaServices.getReservaUser(userId),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
	    }
    }  
}

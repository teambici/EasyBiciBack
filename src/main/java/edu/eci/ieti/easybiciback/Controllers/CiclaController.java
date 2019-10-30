package edu.eci.ieti.easybiciback.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.ieti.easybiciback.POJO.Cicla;
import edu.eci.ieti.easybiciback.POJO.Usuario;

import edu.eci.ieti.easybiciback.Services.*;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@CrossOrigin
public class CiclaController {
    @Autowired
	CiclaServices ciclaServices;
	
	
	
	@RequestMapping(value="/Cicla",method = RequestMethod.GET)
	public ResponseEntity<?> listAllCiclas(){
	    try {
	        return new ResponseEntity<>(ciclaServices.getCiclassList(),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
	    }
    }
    @RequestMapping(value = "Cicla/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getCiclaById(@PathVariable("id") String ciclaId) {
		try {
			
			return new ResponseEntity<>(ciclaServices.getUserById(ciclaId),HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);

		}

	}
	@RequestMapping(value = "Cicla/{correo}", method = RequestMethod.GET)
	public ResponseEntity<?> getByDueno(@PathVariable("correo") String correo) {
		try {			
			return new ResponseEntity<>(ciclaServices.getbyDueno(correo),HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);

		}

	}


	@RequestMapping(value = "/Cicla", method = RequestMethod.POST)
	public ResponseEntity<?> saveCicla(@RequestBody Cicla c) {
		try {
			
			return new ResponseEntity<>(ciclaServices.createCicla(c),HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);

		}

    }
    @RequestMapping(value = "/RCicla/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> removeCicla(@PathVariable("id") String ciclaId) {
		try {
			ciclaServices.removeCicla(ciclaId);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);

		}

    }
    @RequestMapping(value = "/UCicla", method = RequestMethod.PUT)
	public ResponseEntity<?> updateCilca(@RequestBody Cicla c) {
		try {
			ciclaServices.updateCicla(c);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);

		}

	}
}
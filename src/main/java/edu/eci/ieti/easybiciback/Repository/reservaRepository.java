/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.ieti.easybiciback.Repository;
import edu.eci.ieti.easybiciback.POJO.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author 2112107
 */
public interface reservaRepository extends MongoRepository<Reserva, String> {
    
}

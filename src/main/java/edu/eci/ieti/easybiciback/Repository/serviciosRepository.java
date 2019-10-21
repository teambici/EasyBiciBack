package edu.eci.ieti.easybiciback.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.eci.ieti.easybiciback.POJO.Servicio;

public interface serviciosRepository extends MongoRepository<Servicio, String> {
    

}
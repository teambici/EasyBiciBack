package edu.eci.ieti.easybiciback.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.eci.ieti.easybiciback.POJO.Hogar;

public interface hogarRepository extends MongoRepository<Hogar, String> {
    

}
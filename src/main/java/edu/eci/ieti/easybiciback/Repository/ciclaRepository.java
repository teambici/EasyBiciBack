package edu.eci.ieti.easybiciback.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.eci.ieti.easybiciback.POJO.Cicla;

public interface ciclaRepository extends MongoRepository<Cicla, String> {
    

}
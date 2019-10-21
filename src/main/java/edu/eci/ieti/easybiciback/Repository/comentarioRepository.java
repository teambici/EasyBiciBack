package edu.eci.ieti.easybiciback.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.eci.ieti.easybiciback.POJO.Comentario;

public interface comentarioRepository extends MongoRepository<Comentario, String> {
    

}
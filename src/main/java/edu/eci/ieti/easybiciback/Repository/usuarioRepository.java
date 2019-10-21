package edu.eci.ieti.easybiciback.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import edu.eci.ieti.easybiciback.POJO.Usuario;

public interface usuarioRepository extends MongoRepository<Usuario, String> {
    

}
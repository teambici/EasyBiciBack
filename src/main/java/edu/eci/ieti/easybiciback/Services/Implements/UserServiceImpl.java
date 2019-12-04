package edu.eci.ieti.easybiciback.Services.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import edu.eci.ieti.easybiciback.Config.Mongoconfig;
import edu.eci.ieti.easybiciback.POJO.Usuario;
import edu.eci.ieti.easybiciback.Repository.usuarioRepository;
import edu.eci.ieti.easybiciback.Services.UserServices;

@Component
public class UserServiceImpl implements UserServices {

    @Autowired
    usuarioRepository usuarioRepo;

    private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Mongoconfig.class);
    private MongoOperations mongoOperation = (MongoOperations) applicationContext.getBean("mongoTemplate");



    @Override
    public Usuario createUser(Usuario user) {
        return usuarioRepo.save(new Usuario(user.getNombre(), user.getCorreo(), user.getTarjeta(),user.getPuntuacion(),user.getDocumento(), user.getContrasena(),user.getNotification()));
    }

    @Override
    public List<Usuario> getUsersList() {
        Query query = new Query();
        List<Usuario> usuarios= mongoOperation.find(query, Usuario.class);
        return usuarios;
    }

    @Override
    public Usuario getUserById(String userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("correo").is(userId));
        Usuario user = mongoOperation.findOne(query, Usuario.class);
        return user;
    }

    @Override
    public Usuario updateUser(Usuario user) {
        mongoOperation.save(user);
        return user;
    }

    @Override
    public void removeUser(String userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("correo").is(userId));
        mongoOperation.remove(query, Usuario.class);
    }
    

    
   

}
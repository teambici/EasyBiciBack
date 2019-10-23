package edu.eci.ieti.easybiciback.Services.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import edu.eci.ieti.easybiciback.Config.Mongoconfig;
import edu.eci.ieti.easybiciback.POJO.Cicla;
import edu.eci.ieti.easybiciback.POJO.Usuario;
import edu.eci.ieti.easybiciback.Repository.ciclaRepository;
import edu.eci.ieti.easybiciback.Repository.usuarioRepository;
import edu.eci.ieti.easybiciback.Services.CiclaServices;
import edu.eci.ieti.easybiciback.Services.UserServices;

@Component
public class CiclaServiceImpl implements CiclaServices {

    @Autowired
    ciclaRepository ciclaRepo;

    private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Mongoconfig.class);
    private MongoOperations mongoOperation = (MongoOperations) applicationContext.getBean("mongoTemplate");

    @Override
    public List<Cicla> getCiclassList() {
        Query query = new Query();
        List<Cicla> ciclas= mongoOperation.find(query, Cicla.class);
        return ciclas;
    }

    @Override
    public Cicla getUserById(String ciclaId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(ciclaId));
        Cicla cicla = mongoOperation.findOne(query, Cicla.class);
        return cicla;
    }

    @Override
    public Cicla createCicla(Cicla cicla) {
        return ciclaRepo.save(new Cicla(cicla.getDescripcion(), cicla.getPuntuacion(), cicla.getImagen(),cicla.getHogar(),cicla.getDisponible()));
    }

    @Override
    public Cicla updateCicla(Cicla cicla) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(cicla.getId()));
        Cicla cicla2 = mongoOperation.findOne(query, Cicla.class);
        cicla2.setDescripcion(cicla.getDescripcion());
        cicla2.setDisponible(cicla.getDisponible());
        cicla2.setImagen(cicla.getImagen());
        cicla2.setHogar(cicla.getHogar());
        cicla2.setPuntuacion(cicla.getPuntuacion());
        mongoOperation.save(cicla2);
        return cicla2;

    }

    @Override
    public void removeCicla(String ciclaId) {
        System.out.println(ciclaId);
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(ciclaId));
        mongoOperation.remove(query, Cicla.class);
		
    }

}
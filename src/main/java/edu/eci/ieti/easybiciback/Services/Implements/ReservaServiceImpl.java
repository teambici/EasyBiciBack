/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.ieti.easybiciback.Services.Implements;

import edu.eci.ieti.easybiciback.Config.Mongoconfig;
import edu.eci.ieti.easybiciback.Firebase.firebaseMessagingSnippets;
import edu.eci.ieti.easybiciback.POJO.Cicla;
import edu.eci.ieti.easybiciback.POJO.Reserva;
import edu.eci.ieti.easybiciback.POJO.Usuario;
import edu.eci.ieti.easybiciback.Repository.ciclaRepository;
import edu.eci.ieti.easybiciback.Repository.reservaRepository;
import edu.eci.ieti.easybiciback.Services.CiclaServices;
import edu.eci.ieti.easybiciback.Services.ReservaServices;
import edu.eci.ieti.easybiciback.Services.UserServices;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import com.google.firebase.messaging.FirebaseMessagingException;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

/**
 *
 * @author 2112107
 */
@Component
public class ReservaServiceImpl implements ReservaServices {
    @Autowired
    reservaRepository reservaRepo;
    private firebaseMessagingSnippets firebase = new firebaseMessagingSnippets();
    CiclaServices ciclaSer = new CiclaServiceImpl();
    UserServices UserSer = new UserServiceImpl();
    private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Mongoconfig.class);
    private MongoOperations mongoOperation = (MongoOperations) applicationContext.getBean("mongoTemplate");

    @Override
    public List<Reserva> getReservaList() {
        Query query = new Query();
        List<Reserva> reserva = mongoOperation.find(query, Reserva.class);
        return reserva;
    }

    @Override
    public Reserva getReservaById(String reservaId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(reservaId));
        Reserva reseva = mongoOperation.findOne(query, Reserva.class);
        return reseva;
    }

    @Override
    public void removeReserva(String reservaId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(reservaId));
        mongoOperation.remove(query, Reserva.class);
    }

    @Override
    public List<Reserva> getReservaByUser(String userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("user").is(userId));
        List<Reserva> reseva = mongoOperation.find(query, Reserva.class);
        return reseva;
    }

    @Override
    public List<Reserva> getReservaByBike(String bikeId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("bici").is(bikeId));
        List<Reserva> reseva = mongoOperation.find(query, Reserva.class);
        return reseva;
    }

    @Override
    public Reserva createReserva(Reserva reserva) {
        Cicla cicla =ciclaSer.getUserById(reserva.getBici());
        Usuario user= UserSer.getUserById(cicla.getDueno());
        try {
            firebase.sendnoti(user.getNotification(),user.getCorreo(),cicla.getImagen());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reservaRepo.save(new Reserva(reserva.getId(),reserva.getBici(),reserva.getUser(),reserva.getHoraInicio(),reserva.getHoraFin(),reserva.getTotal()));
    }

    @Override
    public Reserva updateReserva(Reserva reserva) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(reserva.getId()));
        Reserva reservaNew= mongoOperation.findOne(query, Reserva.class);
        reservaNew.setBici(reserva.getBici());
        reservaNew.setHoraFin(reserva.getHoraFin());
        reservaNew.setHoraInicio(reserva.getHoraInicio());
        reservaNew.setUser(reserva.getUser());
        reservaNew.setTotal(reserva.getTotal());       
        mongoOperation.save(reservaNew);
        return reservaNew;
    }
    
}

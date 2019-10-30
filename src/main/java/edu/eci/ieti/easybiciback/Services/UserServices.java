package edu.eci.ieti.easybiciback.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.eci.ieti.easybiciback.POJO.Usuario;

@Service
public interface UserServices {
    List<Usuario> getUsersList();
    
    Usuario getUserById(String userId);
    
    Usuario createUser(Usuario user);
    
    Usuario updateUser(Usuario user);
    
    void removeUser(String userId);
    
}
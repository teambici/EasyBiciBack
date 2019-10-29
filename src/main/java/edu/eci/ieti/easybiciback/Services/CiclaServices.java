package edu.eci.ieti.easybiciback.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.eci.ieti.easybiciback.POJO.Cicla;

@Service
public interface CiclaServices {
    List<Cicla> getCiclassList();
    
    Cicla getUserById(String ciclaId);
    
    Cicla createCicla(Cicla cicla);
    
    Cicla updateCicla(Cicla cicla);
    
    void removeCicla(String ciclaId);
    
    List<Cicla> getbyDueno(String correo);
}
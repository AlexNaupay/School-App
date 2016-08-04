package com.devteam.school.controllers.impl;


import com.devteam.school.app.Utils;
import com.devteam.school.controllers.ProfesorController;
import com.devteam.school.model.entities.Profesor;
import com.devteam.school.model.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller(value = "profesorController")
public class ProfesorControllerImpl implements ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    @Override
    public Profesor saveProfesor(Profesor profesor) {
        if(validarProfesor(profesor))
            return profesorService.save(profesor);
        return null;
    }

    @Override
    public Profesor updateProfesor(Profesor profesor) {
        if(validarProfesor(profesor))
            return profesorService.update(profesor);
        return null;
    }

    @Override
    public List<Profesor> getProfesores() {
        return profesorService.findAll();
    }

    @Override
    public List<Profesor> searchProfesores(String searchPattern) {
        return profesorService.search(searchPattern);
    }

    @Override
    public Profesor getProfesorById(int id) {
        return profesorService.findById(id);
    }

    @Override
    public boolean deleteProfesor(long id) {
        return profesorService.delete(id);
    }
    
    private boolean validarProfesor(Profesor profesor){
        
        if(profesor.getNombre().isEmpty()){
            Utils.showErrorMessage(null, "El nombre es obligatorio");
            return false;
        }
        
        if(profesor.getApellidos().isEmpty()){
            Utils.showErrorMessage(null, "Los apellidos son obligatorios");
            return false;
        }
        
        if(profesor.getDni().isEmpty() || profesor.getDni().length() != 8){
            Utils.showErrorMessage(null, "El DNI debe tener 8 dígitos");
            return false;
        }
        
        if( !Utils.emailValidate( profesor.getEmail() )){
            Utils.showErrorMessage(null, "El email no es válido");
            return false;
        }
        
        if(profesor.getUsername().isEmpty()){
            Utils.showErrorMessage(null, "El nombre de usuario es obligatorio");
            return false;
        }
        
        if(profesor.getPassword().isEmpty()){
            Utils.showErrorMessage(null, "La contraseña es obligatoria");
            return false;
        }

        return true;
    }
    
}

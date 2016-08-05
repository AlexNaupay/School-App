package com.devteam.school.controllers.impl;


import com.devteam.school.app.Utils;
import com.devteam.school.controllers.AlumnoController;
import com.devteam.school.model.entities.Alumno;
import com.devteam.school.model.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller(value = "alumnoController")
public class AlumnoControllerImpl implements AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @Override
    public Alumno saveAlumno(Alumno alumno) {
        if(validarAlumno(alumno))
            return alumnoService.save(alumno);
        return null;
    }

    @Override
    public Alumno updateAlumno(Alumno alumno) {
        if(validarAlumno(alumno))
            return alumnoService.update(alumno);
        return null;
    }

    @Override
    public List<Alumno> getAlumnos() {
        return alumnoService.findAll();
    }

    @Override
    public List<Alumno> searchAlumnos(String searchPattern) {
        return alumnoService.search(searchPattern);
    }

    @Override
    public Alumno getAlumnoById(int id) {
        return alumnoService.findById(id);
    }

    @Override
    public boolean deleteAlumno(long id) {
        return alumnoService.delete(id);
    }
    
    private boolean validarAlumno(Alumno alumno){
        
        if(alumno.getNombre().isEmpty()){
            Utils.showErrorMessage(null, "El nombre es obligatorio");
            return false;
        }
        
        if(alumno.getApellidos().isEmpty()){
            Utils.showErrorMessage(null, "Los apellidos son obligatorios");
            return false;
        }

        
        if( !Utils.emailValidate( alumno.getEmail() )){
            Utils.showErrorMessage(null, "El email no es válido");
            return false;
        }
        
        if(alumno.getFechaNacimiento() == null){
            Utils.showErrorMessage(null, "La fecha de nacimiento es obligatorio");
            return false;
        }

        if(!Utils.isDateInRange(alumno.getFechaNacimiento())){
            Utils.showErrorMessage(null, "Selecciona una fecha entre 01/01/1950 y Ayer");
            return false;
        }

        return true;
    }
    
}

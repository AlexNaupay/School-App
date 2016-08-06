package com.devteam.school.controllers.impl;


import com.devteam.school.app.Utils;
import com.devteam.school.controllers.CursoController;
import com.devteam.school.model.entities.Curso;
import com.devteam.school.model.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller(value = "cursoController")
public class CursoControllerImpl implements CursoController {

    @Autowired
    private CursoService cursoService;

    @Override
    public Curso saveCurso(Curso curso) {
        if(validarCurso(curso))
            return cursoService.save(curso);
        return null;
    }

    @Override
    public Curso updateCurso(Curso curso) {
        if(validarCurso(curso))
            return cursoService.update(curso);
        return null;
    }

    @Override
    public List<Curso> getCursos() {
        return cursoService.findAll();
    }

    @Override
    public List<Curso> searchCursos(String searchPattern) {
        return cursoService.search(searchPattern);
    }

    @Override
    public Curso getCursoById(int id) {
        return cursoService.findById(id);
    }

    @Override
    public boolean deleteCurso(long id) {
        return cursoService.delete(id);
    }
    
    private boolean validarCurso(Curso curso){
        
        if(curso.getNombre().isEmpty()){
            Utils.showErrorMessage(null, "El nombre es obligatorio");
            return false;
        }
        
        if(curso.getDescripcion().isEmpty()){
            Utils.showErrorMessage(null, "La descripción es obligatoria");
            return false;
        }

        if( curso.getProfesorId() == 0){
            Utils.showErrorMessage(null, "El profesor del curso es obligatorio");
            return false;
        }

        return true;
    }
    
}

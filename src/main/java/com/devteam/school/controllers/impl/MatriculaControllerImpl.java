package com.devteam.school.controllers.impl;

import com.devteam.school.app.Utils;
import com.devteam.school.controllers.MatriculaController;
import com.devteam.school.model.entities.Matricula;
import com.devteam.school.model.entities.MatriculaDetalle;
import com.devteam.school.model.services.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller(value = "matriculaController")
public class MatriculaControllerImpl implements MatriculaController {

    @Autowired
    MatriculaService matriculaService;

    @Override
    public List<MatriculaDetalle> getAcademicBackground(long alumnoId) {
        int anio = Utils.currentYear();
        return getAcademicBackground(alumnoId, anio);
    }

    @Override
    public List<MatriculaDetalle> getAcademicBackground(long alumnoId, int anio) {
        return matriculaService.findAcademicBackground(alumnoId, anio);
    }

    @Override
    public List<MatriculaDetalle> getStudentsCourse(long cursoId, int grado) {
        int anio = Utils.currentYear();
        return getStudentsCourse(cursoId, anio, grado);
    }

    @Override
    public List<MatriculaDetalle> getStudentsCourse(long cursoId, int anio, int grado) {
        return matriculaService.findStudentsCourse(cursoId, anio, grado);
    }

    @Override
    public List<MatriculaDetalle> getPreviousAcademicBackground(long alumnoId) {
        int anio = Utils.currentYear() - 1;
        return getAcademicBackground(alumnoId, anio);
    }

    @Override
    public Matricula saveMatricula(Matricula matricula) {
        if (validateMatricula(matricula))
            return matriculaService.saveMatricula(matricula);
        return null;
    }

    @Override
    public Matricula updateMatricula(Matricula matricula) {
        if (validateMatricula(matricula))
            return updateMatricula(matricula);
        return null;
    }

    private boolean validateMatricula(Matricula matricula){
        if(matricula.getAlumnoId() == 0){
            Utils.showErrorMessage(null, "El alumno es obligatorio");
            return false;
        }
        if(matricula.getAlumnoId() == 0){
            Utils.showErrorMessage(null, "El alumno es obligatorio");
            return false;
        }

        return true;
    }
}

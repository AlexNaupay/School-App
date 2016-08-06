package com.devteam.school.controllers;

import com.devteam.school.model.entities.Matricula;
import com.devteam.school.model.entities.MatriculaDetalle;

import java.util.List;

public interface MatriculaController {

    List<MatriculaDetalle> getAcademicBackground(long alumnoId);
    List getAcademicBackground(long alumnoId, int anio);


    List<MatriculaDetalle> getStudentsCourse(long cursoId, int grado);
    List<MatriculaDetalle> getStudentsCourse(long cursoId, int anio, int grado);

    public List<MatriculaDetalle> getPreviousAcademicBackground(long id);

    Matricula saveMatricula(Matricula matricula);

    Matricula updateMatricula(Matricula matricula);

}

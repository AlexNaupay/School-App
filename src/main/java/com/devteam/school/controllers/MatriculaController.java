package com.devteam.school.controllers;

import com.devteam.school.model.entities.Matricula;
import com.devteam.school.model.entities.MatriculaDetalle;


import java.util.List;

public interface MatriculaController {

    List<MatriculaDetalle> getAcademicBackground(long alumnoId);
    List<MatriculaDetalle> getAcademicBackground(long alumnoId, int anio);


    /**
     * Lista de alumnos del cursoId en el grado x (por defecto en el presente Año)
     * @param cursoId
     * @param grado
     * @return 
     */
    List<MatriculaDetalle> getStudentsCourse(long cursoId, int grado);
    List<MatriculaDetalle> getStudentsCourse(long cursoId, int anio, int grado);

    public List<MatriculaDetalle> getPreviousAcademicBackground(long id);

    Matricula saveMatricula(Matricula matricula);

    Matricula updateMatricula(Matricula matricula);

    List<MatriculaDetalle> updateNotas(List<MatriculaDetalle> detalles);

    boolean login(String user, String password);

    Matricula checkMatricula(Matricula matricula);

}

package com.devteam.school.model.services;


import com.devteam.school.model.entities.Matricula;
import com.devteam.school.model.entities.MatriculaDetalle;
import com.devteam.school.model.entities.Profesor;

import java.util.List;

public interface MatriculaService {

    List<MatriculaDetalle> findAcademicBackground(long alumnoId, int anio);

    List<MatriculaDetalle> findStudentsCourse(long cursoId, int anio, int grado);

    Matricula saveMatricula(Matricula matricula);

    Matricula updateMatricula(Matricula matricula);

    List<MatriculaDetalle> updateMatriculasDetalle(List<MatriculaDetalle> detalles);

    Profesor login(String user, String password);

    Matricula checkMatricula(Matricula matricula);

}

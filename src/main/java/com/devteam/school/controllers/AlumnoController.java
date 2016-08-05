package com.devteam.school.controllers;

import com.devteam.school.model.entities.Alumno;

import java.util.List;

public interface AlumnoController {

    Alumno saveAlumno(Alumno alumno);

    Alumno updateAlumno(Alumno alumno);

    List<Alumno> getAlumnos();

    List<Alumno> searchAlumnos(String searchPattern);

    Alumno getAlumnoById(int id);

    boolean deleteAlumno(long id);
}

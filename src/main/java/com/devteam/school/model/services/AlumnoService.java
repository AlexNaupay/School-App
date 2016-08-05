package com.devteam.school.model.services;

import com.devteam.school.model.entities.Alumno;

import java.util.List;

public interface AlumnoService {
    Alumno save(Alumno alumno);

    List<Alumno> findAll();

    Alumno findById(long id);

    Alumno update(Alumno alumno);

    boolean delete(long id);

    List<Alumno> search(String searchPattern);
}

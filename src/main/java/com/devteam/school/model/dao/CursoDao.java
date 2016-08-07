package com.devteam.school.model.dao;

import com.devteam.school.model.entities.Curso;

import java.util.List;

public interface CursoDao {

    Curso save(Curso curso);

    List<Curso> findAll();

    Curso findById(long id);

    Curso update(Curso curso);

    boolean delete(long id);

    List<Curso> search(String searchPattern);

    List<Curso> findCoursesByProfesor(long profesorId);

}

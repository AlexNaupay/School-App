package com.devteam.school.controllers;

import com.devteam.school.model.entities.Curso;

import java.util.List;

public interface CursoController {

    Curso saveCurso(Curso curso);

    Curso updateCurso(Curso curso);

    List<Curso> getCursos();

    List<Curso> searchCursos(String searchPattern);

    Curso getCursoById(int id);

    boolean deleteCurso(long id);
}

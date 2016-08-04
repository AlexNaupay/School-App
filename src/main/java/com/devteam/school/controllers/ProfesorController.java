package com.devteam.school.controllers;

import com.devteam.school.model.entities.Profesor;

import java.util.List;

public interface ProfesorController {

    Profesor saveProfesor(Profesor profesor);

    Profesor updateProfesor(Profesor profesor);

    List<Profesor> getProfesores();

    List<Profesor> searchProfesores(String searchPattern);

    Profesor getProfesorById(int id);

    boolean deleteProfesor(long id);
}

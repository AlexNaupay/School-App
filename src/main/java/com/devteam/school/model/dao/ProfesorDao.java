package com.devteam.school.model.dao;

import com.devteam.school.model.entities.Profesor;

import java.util.List;

public interface ProfesorDao {

    Profesor save(Profesor profesor);

    List<Profesor> findAll();

    Profesor findById(long id);

    Profesor update(Profesor profesor);

    boolean delete(long id);

    List<Profesor> search(String searchPattern);

    Profesor findByUsername(String username);

}

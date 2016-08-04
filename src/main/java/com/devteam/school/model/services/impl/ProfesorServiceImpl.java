package com.devteam.school.model.services.impl;

import com.devteam.school.model.dao.ProfesorDao;
import com.devteam.school.model.entities.Profesor;
import com.devteam.school.model.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImpl implements ProfesorService{

    @Autowired
    ProfesorDao profesorDao;

    @Override
    public Profesor save(Profesor profesor) {
        return profesorDao.save(profesor);
    }

    @Override
    public List<Profesor> findAll() {
        return profesorDao.findAll();
    }

    @Override
    public Profesor findById(long id) {
        return profesorDao.findById(id);
    }

    @Override
    public Profesor update(Profesor profesor) {
        return profesorDao.update(profesor);
    }

    @Override
    public boolean delete(long id) {
        return profesorDao.delete(id);
    }

    @Override
    public List<Profesor> search(String searchPattern) {
        return profesorDao.search(searchPattern);
    }
}

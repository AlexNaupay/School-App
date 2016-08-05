package com.devteam.school.model.services.impl;

import com.devteam.school.model.dao.AlumnoDao;
import com.devteam.school.model.entities.Alumno;
import com.devteam.school.model.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService{

    @Autowired
    AlumnoDao alumnoDao;

    @Override
    public Alumno save(Alumno alumno) {
        return alumnoDao.save(alumno);
    }

    @Override
    public List<Alumno> findAll() {
        return alumnoDao.findAll();
    }

    @Override
    public Alumno findById(long id) {
        return alumnoDao.findById(id);
    }

    @Override
    public Alumno update(Alumno alumno) {
        return alumnoDao.update(alumno);
    }

    @Override
    public boolean delete(long id) {
        return alumnoDao.delete(id);
    }

    @Override
    public List<Alumno> search(String searchPattern) {
        return alumnoDao.search(searchPattern);
    }
}

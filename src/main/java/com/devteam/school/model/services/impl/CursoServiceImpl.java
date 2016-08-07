package com.devteam.school.model.services.impl;

import com.devteam.school.model.dao.CursoDao;
import com.devteam.school.model.entities.Curso;
import com.devteam.school.model.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService{

    @Autowired
    CursoDao cursoDao;

    @Override
    public Curso save(Curso curso) {
        return cursoDao.save(curso);
    }

    @Override
    public List<Curso> findAll() {
        return cursoDao.findAll();
    }

    @Override
    public Curso findById(long id) {
        return cursoDao.findById(id);
    }

    @Override
    public Curso update(Curso curso) {
        return cursoDao.update(curso);
    }

    @Override
    public boolean delete(long id) {
        return cursoDao.delete(id);
    }

    @Override
    public List<Curso> search(String searchPattern) {
        return cursoDao.search(searchPattern);
    }

    @Override
    public List<Curso> findCoursesByProfesor(long profesorId) {
        return cursoDao.findCoursesByProfesor(profesorId);
    }
}

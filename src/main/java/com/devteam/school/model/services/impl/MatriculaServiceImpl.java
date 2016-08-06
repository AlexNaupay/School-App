package com.devteam.school.model.services.impl;


import com.devteam.school.model.dao.MatriculaDao;
import com.devteam.school.model.entities.Matricula;
import com.devteam.school.model.entities.MatriculaDetalle;
import com.devteam.school.model.services.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements MatriculaService{

    @Autowired
    MatriculaDao matriculaDao;

    @Override
    public List<MatriculaDetalle> findAcademicBackground(long alumnoId, int anio) {
        return matriculaDao.findAcademicBackground(alumnoId, anio);
    }

    @Override
    public List<MatriculaDetalle> findStudentsCourse(long cursoId, int anio, int grado) {
        return matriculaDao.findStudentsCourse(cursoId, anio, grado);
    }

    @Override
    public Matricula saveMatricula(Matricula matricula) {
        return matriculaDao.saveMatricula(matricula);
    }

    @Override
    public Matricula updateMatricula(Matricula matricula) {
        return matriculaDao.updateMatricula(matricula);
    }
}

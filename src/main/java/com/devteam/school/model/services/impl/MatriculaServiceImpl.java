package com.devteam.school.model.services.impl;


import com.devteam.school.model.dao.MatriculaDao;
import com.devteam.school.model.entities.Matricula;
import com.devteam.school.model.entities.MatriculaDetalle;
import com.devteam.school.model.entities.Profesor;
import com.devteam.school.model.services.MatriculaService;
import com.devteam.school.model.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatriculaServiceImpl implements MatriculaService{

    @Autowired
    MatriculaDao matriculaDao;

    @Autowired
    ProfesorService profesorService;

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

    @Override
    public List<MatriculaDetalle> updateMatriculasDetalle(List<MatriculaDetalle> detalles) {
        List<MatriculaDetalle> list = new ArrayList<>();
        MatriculaDetalle matriculaDetalle;
        boolean isOk = true;

        for (MatriculaDetalle detalle : detalles){
            matriculaDetalle = matriculaDao.updateDetalleMatricula(detalle);
            if (matriculaDetalle != null){
                list.add(matriculaDetalle);
            }else isOk = false;
        }

        if (!isOk) return null;

        return list;
    }

    @Override
    public Profesor login(String user, String password) {
        Profesor profesor = profesorService.findByUsername(user);
        if (profesor != null)
            if (profesor.getPassword().equals(password))
                return profesor;
        return null;
    }
}

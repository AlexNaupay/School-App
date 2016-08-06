package com.devteam.school.model.dao.mappers;

import com.devteam.school.model.entities.Matricula;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class MatriculaMapper implements RowMapper<Matricula> {
    @Override
    public Matricula mapRow(ResultSet result, int i) throws SQLException {
        Matricula matricula = new Matricula();

        matricula.setId(result.getLong("Id"));
        matricula.setAnio(result.getInt("Anio"));
        matricula.setGrado(result.getInt("Grado"));
        matricula.setAlumnoId(result.getLong("AlumnoId"));
        return matricula;
    }
}

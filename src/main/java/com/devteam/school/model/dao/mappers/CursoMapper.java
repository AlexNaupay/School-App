package com.devteam.school.model.dao.mappers;

import com.devteam.school.model.entities.Curso;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class CursoMapper implements RowMapper<Curso> {
    @Override
    public Curso mapRow(ResultSet result, int i) throws SQLException {
        Curso curso = new Curso();

        curso.setId(result.getLong("Id"));
        curso.setNombre(result.getString("Nombre"));
        curso.setDescripcion(result.getString("Descripcion"));
        curso.setProfesorId(result.getLong("ProfesorId"));

        return curso;
    }
}

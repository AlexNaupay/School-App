package com.devteam.school.model.dao.mappers;

import com.devteam.school.model.entities.MatriculaDetalle;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class MatriculaDetalleMapper implements RowMapper<MatriculaDetalle> {

    @Override
    public MatriculaDetalle mapRow(ResultSet result, int i) throws SQLException {
        MatriculaDetalle mdetalle = new MatriculaDetalle();

        mdetalle.setId(result.getLong("Id"));
        mdetalle.setNota1(result.getInt("Nota1"));
        mdetalle.setNota2(result.getInt("Nota2"));
        mdetalle.setNota3(result.getInt("Nota3"));
        mdetalle.setPromedio(result.getInt("Promedio"));
        mdetalle.setMatriculaId(result.getLong("MatriculaId"));
        mdetalle.setCursoId(result.getLong("CursoId"));

        mdetalle.setCursoNombre(result.getString("CursoNombre"));
        mdetalle.setProfesorNombre(result.getString("ProfesorNombre"));
        mdetalle.setAlumnoNombre(result.getString("AlumnoNombre"));
        mdetalle.setGrado(result.getInt("Grado"));

        return mdetalle;
    }
}

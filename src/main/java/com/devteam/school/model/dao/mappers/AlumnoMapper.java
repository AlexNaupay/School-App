package com.devteam.school.model.dao.mappers;

import com.devteam.school.model.entities.Alumno;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class AlumnoMapper implements RowMapper<Alumno> {
    @Override
    public Alumno mapRow(ResultSet result, int i) throws SQLException {
        Alumno alumno = new Alumno();

        alumno.setId(result.getLong("Id"));
        alumno.setNombre(result.getString("Nombre"));
        alumno.setApellidos(result.getString("Apellidos"));
        alumno.setTelefono(result.getString("Telefono"));
        alumno.setDireccion(result.getString("Direccion"));
        alumno.setEmail(result.getString("Email"));
        alumno.setFechaNacimiento(result.getTimestamp("FechaNacimiento"));

        return alumno;
    }
}

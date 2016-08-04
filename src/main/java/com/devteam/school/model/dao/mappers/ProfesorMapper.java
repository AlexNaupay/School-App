package com.devteam.school.model.dao.mappers;

import com.devteam.school.model.entities.Profesor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ProfesorMapper implements RowMapper<Profesor> {
    @Override
    public Profesor mapRow(ResultSet result, int i) throws SQLException {
        Profesor profesor = new Profesor();

        profesor.setId(result.getLong("Id"));
        profesor.setNombre(result.getString("Nombre"));
        profesor.setApellidos(result.getString("Apellidos"));
        profesor.setSueldo(result.getFloat("Sueldo"));
        profesor.setDni(result.getString("DNI"));
        profesor.setDireccion(result.getString("Direccion"));
        profesor.setEmail(result.getString("Email"));

        profesor.setUsername(result.getString("Username"));
        profesor.setPassword(result.getString("Password"));

        return profesor;
    }
}

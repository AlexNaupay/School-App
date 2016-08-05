package com.devteam.school.model.dao.impl;

import com.devteam.school.model.dao.AlumnoDao;
import com.devteam.school.model.dao.mappers.AlumnoMapper;
import com.devteam.school.model.entities.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class AlumnoDaoImpl implements AlumnoDao {

    @Autowired
    private DataSource dataSource;

    private SimpleJdbcCall simpleJdbcCall;


    @Override
    public Alumno save(Alumno alumno) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_insert_alumno")
                .returningResultSet("alumnos",new AlumnoMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("nombre", alumno.getNombre())
                .addValue("apellidos", alumno.getApellidos())
                .addValue("telefono", alumno.getTelefono())
                .addValue("email", alumno.getEmail())
                .addValue("direccion", alumno.getDireccion())
                .addValue("fecha_nacimiento", alumno.getFechaNacimiento());
        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("alumnos");
        if (list.isEmpty())
            return null;
        return (Alumno) list.get(0);

    }

    @Override
    public List<Alumno> findAll() {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_find_all_alumnos")
                .returningResultSet("alumnos", new AlumnoMapper());

        Map map = simpleJdbcCall.execute();

        return (List<Alumno>) map.get("alumnos");
    }

    @Override
    public Alumno findById(long id) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_find_alumno_by_id")
                .returningResultSet("fields",new AlumnoMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("id", id);

        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("fields");
        if (list.isEmpty())
            return null;
        return (Alumno) list.get(0);
    }

    @Override
    public Alumno update(Alumno alumno) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_update_alumno")
                .returningResultSet("alumnos",new AlumnoMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("id", alumno.getId())
                .addValue("nombre", alumno.getNombre())
                .addValue("apellidos", alumno.getApellidos())
                .addValue("telefono", alumno.getTelefono())
                .addValue("email", alumno.getEmail())
                .addValue("direccion", alumno.getDireccion())
                .addValue("fecha_nacimiento", alumno.getFechaNacimiento());

        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("alumnos");
        if (list.isEmpty())
            return null;
        return (Alumno) list.get(0);
    }

    @Override
    public boolean delete(long id) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_delete_alumno")
                .returningResultSet("alumnos",new AlumnoMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("id", id);

        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("alumnos");
        return list.isEmpty();
    }

    @Override
    public List<Alumno> search(String searchPattern) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_search_alumnos")
                .returningResultSet("alumnos",new AlumnoMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("search", searchPattern);

        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("alumnos");
        return  (List<Alumno>) list;
    }
}

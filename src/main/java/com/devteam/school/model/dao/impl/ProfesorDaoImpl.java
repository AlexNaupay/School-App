package com.devteam.school.model.dao.impl;

import com.devteam.school.model.dao.ProfesorDao;
import com.devteam.school.model.dao.mappers.ProfesorMapper;
import com.devteam.school.model.entities.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class ProfesorDaoImpl implements ProfesorDao {

    @Autowired
    private DataSource dataSource;

    private SimpleJdbcCall simpleJdbcCall;


    @Override
    public Profesor save(Profesor profesor) {
        try{
            simpleJdbcCall = new SimpleJdbcCall(dataSource)
                    .withProcedureName("usp_insert_profesor")
                    .returningResultSet("profesores",new ProfesorMapper());

            SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                    .addValue("nombre", profesor.getNombre())
                    .addValue("apellidos", profesor.getApellidos())
                    .addValue("dni", profesor.getDni())
                    .addValue("email", profesor.getEmail())
                    .addValue("sueldo", profesor.getSueldo())
                    .addValue("direccion", profesor.getDireccion())
                    .addValue("Username", profesor.getUsername())
                    .addValue("Password", profesor.getPassword());

            Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

            List list = (List) map.get("profesores");
            if (list.isEmpty())
                return null;
            return (Profesor) list.get(0);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public List<Profesor> findAll() {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_find_all_profesores")
                .returningResultSet("fields", new ProfesorMapper());

        Map map = simpleJdbcCall.execute();

        return (List<Profesor>) map.get("fields");
    }

    @Override
    public Profesor findById(long id) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_find_profesor_by_id")
                .returningResultSet("fields",new ProfesorMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("id", id);

        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("fields");
        if (list.isEmpty())
            return null;
        return (Profesor) list.get(0);
    }

    @Override
    public Profesor findByUsername(String username) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_find_profesor_by_username")
                .returningResultSet("fields",new ProfesorMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("username", username);

        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("fields");
        if (list.isEmpty())
            return null;
        return (Profesor) list.get(0);
    }

    @Override
    public Profesor update(Profesor profesor) {
        try{
            simpleJdbcCall = new SimpleJdbcCall(dataSource)
                    .withProcedureName("usp_update_profesor")
                    .returningResultSet("profesores",new ProfesorMapper());

            SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                    .addValue("id", profesor.getId())
                    .addValue("nombre", profesor.getNombre())
                    .addValue("apellidos", profesor.getApellidos())
                    .addValue("dni", profesor.getDni())
                    .addValue("email", profesor.getEmail())
                    .addValue("sueldo", profesor.getSueldo())
                    .addValue("direccion", profesor.getDireccion())
                    .addValue("Username", profesor.getUsername())
                    .addValue("Password", profesor.getPassword());

            Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

            List list = (List) map.get("profesores");
            if (list.isEmpty())
                return null;
            return (Profesor) list.get(0);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public boolean delete(long id) {
        try{
            simpleJdbcCall = new SimpleJdbcCall(dataSource)
                    .withProcedureName("usp_delete_profesor")
                    .returningResultSet("profesores",new ProfesorMapper());

            SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                    .addValue("id", id);

            Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

            List list = (List) map.get("profesores");
            return list.isEmpty();
        }catch (DataIntegrityViolationException dive){
            return false;
        }
    }

    @Override
    public List<Profesor> search(String searchPattern) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_search_profesors")
                .returningResultSet("profesors",new ProfesorMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("search", searchPattern);

        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("profesors");
        return  (List<Profesor>) list;
    }
}

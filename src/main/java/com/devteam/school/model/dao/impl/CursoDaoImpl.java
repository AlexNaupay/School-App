package com.devteam.school.model.dao.impl;

import com.devteam.school.model.dao.CursoDao;
import com.devteam.school.model.dao.mappers.CursoMapper;
import com.devteam.school.model.entities.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class CursoDaoImpl implements CursoDao {

    @Autowired
    private DataSource dataSource;

    private SimpleJdbcCall simpleJdbcCall;


    @Override
    public Curso save(Curso curso) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_insert_curso")
                .returningResultSet("cursos",new CursoMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("nombre", curso.getNombre())
                .addValue("descripcion", curso.getDescripcion())
                .addValue("profesor_id", curso.getProfesorId());

        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("cursos");
        if (list.isEmpty())
            return null;
        return (Curso) list.get(0);

    }

    @Override
    public List<Curso> findAll() {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_find_all_cursos")
                .returningResultSet("cursos", new CursoMapper());

        Map map = simpleJdbcCall.execute();

        return (List<Curso>) map.get("cursos");
    }

    @Override
    public Curso findById(long id) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_find_curso_by_id")
                .returningResultSet("fields",new CursoMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("id", id);

        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("fields");
        if (list.isEmpty())
            return null;
        return (Curso) list.get(0);
    }

    @Override
    public Curso update(Curso curso) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_update_curso")
                .returningResultSet("cursos",new CursoMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("id", curso.getId())
                .addValue("nombre", curso.getNombre())
                .addValue("descripcion", curso.getDescripcion())
                .addValue("profesor_id", curso.getProfesorId());

        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("cursos");
        if (list.isEmpty())
            return null;
        return (Curso) list.get(0);
    }

    @Override
    public boolean delete(long id) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_delete_curso")
                .returningResultSet("cursos",new CursoMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("id", id);

        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("cursos");
        return list.isEmpty();
    }

    @Override
    public List<Curso> search(String searchPattern) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_search_cursos")
                .returningResultSet("cursos",new CursoMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("search", searchPattern);

        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("cursos");
        return  (List<Curso>) list;
    }
}

package com.devteam.school.model.dao.impl;

import com.devteam.school.model.dao.MatriculaDao;
import com.devteam.school.model.dao.mappers.MatriculaDetalleMapper;
import com.devteam.school.model.dao.mappers.MatriculaMapper;
import com.devteam.school.model.entities.Matricula;
import com.devteam.school.model.entities.MatriculaDetalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class MatriculaDaoImpl implements MatriculaDao{

    @Autowired
    private DataSource dataSource;

    private SimpleJdbcCall simpleJdbcCall;

    @Override
    public List<MatriculaDetalle> findAcademicBackground(long alumnoId, int anio) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_find_academic_background")
                .returningResultSet("details",new MatriculaDetalleMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("alumno_id", alumnoId)
                .addValue("anio", anio);

        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        return  (List<MatriculaDetalle>) map.get("details");
    }

    @Override
    public List<MatriculaDetalle> findStudentsCourse(long cursoId, int anio, int grado) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_find_students_course")
                .returningResultSet("details",new MatriculaDetalleMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("curso_id", cursoId)
                .addValue("anio", anio)
                .addValue("grado", grado);
        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        return  (List<MatriculaDetalle>) map.get("details");
    }

    @Override
    public Matricula saveMatricula(Matricula matricula) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_insert_matricula")
                .returningResultSet("matriculas",new MatriculaMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("anio", matricula.getAnio())
                .addValue("grado", matricula.getGrado())
                .addValue("alumno_id", matricula.getAlumnoId());
        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("matriculas");
        if (list.isEmpty())
            return null;
        return (Matricula) list.get(0);
    }

    @Override
    public Matricula updateMatricula(Matricula matricula) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_update_matricula")
                .returningResultSet("matriculas",new MatriculaMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("id", matricula.getId())
                .addValue("anio", matricula.getAnio())
                .addValue("grado", matricula.getGrado())
                .addValue("alumno_id", matricula.getAlumnoId());

        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("matriculas");
        if (list.isEmpty())
            return null;
        return (Matricula) list.get(0);
    }

    @Override
    public MatriculaDetalle updateDetalleMatricula(MatriculaDetalle matriculaDetalle) {
        simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("usp_update_matricula_detalle")
                .returningResultSet("detalles",new MatriculaDetalleMapper());

        SqlParameterSource sqlParameterSourceIn = new MapSqlParameterSource()
                .addValue("id", matriculaDetalle.getId())
                .addValue("Nota1", matriculaDetalle.getNota1())
                .addValue("Nota2", matriculaDetalle.getNota2())
                .addValue("Nota3", matriculaDetalle.getNota3());
        Map map = simpleJdbcCall.execute(sqlParameterSourceIn);

        List list = (List) map.get("detalles");
        if (list.isEmpty())
            return null;
        return (MatriculaDetalle) list.get(0);
    }


}

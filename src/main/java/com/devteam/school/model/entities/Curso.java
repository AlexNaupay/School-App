package com.devteam.school.model.entities;


public class Curso {
    private long id;
    private String nombre;
    private String descripcion;

    private long profesorId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(long profesorId) {
        this.profesorId = profesorId;
    }

}

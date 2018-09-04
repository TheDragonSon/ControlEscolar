package com.escuela.organizacion.Control.Escolar.dao;

import com.escuela.organizacion.Control.Escolar.entity.alumno;

import java.util.List;

public interface IalumnoDao {

    public List<alumno> findAllAlumnos();//buscar todos
    public void save(alumno Alumno);//guardar
    public alumno findOneAlumno(Long id); //buscar uno
    public void delete (Long id); //borrar por id



}

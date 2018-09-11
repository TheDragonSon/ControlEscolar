package com.escuela.organizacion.Control.Escolar.dao;

import com.escuela.organizacion.Control.Escolar.entity.materia;

import java.util.List;

public interface ImateriaDao {



    public List<materia> findAll();//buscar todos
    public void save(materia Materia);//guardar
    public materia findOne(Long id); //buscar uno
    public void delete (Long id); //borrar por id





}

package com.escuela.organizacion.Control.Escolar.dao;

import com.escuela.organizacion.Control.Escolar.entity.maestro;

import java.util.List;

public interface ImaestroDao {

    public List<maestro> findAll();//buscar todos
    public void save(maestro Maestro);//guardar
    public maestro findOne(Long id); //buscar uno
    public void delete (Long id); //borrar por id
}

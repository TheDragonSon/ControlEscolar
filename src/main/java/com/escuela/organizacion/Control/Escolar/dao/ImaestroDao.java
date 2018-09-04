package com.escuela.organizacion.Control.Escolar.dao;

import com.escuela.organizacion.Control.Escolar.entity.maestro;

import java.util.List;

public interface ImaestroDao {

    public List<maestro> findAllMaestros();//buscar todos
    public void save(maestro Maestro);//guardar
    public maestro findOneMaestro(Long id); //buscar uno
    public void delete (Long id); //borrar por id
}

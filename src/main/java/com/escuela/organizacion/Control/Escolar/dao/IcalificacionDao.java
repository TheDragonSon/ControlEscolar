package com.escuela.organizacion.Control.Escolar.dao;

import com.escuela.organizacion.Control.Escolar.entity.calificacion;

import java.util.List;

public interface IcalificacionDao {

    public List<calificacion> findAll();//buscar todos
    public void save(calificacion Calificacion);//guardar
    public calificacion findOne(Long id); //buscar uno
    public void delete (Long id); //borrar por id

}

package com.escuela.organizacion.Control.Escolar.dao;

import com.escuela.organizacion.Control.Escolar.entity.usuario;

import java.util.List;

public interface IusuariosDao {



    public List<usuario> findAll();//buscar todos
    public void save(usuario Usuario);//guardar
    public usuario findOne(Long id); //buscar uno
    public void delete (Long id); //borrar por id
    public List login (String clave, String contrasenia);




}

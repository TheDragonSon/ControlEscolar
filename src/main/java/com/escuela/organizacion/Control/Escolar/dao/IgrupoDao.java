package com.escuela.organizacion.Control.Escolar.dao;

import com.escuela.organizacion.Control.Escolar.entity.grupo;

import java.util.List;

public interface IgrupoDao {

    public List<grupo> findAllgrupos();//buscar todos
    public void save(grupo Grupos);//guardar
    public grupo findOneGrupo(Long id); //buscar uno
    public void delete (Long id); //borrar por id
}

package com.escuela.organizacion.Control.Escolar.dao;

import com.escuela.organizacion.Control.Escolar.entity.alumno;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class alumnoImpl {
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    public List<alumno> findAllAlumnos() {

        return em.createQuery("from alumno").getResultList();
    }





}

package com.escuela.organizacion.Control.Escolar.dao;

import com.escuela.organizacion.Control.Escolar.entity.alumno;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class alumnoImpl implements IalumnoDao {
    private EntityManager em;


    @Transactional(readOnly = true)
    public List<alumno> findAll() {

        return em.createQuery("from alumno").getResultList();
    }


    @Transactional
    public void save(alumno Alumno) {
        System.out.println(Alumno.getId());
        if (Alumno.getId() != null && Alumno.getId() > 0) {
            em.merge(Alumno);

        } else {
            em.persist(Alumno);
        }


    }


    @Transactional(readOnly = true)
    public alumno findOne(Long id) {
        return em.find(alumno.class, id);
    }

    @Transactional
    public void delete(Long id) {
        em.remove(findOne(id));
    }



}

package com.escuela.organizacion.Control.Escolar.dao;


import com.escuela.organizacion.Control.Escolar.entity.maestro;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class maestroImpl implements  ImaestroDao{

    private EntityManager em;


    @Transactional(readOnly = true)
    public List<maestro> findAll() {

        return em.createQuery("from maestro").getResultList();
    }


    @Transactional
    public void save(maestro Maestro) {
        System.out.println(Maestro.getId());
        if (Maestro.getId() != null && Maestro.getId() > 0) {
            em.merge(Maestro);

        } else {
            em.persist(Maestro);
        }


    }


    @Transactional(readOnly = true)
    public maestro findOne(Long id) {
        return em.find(maestro.class, id);
    }

    @Transactional
    public void delete(Long id) {
        em.remove(findOne(id));
    }






}

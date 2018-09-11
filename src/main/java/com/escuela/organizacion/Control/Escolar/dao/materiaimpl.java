package com.escuela.organizacion.Control.Escolar.dao;

import com.escuela.organizacion.Control.Escolar.entity.materia;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class materiaimpl implements  ImateriaDao {


    @PersistenceContext
    private EntityManager em;

    @Override
    public List<materia> findAll() {
        return null;
    }


    @Transactional
    public void save(materia Materia) {

        System.out.println(Materia.getId());
        if (Materia.getId() != null && Materia.getId() > 0) {
            em.merge(Materia);

        } else {
            em.persist(Materia);
        }

    }

    public materia findOne(Long id) {
        return em.find(materia.class, id);
    }

    @Override
    public void delete(Long id) {
        em.remove(findOne(id));
    }
}


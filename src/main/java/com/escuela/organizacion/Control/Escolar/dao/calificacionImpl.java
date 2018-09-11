package com.escuela.organizacion.Control.Escolar.dao;

import com.escuela.organizacion.Control.Escolar.entity.calificacion;
import com.escuela.organizacion.Control.Escolar.entity.grupo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class calificacionImpl implements IcalificacionDao {

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<calificacion> findAll() {
        return em.createQuery("from grupo").getResultList();
    }

    @Override
    public void save(calificacion Calificacion) {
        System.out.println(Calificacion.getId());
        if (Calificacion.getId() != null && Calificacion.getId() > 0) {
            em.merge(Calificacion);

        } else {
            em.persist(Calificacion);
        }


    }

    @Override
    public calificacion findOne(Long id) {
        return em.find(calificacion.class, id);
    }

    @Override
    public void delete(Long id) {

        em.remove(findOne(id));
    }
}

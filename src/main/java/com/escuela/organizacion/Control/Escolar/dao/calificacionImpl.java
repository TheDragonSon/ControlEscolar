package com.escuela.organizacion.Control.Escolar.dao;

import com.escuela.organizacion.Control.Escolar.entity.calificacion;
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
        return null;
    }

    @Override
    public void save(calificacion Calificacion) {
        System.out.println(Calificacion.getClass());
        if (Calificacion.getClass() != null && Calificacion.getId() > 0) {
            em.merge(Calificacion);

        } else {
            em.persist(Calificacion);
        }


    }

    @Override
    public calificacion findOne(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

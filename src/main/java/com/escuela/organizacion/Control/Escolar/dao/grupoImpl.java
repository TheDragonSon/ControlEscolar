package com.escuela.organizacion.Control.Escolar.dao;


import com.escuela.organizacion.Control.Escolar.entity.grupo;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class grupoImpl implements  IgrupoDao {

    private EntityManager em;

    @Transactional(readOnly = true)
    public List<grupo> findAllgrupos() {
        return em.createQuery("from grupo").getResultList();
    }

    @Transactional
    public void save(grupo Grupo) {
        System.out.println(Grupo.getId());
        if (Grupo.getId() != null && Grupo.getId() > 0) {
            em.merge(Grupo);

        } else {
            em.persist(Grupo);
        }

    }

    @Transactional
    public grupo findOneGrupo(Long id) {

            return em.find(grupo.class, id);

    }

    @Transactional
    public void delete(Long id) {

        em.remove(findOneGrupo(id));
    }
}

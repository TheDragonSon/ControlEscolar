package com.escuela.organizacion.Control.Escolar.dao;



import com.escuela.organizacion.Control.Escolar.entity.usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class usuarioImpl implements  IusuariosDao {


    private EntityManager em;

    @Override
    public List<usuario> findAll() {
        return em.createQuery("from usuario").getResultList();
    }

    @Override
    public void save(usuario Usuario) {

        System.out.println(Usuario.getId());
        if (Usuario.getId() != null && Usuario.getId() > 0) {
            em.merge(Usuario);

        } else {
            em.persist(Usuario);
        }

    }

    @Override
    public usuario findOne(Long id) {

        return em.find(usuario.class, id);
    }

    @Override
    public void delete(Long id) {
        em.remove(findOne(id));
    }
}

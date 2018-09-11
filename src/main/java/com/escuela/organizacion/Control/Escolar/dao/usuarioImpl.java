package com.escuela.organizacion.Control.Escolar.dao;



import com.escuela.organizacion.Control.Escolar.entity.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class usuarioImpl implements  IusuariosDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<usuario> findAll() {
        return em.createQuery("from usuario").getResultList();
    }

    @Transactional
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

    @Transactional
    public List login(String clave, String contrasenia) {


        return em.createQuery("select u.clave from usuario u where u.clave like ?1 and contrasenia like ?2")
                .setParameter(1,clave)
                .setParameter(2,contrasenia)
                .getResultList();

    }
}

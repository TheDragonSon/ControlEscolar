package com.escuela.organizacion.Control.Escolar.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Transient;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class administrativoImpl implements IadministrativoDao{

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public List login(String clave, String contrasenia) {


        return em.createQuery("select u.nombre from usuario u where u.clave like ?1 and contrasenia like ?2")
                .setParameter(1,clave)
                .setParameter(2,contrasenia)
                .getResultList();

    }
}

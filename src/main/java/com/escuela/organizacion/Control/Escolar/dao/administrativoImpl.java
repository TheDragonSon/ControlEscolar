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


}

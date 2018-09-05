//package com.escuela.organizacion.Control.Escolar.dao;
//
//import com.escuela.organizacion.Control.Escolar.entity.alumno;
//import com.escuela.organizacion.Control.Escolar.entity.maestro;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityManager;
//import java.util.List;
//
//public class maestroImpl implements  ImaestroDao{
//    private EntityManager em;
//
//
//    @Transactional(readOnly = true)
//    public List<maestro> findAll() {
//
//        return em.createQuery("from maestro").getResultList();
//    }
//
//
//    @Transactional
//    public void save(maestro Alumno) {
//        System.out.println(Alumno.getId());
//        if (Alumno.getId() != null && Alumno.getId() > 0) {
//            em.merge(Alumno);
//
//        } else {
//            em.persist(Alumno);
//        }
//
//
//    }
//
//
//    @Transactional(readOnly = true)
//    public alumno findOne(Long id) {
//        return em.find(alumno.class, id);
//    }
//
//    @Transactional
//    public void delete(Long id) {
//        em.remove(findOne(id));
//    }
//
//
//
//}

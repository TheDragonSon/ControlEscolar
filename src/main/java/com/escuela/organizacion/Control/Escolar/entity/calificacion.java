package com.escuela.organizacion.Control.Escolar.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "calificaciones")
public class calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotEmpty
    private long idalumno;

    @NotEmpty
    private long idgrupo;

    @NotEmpty
    private String idmaestro;

    @NotEmpty
    private int calif;




}

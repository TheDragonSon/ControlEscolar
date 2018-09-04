package com.escuela.organizacion.Control.Escolar.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "grupos")
public class grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String maestroEncargado;

    @NotEmpty
    private String materia1;

    @NotEmpty
    private String materia2;

    @NotEmpty
    private String materia3;

    @NotEmpty
    private String materia4;

    @NotEmpty
    private String materia5;

    @NotEmpty
    private String materia6;

    @NotEmpty
    private String materia7;

    @NotEmpty
    private String materia8;

    @NotEmpty
    private String materia9;

    @NotEmpty
    private String materia10;

}

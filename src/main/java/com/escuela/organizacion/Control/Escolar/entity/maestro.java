package com.escuela.organizacion.Control.Escolar.entity;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "maestros")
public class maestro {

    private static final long serialVersionUID=1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotEmpty
    private String nombre;

    @NotEmpty
    private String RFC;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String materia1;

    @NotEmpty
    private String materia2;







}

package com.escuela.organizacion.Control.Escolar.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "alumnos")
public class alumno implements Serializable {
    private static final long serialVersionUID=1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotEmpty
    private String nombre;

    @NotEmpty
    private int edad;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String observaciones;





}

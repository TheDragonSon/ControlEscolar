

package com.escuela.organizacion.Control.Escolar.entity;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "materias")
public class materia {

    private static final long serialVersionUID=1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotEmpty
    private String nombre;

    @NotEmpty
    private int puntos;

    @NotEmpty
    private String grupo;

    @NotEmpty
    private long idProfesor;






}

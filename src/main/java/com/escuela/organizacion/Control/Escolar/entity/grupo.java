package com.escuela.organizacion.Control.Escolar.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "grupos")
public class grupo implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String maestroEncargado;

    @NotEmpty
    private String maestro1;

    @NotEmpty
    private String maestro2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaestroEncargado() {
        return maestroEncargado;
    }

    public void setMaestroEncargado(String maestroEncargado) {
        this.maestroEncargado = maestroEncargado;
    }

    public String getMaestro1() {
        return maestro1;
    }

    public void setMaestro1(String maestro1) {
        this.maestro1 = maestro1;
    }

    public String getMaestro2() {
        return maestro2;
    }

    public void setMaestro2(String maestro2) {
        this.maestro2 = maestro2;
    }
}

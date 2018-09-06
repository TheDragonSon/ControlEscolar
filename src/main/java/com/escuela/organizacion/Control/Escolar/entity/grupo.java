package com.escuela.organizacion.Control.Escolar.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "grupos")
public class grupo {

    private static final long serialVersionUID=1L;

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

    public String getMateria1() {
        return materia1;
    }

    public void setMateria1(String materia1) {
        this.materia1 = materia1;
    }

    public String getMateria2() {
        return materia2;
    }

    public void setMateria2(String materia2) {
        this.materia2 = materia2;
    }

    public String getMateria3() {
        return materia3;
    }

    public void setMateria3(String materia3) {
        this.materia3 = materia3;
    }

    public String getMateria4() {
        return materia4;
    }

    public void setMateria4(String materia4) {
        this.materia4 = materia4;
    }

    public String getMateria5() {
        return materia5;
    }

    public void setMateria5(String materia5) {
        this.materia5 = materia5;
    }

    public String getMateria6() {
        return materia6;
    }

    public void setMateria6(String materia6) {
        this.materia6 = materia6;
    }

    public String getMateria7() {
        return materia7;
    }

    public void setMateria7(String materia7) {
        this.materia7 = materia7;
    }

    public String getMateria8() {
        return materia8;
    }

    public void setMateria8(String materia8) {
        this.materia8 = materia8;
    }

    public String getMateria9() {
        return materia9;
    }

    public void setMateria9(String materia9) {
        this.materia9 = materia9;
    }

    public String getMateria10() {
        return materia10;
    }

    public void setMateria10(String materia10) {
        this.materia10 = materia10;
    }
}

package com.escuela.organizacion.Control.Escolar.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "calificaciones")
public class calificacion implements Serializable {

    private static final long serialVersionUID=1L;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(long idalumno) {
        this.idalumno = idalumno;
    }

    public long getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(long idgrupo) {
        this.idgrupo = idgrupo;
    }

    public String getIdmaestro() {
        return idmaestro;
    }

    public void setIdmaestro(String idmaestro) {
        this.idmaestro = idmaestro;
    }

    public int getCalif() {
        return calif;
    }

    public void setCalif(int calif) {
        this.calif = calif;
    }
}

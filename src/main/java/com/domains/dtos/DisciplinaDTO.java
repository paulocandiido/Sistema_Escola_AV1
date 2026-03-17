package com.domains.dtos;

import java.io.Serializable;

public class DisciplinaDTO implements Serializable {

    private Integer id;
    private String nome;
    private Integer professorId;
    private Integer cursoId;

    public DisciplinaDTO() {
    }

    public DisciplinaDTO(Integer id, String nome, Integer professorId, Integer cursoId) {
        this.id = id;
        this.nome = nome;
        this.professorId = professorId;
        this.cursoId = cursoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
    }

    public Integer getCursoId() {
        return cursoId;
    }

    public void setCursoId(Integer cursoId) {
        this.cursoId = cursoId;
    }
}

package com.domains.dtos;


import java.io.Serializable;
import java.time.LocalDate;

public class MatriculaDTO implements Serializable {

    private Integer id;
    private LocalDate dataMatricula;
    private Integer alunoId;
    private Integer cursoId;

    public MatriculaDTO() {
    }

    public MatriculaDTO(Integer id, LocalDate dataMatricula, Integer alunoId, Integer cursoId) {
        this.id = id;
        this.dataMatricula = dataMatricula;
        this.alunoId = alunoId;
        this.cursoId = cursoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Integer getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Integer alunoId) {
        this.alunoId = alunoId;
    }

    public Integer getCursoId() {
        return cursoId;
    }

    public void setCursoId(Integer cursoId) {
        this.cursoId = cursoId;
    }
}

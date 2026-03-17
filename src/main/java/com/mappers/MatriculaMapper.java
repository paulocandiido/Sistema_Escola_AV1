package com.mappers;

import com.domains.Aluno;
import com.domains.Curso;
import com.domains.Matricula;
import com.domains.dtos.MatriculaDTO;

public class MatriculaMapper {

    public static Matricula toEntity(MatriculaDTO dto) {

        Aluno aluno = new Aluno();
        aluno.setId(dto.getAlunoId());

        Curso curso = new Curso();
        curso.setId(dto.getCursoId());

        return new Matricula(
                dto.getId(),
                dto.getDataMatricula(),
                aluno,
                curso
        );
    }

    public static MatriculaDTO toDTO(Matricula matricula) {
        return new MatriculaDTO(
                matricula.getId(),
                matricula.getDataMatricula(),
                matricula.getAluno().getId(),
                matricula.getCurso().getId()
        );
    }
}

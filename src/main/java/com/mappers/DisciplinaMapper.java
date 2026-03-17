package com.mappers;

import com.domains.Curso;
import com.domains.Disciplina;
import com.domains.Professor;
import com.domains.dtos.DisciplinaDTO;

public class DisciplinaMapper {

    public static Disciplina toEntity(DisciplinaDTO dto) {

        Professor professor = new Professor();
        professor.setId(dto.getProfessorId());

        Curso curso = new Curso();
        curso.setId(dto.getCursoId());

        return new Disciplina(
                dto.getId(),
                dto.getNome(),
                professor,
                curso
        );
    }

    public static DisciplinaDTO toDTO(Disciplina disciplina) {
        return new DisciplinaDTO(
                disciplina.getId(),
                disciplina.getNome(),
                disciplina.getProfessor().getId(),
                disciplina.getCurso().getId()
        );
    }
}

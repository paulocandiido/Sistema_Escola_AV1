package com.mappers;

import com.domains.Professor;
import com.domains.dtos.ProfessorDTO;

public class ProfessorMapper {

    public static Professor toEntity(ProfessorDTO dto) {
        return new Professor(
                dto.getId(),
                dto.getNome(),
                dto.getEspecialidade()
        );
    }

    public static ProfessorDTO toDTO(Professor professor) {
        return new ProfessorDTO(
                professor.getId(),
                professor.getNome(),
                professor.getEspecialidade()
        );
    }
}

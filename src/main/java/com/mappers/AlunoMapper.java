package com.mappers;

import com.domains.Aluno;
import com.domains.dtos.AlunoDTO;

public class AlunoMapper {

    public static Aluno toEntity(AlunoDTO dto) {
        return new Aluno(
                dto.getId(),
                dto.getNome(),
                dto.getEmail(),
                dto.getIdade()
        );
    }

    public static AlunoDTO toDTO(Aluno aluno) {
        return new AlunoDTO(
                aluno.getId(),
                aluno.getNome(),
                aluno.getEmail(),
                aluno.getIdade()
        );
    }
}

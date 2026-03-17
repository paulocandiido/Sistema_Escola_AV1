package com.mappers;

import com.domains.Curso;
import com.domains.dtos.CursoDTO;

public class CursoMapper {

    public static Curso toEntity(CursoDTO dto) {
        return new Curso(
                dto.getId(),
                dto.getNome(),
                dto.getDescricao(),
                dto.getCargaHoraria()
        );
    }

    public static CursoDTO toDTO(Curso curso) {
        return new CursoDTO(
                curso.getId(),
                curso.getNome(),
                curso.getDescricao(),
                curso.getCargaHoraria()
        );
    }
}
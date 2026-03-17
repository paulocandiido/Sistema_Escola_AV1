package com.services;

import com.domains.Curso;
import com.domains.dtos.CursoDTO;
import com.mappers.CursoMapper;
import com.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repository;

    public List<CursoDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(CursoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public CursoDTO findById(Integer id) {
        Curso curso = repository.findById(id).orElse(null);
        return CursoMapper.toDTO(curso);
    }

    public CursoDTO create(CursoDTO dto) {
        Curso curso = CursoMapper.toEntity(dto);
        curso = repository.save(curso);
        return CursoMapper.toDTO(curso);
    }

    public CursoDTO update(Integer id, CursoDTO dto) {
        dto.setId(id);
        Curso curso = repository.save(CursoMapper.toEntity(dto));
        return CursoMapper.toDTO(curso);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

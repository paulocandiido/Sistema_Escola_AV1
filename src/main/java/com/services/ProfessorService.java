package com.services;

import com.domains.Professor;
import com.domains.dtos.ProfessorDTO;
import com.mappers.ProfessorMapper;
import com.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    public List<ProfessorDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(ProfessorMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ProfessorDTO findById(Integer id) {
        Professor professor = repository.findById(id).orElse(null);
        return ProfessorMapper.toDTO(professor);
    }

    public ProfessorDTO create(ProfessorDTO dto) {
        Professor professor = ProfessorMapper.toEntity(dto);
        professor = repository.save(professor);
        return ProfessorMapper.toDTO(professor);
    }

    public ProfessorDTO update(Integer id, ProfessorDTO dto) {
        dto.setId(id);
        Professor professor = repository.save(ProfessorMapper.toEntity(dto));
        return ProfessorMapper.toDTO(professor);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

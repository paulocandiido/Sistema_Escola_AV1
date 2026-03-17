package com.services;

import com.domains.Disciplina;
import com.domains.dtos.DisciplinaDTO;
import com.mappers.DisciplinaMapper;
import com.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository repository;

    public List<DisciplinaDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(DisciplinaMapper::toDTO)
                .collect(Collectors.toList());
    }

    public DisciplinaDTO findById(Integer id) {
        Disciplina disciplina = repository.findById(id).orElse(null);
        return DisciplinaMapper.toDTO(disciplina);
    }

    public DisciplinaDTO create(DisciplinaDTO dto) {
        Disciplina disciplina = DisciplinaMapper.toEntity(dto);
        disciplina = repository.save(disciplina);
        return DisciplinaMapper.toDTO(disciplina);
    }

    public DisciplinaDTO update(Integer id, DisciplinaDTO dto) {
        dto.setId(id);
        Disciplina disciplina = repository.save(DisciplinaMapper.toEntity(dto));
        return DisciplinaMapper.toDTO(disciplina);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

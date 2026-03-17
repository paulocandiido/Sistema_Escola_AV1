package com.services;

import com.domains.Aluno;
import com.domains.dtos.AlunoDTO;
import com.mappers.AlunoMapper;
import com.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<AlunoDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(AlunoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public AlunoDTO findById(Integer id) {
        Aluno aluno = repository.findById(id).orElse(null);
        return AlunoMapper.toDTO(aluno);
    }

    public AlunoDTO create(AlunoDTO dto) {
        Aluno aluno = AlunoMapper.toEntity(dto);
        aluno = repository.save(aluno);
        return AlunoMapper.toDTO(aluno);
    }

    public AlunoDTO update(Integer id, AlunoDTO dto) {
        dto.setId(id);
        Aluno aluno = repository.save(AlunoMapper.toEntity(dto));
        return AlunoMapper.toDTO(aluno);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

package com.services;

import com.domains.Matricula;
import com.domains.dtos.MatriculaDTO;
import com.mappers.MatriculaMapper;
import com.repositories.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository repository;

    public List<MatriculaDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(MatriculaMapper::toDTO)
                .collect(Collectors.toList());
    }

    public MatriculaDTO findById(Integer id) {
        Matricula matricula = repository.findById(id).orElse(null);
        return MatriculaMapper.toDTO(matricula);
    }

    public MatriculaDTO create(MatriculaDTO dto) {
        Matricula matricula = MatriculaMapper.toEntity(dto);
        matricula = repository.save(matricula);
        return MatriculaMapper.toDTO(matricula);
    }

    public MatriculaDTO update(Integer id, MatriculaDTO dto) {
        dto.setId(id);
        Matricula matricula = repository.save(MatriculaMapper.toEntity(dto));
        return MatriculaMapper.toDTO(matricula);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}

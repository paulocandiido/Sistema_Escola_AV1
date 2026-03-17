package com.resources;

import com.domains.dtos.AlunoDTO;
import com.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoResource {

    @Autowired
    private AlunoService service;

    @GetMapping
    public List<AlunoDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public AlunoDTO findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public AlunoDTO create(@RequestBody AlunoDTO dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public AlunoDTO update(@PathVariable Integer id, @RequestBody AlunoDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
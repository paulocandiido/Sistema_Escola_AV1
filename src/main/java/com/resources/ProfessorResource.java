package com.resources;

import com.domains.dtos.ProfessorDTO;
import com.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorResource {

    @Autowired
    private ProfessorService service;

    @GetMapping
    public List<ProfessorDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ProfessorDTO findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public ProfessorDTO create(@RequestBody ProfessorDTO dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public ProfessorDTO update(@PathVariable Integer id, @RequestBody ProfessorDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
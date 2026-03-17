package com.resources;

import com.domains.dtos.CursoDTO;
import com.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoResource {

    @Autowired
    private CursoService service;

    @GetMapping
    public List<CursoDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public CursoDTO findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public CursoDTO create(@RequestBody CursoDTO dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public CursoDTO update(@PathVariable Integer id, @RequestBody CursoDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}

package com.resources;

import com.domains.dtos.MatriculaDTO;
import com.services.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaResource {

    @Autowired
    private MatriculaService service;

    @GetMapping
    public List<MatriculaDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public MatriculaDTO findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public MatriculaDTO create(@RequestBody MatriculaDTO dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public MatriculaDTO update(@PathVariable Integer id, @RequestBody MatriculaDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}

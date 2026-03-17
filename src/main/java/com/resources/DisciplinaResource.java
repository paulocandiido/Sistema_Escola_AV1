package com.resources;


import com.domains.dtos.DisciplinaDTO;
import com.services.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaResource {

    @Autowired
    private DisciplinaService service;

    @GetMapping
    public List<DisciplinaDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public DisciplinaDTO findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public DisciplinaDTO create(@RequestBody DisciplinaDTO dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public DisciplinaDTO update(@PathVariable Integer id, @RequestBody DisciplinaDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}

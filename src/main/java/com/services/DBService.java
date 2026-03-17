package com.services;

import com.domains.*;
import com.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Autowired
    private MatriculaRepository matriculaRepository;

    public void initDB() {


        Professor p1 = new Professor(null, "Jefferson Passerini", "Programação");
        Professor p2 = new Professor(null, "Guilherme Moraes", "Engenharia");

        professorRepository.saveAll(Arrays.asList(p1, p2));


        Curso c1 = new Curso(null, "Engenharia Produção", "Curso de Engenharia Produção", 4000);
        Curso c2 = new Curso(null, "Sistemas de Informação", "Curso de Sistemas de Informação", 3200);

        cursoRepository.saveAll(Arrays.asList(c1, c2));


        Aluno a1 = new Aluno(null, "Paulo", "paulin@email.com", 20);
        Aluno a2 = new Aluno(null, "Candido", "candin@email.com", 22);

        alunoRepository.saveAll(Arrays.asList(a1, a2));


        Disciplina d1 = new Disciplina(null, "Laboratorio de Programação", p1, c1);
        Disciplina d2 = new Disciplina(null, "Sistemas de Informação", p2, c2);

        disciplinaRepository.saveAll(Arrays.asList(d1, d2));

        Matricula m1 = new Matricula(null, LocalDate.now(), a1, c1);
        Matricula m2 = new Matricula(null, LocalDate.now(), a2, c2);

        matriculaRepository.saveAll(Arrays.asList(m1, m2));
    }
}

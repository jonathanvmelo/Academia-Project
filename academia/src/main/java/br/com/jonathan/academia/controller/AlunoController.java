package br.com.jonathan.academia.controller;

import br.com.jonathan.academia.entity.Aluno;
import br.com.jonathan.academia.entity.AvaliacaoFisica;
import br.com.jonathan.academia.entity.form.AlunoForm;
import br.com.jonathan.academia.service.impl.AlunoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form) {
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisicaId(id);
    }

    @GetMapping
    public List<Aluno> getAll(@RequestParam()
                              String dataDeNacimento){
        return service.getAll(dataDeNacimento);
    }


}

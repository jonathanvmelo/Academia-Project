package br.com.jonathan.academia.controller;

import br.com.jonathan.academia.entity.Matricula;
import br.com.jonathan.academia.entity.form.MatriculaForm;
import br.com.jonathan.academia.service.impl.MatriculaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl matriculaService;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm matriculaForm){
        return matriculaService.create(matriculaForm);
    }

    @GetMapping
    public List<Matricula> getAll(){
        return matriculaService.getAll();
    }
}

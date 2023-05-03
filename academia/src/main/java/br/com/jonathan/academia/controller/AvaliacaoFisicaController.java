package br.com.jonathan.academia.controller;

import br.com.jonathan.academia.entity.AvaliacaoFisica;
import br.com.jonathan.academia.entity.form.AvaliacaoFisicaForm;
import br.com.jonathan.academia.service.impl.AvaliacaoFisicaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacaofisica")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl avaliacao;

    @PostMapping
    public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaForm fisicaForm){
        return avaliacao.create(fisicaForm);
    }

    @GetMapping
    public List<AvaliacaoFisica> getAll(){
        return avaliacao.getAll();
    }


}

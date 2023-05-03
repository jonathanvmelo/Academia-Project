package br.com.jonathan.academia.service.impl;

import br.com.jonathan.academia.entity.Matricula;
import br.com.jonathan.academia.entity.form.MatriculaForm;
import br.com.jonathan.academia.service.IMatriculaService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Override
    public Matricula create(MatriculaForm form) {
        return null;
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

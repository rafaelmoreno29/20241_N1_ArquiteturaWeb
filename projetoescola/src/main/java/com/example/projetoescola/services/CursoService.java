package com.example.projetoescola.services;

import java.util.List;

import com.example.projetoescola.dtos.CursoDTO;
import com.example.projetoescola.dtos.DadosCursoDTO;
import com.example.projetoescola.models.Curso;

public interface CursoService {
    Curso salvar(CursoDTO cursoDTO);

    List<DadosCursoDTO> listarTodos();
}

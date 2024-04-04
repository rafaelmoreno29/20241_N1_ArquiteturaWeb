package com.example.projetoescola.services;

import com.example.projetoescola.dtos.CursoDTO;
import com.example.projetoescola.models.Curso;

public interface CursoService {
    Curso salvar(CursoDTO cursoDTO);
}

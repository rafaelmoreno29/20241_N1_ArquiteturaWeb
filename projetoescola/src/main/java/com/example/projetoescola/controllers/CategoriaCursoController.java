package com.example.projetoescola.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.projetoescola.models.CategoriaCurso;
import com.example.projetoescola.repositories.CategoriaCursoRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/categoria-curso")
public class CategoriaCursoController {
    private CategoriaCursoRepository categoriaCursoRepository;

    public CategoriaCursoController(
            CategoriaCursoRepository categoriaCursoRepository) {
        this.categoriaCursoRepository = categoriaCursoRepository;
    }

    @GetMapping()
    public List<CategoriaCurso> obterTodos() {
        return categoriaCursoRepository.findAll();
    }

    @PostMapping()
    public void inserir(@RequestBody CategoriaCurso categoria) {
        categoriaCursoRepository.save(categoria);
    }

}

package com.example.projetoescola.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DadosCursoDTO {
    private Long id;
    private String nome;
    private Integer cargaHoraria;
    private CategoriaCursoDTO categoriaCurso;
}

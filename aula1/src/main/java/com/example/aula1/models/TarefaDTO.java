package com.example.aula1.models;

import java.time.LocalDateTime;

public class TarefaDTO {
    private String nome;
    private LocalDateTime dataHora;

    public TarefaDTO(String nome, LocalDateTime dataHora) {
        this.nome = nome;
        this.dataHora = dataHora;
    }

    public TarefaDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}

package com.example.aula1;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.aula1.models.TarefaDTO;

@Configuration
public class MinhaConfiguracao {

    @Bean(name = "versao")
    public String versao() {
        return "1.0.0";
    }

    @Bean(name = "nome")
    public String nome() {
        return "Programa Aula 2";
    }

    @Bean
    public List<TarefaDTO> tarefas() {
        return List.of(
                new TarefaDTO("Tarefa 1", LocalDateTime.now()),
                new TarefaDTO("Tarefa 2", LocalDateTime.now()));
    }
}

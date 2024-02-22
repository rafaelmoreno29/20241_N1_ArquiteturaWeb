package com.example.aula1;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    @GetMapping()
    public List<String> obterTarefas() {
        List<String> tarefas = List.of("Estudar Spring Boot",
                "Estudar Java",
                "Estudar Spring MVC");
        return tarefas;
    }

    @GetMapping("obterPorId")
    public String obterPorId(@RequestParam int id) {
        return "O Id informado foi: " + id;
    }

    @GetMapping("{id}")
    public String obterPorId2(@PathVariable(name = "id") int id) {
        return "O Id informado foi: " + id;
    }
}

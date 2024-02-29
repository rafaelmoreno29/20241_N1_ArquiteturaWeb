package com.example.aula1;

import org.springframework.web.bind.annotation.RestController;

import com.example.aula1.models.TarefaDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    @Qualifier("versao")
    private String versao;

    @Autowired
    private List<TarefaDTO> tarefas;

    @GetMapping("/listar")
    public List<TarefaDTO> listarTarefas() {
        return tarefas;
    }

    @GetMapping("/versao")
    public String obterVersao() {
        return "A versão do sistema é: " + versao;
    }

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

    @PostMapping()
    public String inserirTarefa(@RequestBody TarefaDTO tarefa) {
        return "A tarefa " + tarefa.getNome() + " foi inserida com sucesso!";
    }

}

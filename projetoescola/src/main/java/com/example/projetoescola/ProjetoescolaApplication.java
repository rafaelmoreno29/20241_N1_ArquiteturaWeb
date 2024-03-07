package com.example.projetoescola;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.projetoescola.models.Curso;
import com.example.projetoescola.repositories.CursoRepository;

@SpringBootApplication
public class ProjetoescolaApplication {

	@Bean
	public CommandLineRunner init(@Autowired CursoRepository cursoRepository) {
		return args -> {
			cursoRepository.inserir(new Curso(0l, "teste", 2000));
			cursoRepository.inserir(new Curso(0l, "teste2", 2050));

			System.out.println("Exemplo Listar todos");
			List<Curso> listaCursos = cursoRepository.obterTodos();
			listaCursos.forEach(System.out::println);

			System.out.println("Exemplo Listar por nome");
			listaCursos = cursoRepository.obterPorNome("teste2");
			listaCursos.forEach(System.out::println);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoescolaApplication.class, args);
	}

}

package com.example.projetoescola;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.projetoescola.models.CategoriaCurso;
import com.example.projetoescola.models.Curso;
import com.example.projetoescola.repositories.CategoriaCursoRepository;
import com.example.projetoescola.repositories.CursoRepository;

@SpringBootApplication
public class ProjetoescolaApplication {

	@Bean
	public CommandLineRunner init(@Autowired CursoRepository cursoRepository,
			@Autowired CategoriaCursoRepository categoriaCursoRepository) {
		return args -> {
			categoriaCursoRepository.inserir(new CategoriaCurso(0, "Tecnólogo"));
			categoriaCursoRepository.inserir(new CategoriaCurso(0, "Bacharelado"));

			System.out.println("*** Listar todas as categorias ***");
			List<CategoriaCurso> listaCategorias = categoriaCursoRepository.obterTodos();
			listaCategorias.forEach(System.out::println);

			cursoRepository.inserir(new Curso(0l, "Análise e Desenvolvimento de sistemas", 2000));
			cursoRepository.inserir(new Curso(0l, "Sistemas de Informação", 2050));

			System.out.println("Exemplo Listar todos");
			List<Curso> listaCursos = cursoRepository.obterTodos();
			listaCursos.forEach(System.out::println);

			Curso cADS = listaCursos.get(0);
			Curso cSI = listaCursos.get(1);
			cADS.setCategoriaCurso(listaCategorias.get(0));
			cSI.setCategoriaCurso(listaCategorias.get(1));
			cursoRepository.inserir(cADS);
			cursoRepository.inserir(cSI);

			System.out.println("Exemplo Listar por nome");
			listaCursos = cursoRepository.obterPorNome("Sistemas de Informação");
			listaCursos.forEach(System.out::println);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoescolaApplication.class, args);
	}

}

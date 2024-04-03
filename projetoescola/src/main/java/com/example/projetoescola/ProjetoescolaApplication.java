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
			categoriaCursoRepository.save(new CategoriaCurso(0, "Tecnólogo"));
			categoriaCursoRepository.save(new CategoriaCurso(0, "Bacharelado"));

			System.out.println("*** Listar todas as categorias ***");
			List<CategoriaCurso> listaCategorias = categoriaCursoRepository.findAll();
			listaCategorias.forEach(System.out::println);

			cursoRepository.save(new Curso(0l, "Análise e Desenvolvimento de sistemas", 2000));
			cursoRepository.save(new Curso(0l, "Sistemas de Informação", 2050));

			System.out.println("Exemplo Listar todos");
			List<Curso> listaCursos = cursoRepository.findAll();
			listaCursos.forEach(System.out::println);

			Curso cADS = listaCursos.get(0);
			Curso cSI = listaCursos.get(1);
			cADS.setCategoriaCurso(listaCategorias.get(0));
			cSI.setCategoriaCurso(listaCategorias.get(1));
			cursoRepository.save(cADS);
			cursoRepository.save(cSI);

			System.out.println("*** Listar todas as categorias ***");
			CategoriaCurso categ = categoriaCursoRepository.findCategoriaCursoFetchCursos(1l);
			System.out.println(categ.getCursos().size());

			/*
			 * System.out.println("Exemplo Listar por nome");
			 * listaCursos = cursoRepository.findByNome("Sistemas de Informação");
			 * listaCursos.forEach(System.out::println);
			 * 
			 * System.out.println("Exemplo Listar maior ou igual a 2000");
			 * listaCursos = cursoRepository.findByCargaHorariaGreaterThanEqual(2000);
			 * listaCursos.forEach(System.out::println);
			 * 
			 * System.out.println("Exemplo Listar menor ou igual a 2000");
			 * listaCursos = cursoRepository.findByCargaHorariaLessThanEqual(2000);
			 * listaCursos.forEach(System.out::println);
			 */
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoescolaApplication.class, args);
	}

}

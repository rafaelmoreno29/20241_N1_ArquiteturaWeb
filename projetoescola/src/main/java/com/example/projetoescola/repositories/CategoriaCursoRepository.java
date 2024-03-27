package com.example.projetoescola.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projetoescola.models.CategoriaCurso;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

public interface CategoriaCursoRepository extends
        JpaRepository<CategoriaCurso, Integer> {

}
/*
 * @Repository
 * public class CategoriaCursoRepository {
 * 
 * @Autowired
 * private EntityManager entityManager;
 * 
 * @Transactional
 * public void inserir(CategoriaCurso categoriaCurso) {
 * entityManager.merge(categoriaCurso);
 * }
 * 
 * public List<CategoriaCurso> obterTodos() {
 * return entityManager.createQuery("SELECT c FROM CategoriaCurso c",
 * CategoriaCurso.class).getResultList();
 * }
 * }
 */
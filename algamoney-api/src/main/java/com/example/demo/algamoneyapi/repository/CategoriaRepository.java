package com.example.demo.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.algamoneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
}

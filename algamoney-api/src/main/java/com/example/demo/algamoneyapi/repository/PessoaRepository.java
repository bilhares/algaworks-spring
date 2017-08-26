package com.example.demo.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.algamoneyapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Long>{

}

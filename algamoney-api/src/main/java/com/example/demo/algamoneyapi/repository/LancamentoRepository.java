package com.example.demo.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.algamoneyapi.model.Lancamento;
import com.example.demo.algamoneyapi.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}

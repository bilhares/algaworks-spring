package com.example.demo.algamoneyapi.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.algamoneyapi.model.Lancamento;
import com.example.demo.algamoneyapi.repository.filter.LancamentoFilter;
import com.example.demo.algamoneyapi.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter filter, Pageable pageable);

	public Page<ResumoLancamento> resumir(LancamentoFilter filter, Pageable pageable);

}

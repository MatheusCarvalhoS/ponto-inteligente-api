package com.kazale.pontointeligente.api.repositories;

import java.util.List;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.kazale.pontointeligente.api.entities.Lancamento;

@Transactional(readOnly = true) // Rescrevi caso queira colocar mais metodos
@NamedQueries({
		@NamedQuery(name = "LancamentosRepository.findByFuncionarioId", 
				query = "SELECT lanc FROM lancamento lanc WHERE lanc.funcionario.id = :funcionarioId"),
		@NamedQuery(name = "LancamentosRepository.findByFuncionarioId2", 
				query = "SELECT lanc FROM lancamento lanc WHERE lanc.funcionario.id = :funcionarioId"),
		@NamedQuery(name = "LancamentosRepository.findByFuncionarioId3", 
				query = "SELECT lanc FROM lancamento lanc WHERE lanc.funcionario.id = :funcionarioId") })
public interface LancamentoRepository {

	List<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId);

	Page<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId, Pageable pageable);

}

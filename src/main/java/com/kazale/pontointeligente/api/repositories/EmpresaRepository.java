package com.kazale.pontointeligente.api.repositories;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kazale.pontointeligente.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

	@Transactional(readOnly = true) // papeamento para dizer que será somente consulta
	Empresa findByCnpj(String cnpj);
}

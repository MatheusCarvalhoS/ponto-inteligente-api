package com.kazale.pontointeligente.api.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kazale.pontointeligente.api.entities.Empresa;
import com.kazale.pontointeligente.api.repositories.EmpresaRepository;
import com.kazale.pontointeligente.api.services.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {
	
	@Autowired
	EmpresaRepository empresaRpository;   
	
	@Override
	public Optional<Empresa> buscarPorCnpj(String cnpj) {
		return Optional.ofNullable(empresaRpository.findByCnpj(cnpj));
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		return this.empresaRpository.save(empresa);
	}

}

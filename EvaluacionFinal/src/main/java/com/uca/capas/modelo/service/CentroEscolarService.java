package com.uca.capas.modelo.service;


import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.modelo.domain.CentroEscolar;




public interface CentroEscolarService {
	
	public List<CentroEscolar> findAll() throws DataAccessException;
	public List<CentroEscolar> findAllClientes();
	public void insert(CentroEscolar centroEscolar) throws DataAccessException;
	public CentroEscolar findOne(Integer codigo) throws DataAccessException;
	public void updateCliente(CentroEscolar c);

}

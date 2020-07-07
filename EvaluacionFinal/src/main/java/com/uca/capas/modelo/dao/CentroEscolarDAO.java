package com.uca.capas.modelo.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.modelo.domain.CentroEscolar;



public interface CentroEscolarDAO {
	
	public List<CentroEscolar> findAll() throws DataAccessException;
	
	public void insert(CentroEscolar centroEscolar) throws DataAccessException;
	
	public void updateCliente(CentroEscolar c);
}

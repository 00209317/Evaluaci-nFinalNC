package com.uca.capas.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.modelo.domain.CentroEscolar;

import com.uca.capas.modelo.repositories.CentroEscolarRepository;


@Service
public class CentroEscolarServiceImpl implements CentroEscolarService{
	
	@Autowired
	CentroEscolarRepository centroEscolarRepository;
	

	@Override
	public List<CentroEscolar> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CentroEscolar> findAllClientes() {
		return centroEscolarRepository.findAllClientes();
	}


}

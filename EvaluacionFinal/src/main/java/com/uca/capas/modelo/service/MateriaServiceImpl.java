package com.uca.capas.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.uca.capas.modelo.dao.MateriaDAO;
import com.uca.capas.modelo.domain.CentroEscolar;
import com.uca.capas.modelo.domain.Materia;
import com.uca.capas.modelo.repositories.MateriaRepository;

@Service
public class MateriaServiceImpl implements MateriaService{
	
	@Autowired
	MateriaRepository materiaRepository;
	
	@Autowired
	MateriaDAO materiaDAO;

	@Override
	public List<Materia> findAllClientes() {
		return materiaRepository.findAllMateria();
	}

	@Override
	public Materia findOne(Integer codigo) throws DataAccessException {
		return materiaRepository.findOne(codigo);
	}

	@Override
	public void updateMateria(Materia m) {
		materiaDAO.updateMateria(m);
		
	}



}

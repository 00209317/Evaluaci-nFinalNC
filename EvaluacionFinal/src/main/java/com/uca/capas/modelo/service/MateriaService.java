package com.uca.capas.modelo.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.modelo.domain.CentroEscolar;
import com.uca.capas.modelo.domain.Materia;

public interface MateriaService {
	public List<Materia> findAllClientes();
	public Materia findOne(Integer codigo) throws DataAccessException;
	public void updateMateria(Materia m);

}

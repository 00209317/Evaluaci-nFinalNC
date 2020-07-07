package com.uca.capas.modelo.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.modelo.domain.Materia;

public interface MateriaDAO {
	
	public List<Materia> findAll() throws DataAccessException;
	
	public void insert(Materia materia) throws DataAccessException;
	
	public void updateMateria(Materia materia);
}

package com.uca.capas.modelo.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.modelo.domain.Materia;
import com.uca.capas.modelo.domain.Municipio;

public interface MunicipioDAO {
	public List<Municipio> findAll() throws DataAccessException;
	
}

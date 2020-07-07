package com.uca.capas.modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.capas.modelo.domain.Municipio;

@Repository
public class MunicipioDAOImpl implements MunicipioDAO{
	
	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;

	@Override
	public List<Municipio> findAll() throws DataAccessException {
		StringBuffer sbm = new StringBuffer();
		sbm.append("select * from public.municipio ORDER BY c_municipio asc");
		Query query = entityManager.createNativeQuery(sbm.toString(),Municipio.class);
		List<Municipio> resulset = query.getResultList();
		return resulset;
	}

}

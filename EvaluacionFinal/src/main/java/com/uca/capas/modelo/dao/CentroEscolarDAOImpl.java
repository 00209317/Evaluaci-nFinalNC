package com.uca.capas.modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.dao.DataAccessException;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.uca.capas.modelo.domain.CentroEscolar;

@Repository
public class CentroEscolarDAOImpl implements CentroEscolarDAO{
	
	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;

	@Override
	public List<CentroEscolar>findAll() throws DataAccessException{
		//TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.centroescolar");
		Query query = entityManager.createNativeQuery(sb.toString(),CentroEscolar.class);
		List<CentroEscolar> resulset = query.getResultList();
		return resulset;
		
	}

}

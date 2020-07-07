package com.uca.capas.modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uca.capas.modelo.domain.CentroEscolar;

@Repository
public class CentroEscolarDAOImpl implements CentroEscolarDAO{
	
	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<CentroEscolar>findAll() throws DataAccessException{
		//TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("select * from public.centroescolar;");
		Query query = entityManager.createNativeQuery(sb.toString(),CentroEscolar.class);
		List<CentroEscolar> resulset = query.getResultList();
		return resulset;
		
	}

	@Transactional
	public void insert(CentroEscolar centroEscolar) throws DataAccessException {
		entityManager.persist(centroEscolar);
		
	}
	
	private static final String sql = "UPDATE public.centroescolar SET nombrece=?, descripcionce=?, estadoce=? WHERE c_centroescolar=?";
	@Override
	public void updateCliente(CentroEscolar c) {
		System.out.println("estoy antes de new obj");
		Object[] parametros = new Object[] {c.getNombrece(),c.getDescripcionce(),c.getEstadoce(),c.getC_centroescolar()};
		System.out.println("estoy depues de new obj");
		jdbcTemplate.update(sql,parametros);
		
	}

}

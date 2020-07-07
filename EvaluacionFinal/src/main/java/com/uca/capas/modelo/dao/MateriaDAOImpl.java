package com.uca.capas.modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uca.capas.modelo.domain.Materia;

@Repository
public class MateriaDAOImpl implements MateriaDAO{
	
	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	@Override
	public List<Materia> findAll() throws DataAccessException {
		StringBuffer sbm = new StringBuffer();
		sbm.append("select * from public.materia ORDER BY c_materia asc");
		Query query = entityManager.createNativeQuery(sbm.toString(),Materia.class);
		List<Materia> resulset = query.getResultList();
		return resulset;
	}

	@Transactional
	public void insert(Materia materia) throws DataAccessException {
		entityManager.persist(materia);
		
	}
	
	private static final String sql = "UPDATE public.materia SET nombre_materia=?, descripcion_materia=?, estado=? WHERE c_materia=?";
	
	@Override
	public void updateMateria(Materia materia) {
		Object[] parametros = new Object[] {materia.getNombre_materia(),materia.getDescripcion_materia(),materia.getEstado(),materia.getC_materia()};
		jdbcTemplate.update(sql,parametros);
		
	}

}

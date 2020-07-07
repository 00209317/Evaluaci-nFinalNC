package com.uca.capas.modelo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.uca.capas.modelo.domain.Materia;

public interface MateriaRepository extends JpaRepository<Materia,Integer>{
	
	@Query(value = "SELECT * from public.materia", nativeQuery = true)
    public List<Materia> findAllMateria();
	
	
	@Query(value = "SELECT * from public.materia where c_materia=?", nativeQuery = true)
    public Materia findOne(int id);
}

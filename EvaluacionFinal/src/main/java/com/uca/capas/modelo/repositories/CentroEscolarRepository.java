package com.uca.capas.modelo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uca.capas.modelo.domain.CentroEscolar;


public interface CentroEscolarRepository extends JpaRepository<CentroEscolar, Integer> {
	@Query(value = "SELECT * from public.centroescolar", nativeQuery = true)
    public List<CentroEscolar> findAllClientes();
	
	
	@Query(value = "SELECT * from public.centroescolar where c_centroescolar=?", nativeQuery = true)
    public CentroEscolar findOne(int id);
	
}

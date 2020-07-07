package com.uca.capas.modelo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "departamento")
public class Departamento {
	@Id
	@Column(name = "c_departamento")
	private Integer c_departamento;
	
	@Column(name = "nombre_departamento")
	private String nombre_departamento;

	
	@OneToMany(mappedBy = "c_departamento", fetch = FetchType.EAGER)
	private List<Usuario> usuario;
	
	public Integer getC_departamento() {
		return c_departamento;
	}

	public void setC_departamento(Integer c_departamento) {
		this.c_departamento = c_departamento;
	}

	public String getNombre_departamento() {
		return nombre_departamento;
	}

	public void setNombre_departamento(String nombre_departamento) {
		this.nombre_departamento = nombre_departamento;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
	
	

}

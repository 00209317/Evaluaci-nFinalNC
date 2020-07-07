package com.uca.capas.modelo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "municipio")
public class Municipio {
	
	
	@Id
	@Column(name = "c_municipio")
	private Integer c_municipio;
	
	@Column(name = "nombre_municipio")
	private String nombre_municipio;
	
	@OneToMany(mappedBy = "c_municipio", fetch = FetchType.EAGER)
	private List<Usuario> usuario;
	
	public Integer getC_municipio() {
		return c_municipio;
	}
	public void setC_municipio(Integer c_municipio) {
		this.c_municipio = c_municipio;
	}
	public String getNombre_municipio() {
		return nombre_municipio;
	}
	public void setNombre_municipio(String nombre_municipio) {
		this.nombre_municipio = nombre_municipio;
	}
	public List<Usuario> getUsuario() {
		return usuario;
	}
	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}


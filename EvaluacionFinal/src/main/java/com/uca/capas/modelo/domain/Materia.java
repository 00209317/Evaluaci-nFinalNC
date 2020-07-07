package com.uca.capas.modelo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(schema = "public", name = "materia")
public class Materia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c_materia")
	private Integer c_materia;
	
	@Column(name = "nombre_materia")
	@NotEmpty(message="El campo titulo categoría no puede estar vacío")
	private String Nombre_materia;
	
	@Column(name = "descripcion_materia")
	@NotEmpty(message="El campo titulo categoría no puede estar vacío")
	private String Descripcion_materia;
	
	@Column(name = "estado")
	private Boolean Estado;
	
	public Integer getC_materia() {
		return c_materia;
	}
	public void setC_materia(Integer c_materia) {
		this.c_materia = c_materia;
	}
	public String getNombre_materia() {
		return Nombre_materia;
	}
	public void setNombre_materia(String nombre_materia) {
		Nombre_materia = nombre_materia;
	}
	public String getDescripcion_materia() {
		return Descripcion_materia;
	}
	public void setDescripcion_materia(String descripcion_materia) {
		Descripcion_materia = descripcion_materia;
	}
	public Boolean getEstado() {
		return Estado;
	}
	public void setEstado(Boolean estado) {
		Estado = estado;
	}
	
	public String getBactivoDelegate(){
		if(this.Estado == null){
			return "";
		}
		else{
			if(this.Estado) return "ACTIVO";
			else return "INACTIVO";
		}
	}
}

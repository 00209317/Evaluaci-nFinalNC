package com.uca.capas.modelo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "centroescolar")
public class CentroEscolar {
	
	
	@Id
	@GeneratedValue(generator="cliente_c_cliente_seq", strategy = GenerationType.AUTO)
	@Column(name = "c_centroescolar")
	private int c_centroescolar;
	
	@Column(name = "nombrece")
	private String nombrece;
	
	@Column(name = "descripcionce")
	private String descripcionce;
	
	@Column(name = "estadoce")
	private Boolean estadoce;
	
	public int getC_centroescolar() {
		return c_centroescolar;
	}
	public void setC_centroescolar(int c_centroescolar) {
		this.c_centroescolar = c_centroescolar;
	}
	public String getNombrece() {
		return nombrece;
	}
	public void setNombrece(String nombrece) {
		this.nombrece = nombrece;
	}
	public String getDescripcionce() {
		return descripcionce;
	}
	public void setDescripcionce(String descripcionce) {
		this.descripcionce = descripcionce;
	}
	public Boolean getEstadoce() {
		return estadoce;
	}
	public void setEstadoce(Boolean estadoce) {
		this.estadoce = estadoce;
	}
	
	public String getBactivoDelegate(){
		if(this.estadoce == null){
			return "";
		}
		else{
			if(this.estadoce) return "ACTIVO";
			else return "INACTIVO";
		}
	}
	

}

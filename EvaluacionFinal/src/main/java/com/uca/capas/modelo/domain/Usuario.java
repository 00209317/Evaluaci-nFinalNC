package com.uca.capas.modelo.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(schema = "public", name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "c_usuario")
	private Integer c_usuario;
	
	
	@Column(name = "nombreusuario")
	@NotEmpty(message="El campo titulo categoría no puede estar vacío")
	private String nombreusuario;
	
	@Column(name = "descripcionusuario")
	@NotEmpty(message="El campo titulo categoría no puede estar vacío")
	private String descripcionusuario;
	
	@Column(name = "estadousuario")
	private Boolean estadousuario;
	
	@Column(name = "apellidousuario")
	@NotEmpty(message="El campo titulo categoría no puede estar vacío")
	private String apellidousuario;
	
	@Column(name = "fecha_nacimiento")
	@NotEmpty(message="El campo titulo categoría no puede estar vacío")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private LocalDate fecha_nacimiento;
	
	@Column(name = "edadusuario")
	@NotEmpty(message="El campo titulo categoría no puede estar vacío")
	private Integer edadusuario;
	
	@Column(name = "direccion_residencia")
	@NotEmpty(message="El campo titulo categoría no puede estar vacío")
	private String direccion_residencia;
	
	@Column(name = "username")
	@NotEmpty(message="El campo titulo categoría no puede estar vacío")
	private String username;
	
	@Column(name = "contrasenia")
	@NotEmpty(message="El campo titulo categoría no puede estar vacío")
	private String contrasenia;
	
	@Column(name = "tipo_usuario")
	@NotEmpty(message="El campo titulo categoría no puede estar vacío")
	private String tipo_usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c_departamento")
	private Departamento c_departamento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c_municipio")
	private Municipio c_municipio;
	
	
	
	public Integer getC_usuario() {
		return c_usuario;
	}
	public void setC_usuario(Integer c_usuario) {
		this.c_usuario = c_usuario;
	}
	public String getNombreusuario() {
		return nombreusuario;
	}
	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}
	public String getDescripcionusuario() {
		return descripcionusuario;
	}
	public void setDescripcionusuario(String descripcionusuario) {
		this.descripcionusuario = descripcionusuario;
	}
	public Boolean getEstadousuario() {
		return estadousuario;
	}
	public void setEstadousuario(Boolean estadousuario) {
		this.estadousuario = estadousuario;
	}
	public String getApellidousuario() {
		return apellidousuario;
	}
	public void setApellidousuario(String apellidousuario) {
		this.apellidousuario = apellidousuario;
	}
	@DateTimeFormat(pattern="dd/MM/yyyy")
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Integer getEdadusuario() {
		return edadusuario;
	}
	public void setEdadusuario(Integer edadusuario) {
		this.edadusuario = edadusuario;
	}
	public String getDireccion_residencia() {
		return direccion_residencia;
	}
	public void setDireccion_residencia(String direccion_residencia) {
		this.direccion_residencia = direccion_residencia;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	public Departamento getC_departamento() {
		return c_departamento;
	}
	public void setC_departamento(Departamento c_departamento) {
		this.c_departamento = c_departamento;
	}
	public Municipio getC_municipio() {
		return c_municipio;
	}
	public void setC_municipio(Municipio c_municipio) {
		this.c_municipio = c_municipio;
	}
	
	public String getEstadoDelegate() {
		if(this.estadousuario==null)return"";
		else {
			return estadousuario==true ?"Activo":"Inactivo";
		}
	}
	
	
	
}

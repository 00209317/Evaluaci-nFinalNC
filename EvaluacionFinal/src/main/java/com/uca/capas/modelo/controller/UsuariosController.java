package com.uca.capas.modelo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.modelo.dao.MunicipioDAO;
import com.uca.capas.modelo.domain.Materia;
import com.uca.capas.modelo.domain.Municipio;
import com.uca.capas.modelo.domain.Usuario;

@Controller
public class UsuariosController {
	
	@Autowired
	private MunicipioDAO municipioDAO;
	

	@RequestMapping("/usuarios")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("administrador/usuarios");
		return mav;
	}
	
	@RequestMapping("/usuario")
	public ModelAndView usuario() {
		ModelAndView mav = new ModelAndView();
		Usuario user = new Usuario();
		List<Municipio> municipios = municipioDAO.findAll();
		mav.addObject("user", user);
		mav.addObject("municipio", user.getC_municipio());
		mav.addObject("municipios", municipios);
		mav.setViewName("administrador/nuevoUsuario");
		return mav;
		
	}
	
	
	
	@RequestMapping("/Municipios")
	public ModelAndView mnc() {
		ModelAndView mav = new ModelAndView();
		List<Municipio> muns = municipioDAO.findAll();
		try {
			mav.addObject("muns", muns);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		mav.setViewName("administrador/pruebaMunicipio");
		return mav;
	}
	
	
	

}

package com.uca.capas.modelo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.modelo.dao.MateriaDAO;
import com.uca.capas.modelo.domain.CentroEscolar;
import com.uca.capas.modelo.domain.Materia;

@Controller
public class MateriasController {
	
	@Autowired
	private MateriaDAO materiaDAO;

	@RequestMapping("/materias")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		List<Materia> mats = materiaDAO.findAll();
		try {
			mav.addObject("mats", mats);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		mav.setViewName("administrador/materias.html");
		return mav;
	}
	
}

package com.uca.capas.modelo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MateriasController {

	@RequestMapping("/materias")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("administrador/materias");
		return mav;
	}
	
}

package com.uca.capas.modelo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CentroEscolarController {

	@RequestMapping("/centroEscolar")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("administrador/centroEscolar");
		return mav;
	}
}

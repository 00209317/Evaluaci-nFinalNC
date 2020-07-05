package com.uca.capas.modelo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/inicioAdmin")
	public ModelAndView initAdmin() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("administrador/indexAdmin.html");
		return mav;
	}
	
	
	@RequestMapping("/inicioCoor")
	public ModelAndView initCoor() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("coordinador/indexCoor.html");
		return mav;
	}
}

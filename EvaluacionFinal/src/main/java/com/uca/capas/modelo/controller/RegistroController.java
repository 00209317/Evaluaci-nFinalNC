package com.uca.capas.modelo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistroController {

	@RequestMapping("/registro")
	public ModelAndView indexLaboratorio8() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("register");
		return mav;
	}
	
}

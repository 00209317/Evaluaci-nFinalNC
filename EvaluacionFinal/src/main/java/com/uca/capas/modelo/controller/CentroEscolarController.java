package com.uca.capas.modelo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.modelo.dao.CentroEscolarDAO;
import com.uca.capas.modelo.domain.CentroEscolar;


@Controller
public class CentroEscolarController {
	
	@Autowired
	private CentroEscolarDAO centroEscolardao;
	

	@RequestMapping("/centroEscolar")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("administrador/centroEscolar");
		return mav;
	}
	
	
	@RequestMapping("/listado")
	public ModelAndView listado() {
		ModelAndView mav = new ModelAndView();
		List<CentroEscolar> ces = centroEscolardao.findAll();
		try {
			mav.addObject("ces", ces);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		mav.setViewName("administrador/centroEscolar");
		return mav;
	}

}

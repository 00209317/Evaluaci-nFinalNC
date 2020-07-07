package com.uca.capas.modelo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.modelo.dao.CentroEscolarDAO;
import com.uca.capas.modelo.domain.CentroEscolar;
import com.uca.capas.modelo.service.CentroEscolarService;


@Controller
public class CentroEscolarController {
	
	@Autowired
	private CentroEscolarDAO centroEscolardao;
	
	@Autowired
	private CentroEscolarService centroEscolarService;
	

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
		
		mav.setViewName("administrador/centroEscolar.html");
		return mav;
	}
	
	@RequestMapping("/centroescolar")
	public ModelAndView centroEscolar() {
		ModelAndView mav = new ModelAndView();
		CentroEscolar ce = new CentroEscolar();
		mav.addObject("CentroEscolar", ce);
		mav.setViewName("administrador/nuevoCE");
		return mav;
	}
	
	/*@RequestMapping("/ingresarCentroEscolar")
	public ModelAndView categoria(@Valid @ModelAttribute CentroEscolar centroEscolar, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			//regresar con los errores
			mav.setViewName("administrador/nuevoCE");
		}else {
			centroEscolardao.insert(centroEscolar);
			List<CentroEscolar> ces = centroEscolardao.findAll();
			try {
				mav.addObject("ces", ces);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			//mav.addObject("exito","Categoria guardada con exito");
			mav.setViewName("administrador/centroEscolar");
		}
		return mav;
	}*/
	
	@RequestMapping(value="/ingresarCentroEscolar",method=RequestMethod.POST)
	public ModelAndView saveCliente(@Valid @ModelAttribute("CentroEscolar")CentroEscolar c, BindingResult r) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("CentroEscolar",new CentroEscolar());
		if(r.hasErrors()) {
			System.out.println("estoy en error");
			mav.setViewName("Laboratorio/agregarCliente");
		}else {
			if(c.getC_centroescolar()==null) {
				System.out.println("estoy en insert");
				centroEscolardao.insert(c);
			}else {
				System.out.println("estoy en update");
				centroEscolarService.updateCliente(c);
			}
			List<CentroEscolar> ces = centroEscolardao.findAll();
			try {
				mav.addObject("ces", ces);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			mav.setViewName("administrador/centroEscolar");
		}
		
		return mav;
	}

	@RequestMapping("/editarCentroEscolar")
	public ModelAndView buscar15(@RequestParam Integer codigo) {
		ModelAndView mav = new ModelAndView();
		CentroEscolar c =centroEscolarService.findOne(codigo);
		mav.addObject("CentroEscolar", c);
		mav.setViewName("administrador/editarCE");
		return mav;
	}
	
	


	
}

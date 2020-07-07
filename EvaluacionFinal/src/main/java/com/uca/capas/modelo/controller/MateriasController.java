package com.uca.capas.modelo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.modelo.dao.MateriaDAO;
import com.uca.capas.modelo.domain.CentroEscolar;
import com.uca.capas.modelo.domain.Materia;
import com.uca.capas.modelo.service.MateriaService;

@Controller
public class MateriasController {
	
	@Autowired
	private MateriaDAO materiaDAO;
	
	@Autowired
	private MateriaService materiaService;

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
	
	//nueva materia
	@RequestMapping("/materia")
	public ModelAndView centroEscolar() {
		ModelAndView mav = new ModelAndView();
		Materia ma = new Materia();
		mav.addObject("Materia", ma);
		mav.setViewName("administrador/nuevaMateria");
		return mav;
	}
	//edit materia
	@RequestMapping("/editarMateria")
	public ModelAndView buscar15(@RequestParam Integer codigo) {
		ModelAndView mav = new ModelAndView();
		Materia ma = materiaService.findOne(codigo);
		mav.addObject("Materia", ma);
		mav.setViewName("administrador/nuevaMateria");
		return mav;
	}
	
	@RequestMapping(value="/ingresarMateria",method=RequestMethod.POST)
	public ModelAndView saveMateria(@Valid @ModelAttribute("Materia")Materia ma, BindingResult r) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("Materia",new Materia());
		if(r.hasErrors()) {
			System.out.println("estoy en error");
			mav.setViewName("administrador/nuevaMateria");
		}else {
			if(ma.getC_materia()==null) {
				System.out.println("estoy en insert");
				materiaDAO.insert(ma);
			}else {
				System.out.println("estoy en update");
				materiaService.updateMateria(ma);
			}
			List<Materia> mats = materiaDAO.findAll();
			try {
				mav.addObject("mats",mats);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			mav.setViewName("administrador/materias");
		}
		
		return mav;
	}
	
}

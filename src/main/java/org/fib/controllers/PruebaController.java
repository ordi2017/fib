package org.fib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PruebaController {

	@RequestMapping(value="/prueba",method=RequestMethod.GET)
	public ModelAndView nada(ModelAndView model){
		return model;
	}
}

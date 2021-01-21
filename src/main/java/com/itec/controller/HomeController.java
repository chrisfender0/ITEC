package com.itec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itec.services.ModalPicker;

@Controller
public class HomeController {

	@RequestMapping(value={"", "/", "home", "default.html"})
	public ModelAndView home(ModelAndView mv) {
		System.out.println("homepage hit");
		mv.addObject("evenOrOdd", ModalPicker.evenOrOdd());
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value= {"about", "aboutUs.html"})
	public ModelAndView about(ModelAndView mv) {
		System.out.println("about us hit");
		mv.setViewName("about");
		return mv;
	}
	
	@RequestMapping(value= {"products","products.html"})
	public ModelAndView products(ModelAndView mv) {
		System.out.println("products hit");
		mv.setViewName("products");
		return mv;
	}
	
	@RequestMapping(value= {"newsAndMedia","newsAndMedia.html"})
	public ModelAndView newsAndMedia(ModelAndView mv) {
		System.out.println("newsAndMedia hit");
		mv.setViewName("newsAndMedia");
		return mv;
	}
	
	@RequestMapping(value= {"signIn","signIn.html"})
	public ModelAndView signIn(ModelAndView mv) {
		System.out.println("signIn hit");
		mv.setViewName("signIn");
		return mv;
	}
	
}
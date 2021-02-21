package com.itec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itec.repo.ProductRepo;
import com.itec.services.ProductDisplayHelper;

@Controller
public class Products_dvd_Controller {
	
	@Autowired
	ProductRepo prods;
	
	@RequestMapping(value= {"products_dvds","products_dvds.html"})
	public ModelAndView products_dvds(ModelAndView mv) {
		System.out.println("products_dvds hit");
		mv.addObject("products", ProductDisplayHelper.displayProducts("dvd", prods.findAll()));
		mv.setViewName("products_dvds");
		return mv;
	}

}

package com.itec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itec.repo.ProductRepo;
import com.itec.services.ProductDisplayHelper;

@Controller
public class Products_plushtoy_Controller {
	
	@Autowired
	ProductRepo prods;

	@RequestMapping(value= {"products_plushToys","products_plushToys.html"})
	public ModelAndView products_plushToys(ModelAndView mv) {
		System.out.println("products_plushToys hit");
		mv.addObject("products", ProductDisplayHelper.displayProducts("plushtoy", prods.findAll()));
		mv.setViewName("products_plushToys");
		return mv;
	}
	
}

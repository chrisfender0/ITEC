package com.itec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itec.repo.ProductRepo;
import com.itec.services.ProductDisplayHelper;

@Controller
public class ProductsController {
	
	@Autowired
	ProductRepo prods;
	
	@RequestMapping(value= {"products","products.html"})
	public ModelAndView products(ModelAndView mv) {
		System.out.println("products hit");
		mv.addObject("products", ProductDisplayHelper.displayProducts("all", prods.findAll()));
		mv.setViewName("products");
		return mv;
	}
	

}

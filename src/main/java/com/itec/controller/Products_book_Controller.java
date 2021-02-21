package com.itec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itec.repo.ProductRepo;
import com.itec.services.ProductDisplayHelper;

@Controller
public class Products_book_Controller {

	@Autowired
	ProductRepo prods;
	
	@RequestMapping(value= {"products_books","products_books.html"})
	public ModelAndView products_books(ModelAndView mv) {
		System.out.println("products_books hit");
		mv.addObject("products", ProductDisplayHelper.displayProducts("book", prods.findAll()));
		mv.setViewName("products_books");
		return mv;
	}
	
}

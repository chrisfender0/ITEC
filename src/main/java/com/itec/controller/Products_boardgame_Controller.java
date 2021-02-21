package com.itec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itec.repo.ProductRepo;
import com.itec.services.ProductDisplayHelper;

@Controller
public class Products_boardgame_Controller {

	@Autowired
	ProductRepo prods;
	
	@RequestMapping(value= {"products_boardGames","products_boardGames.html"})
	public ModelAndView products_boardGames(ModelAndView mv) {
		System.out.println("products_boardGames hit");
		mv.addObject("products", ProductDisplayHelper.displayProducts("boardgame", prods.findAll()));
		mv.setViewName("products_boardGames");
		return mv;
	}
	
}

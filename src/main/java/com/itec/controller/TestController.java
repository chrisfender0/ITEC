package com.itec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itec.pojo.Products;
import com.itec.repo.ProductRepo;

@Controller
public class TestController {
	
	@Autowired
	ProductRepo prod;
	
	@RequestMapping(value={"/test","test"})
	public ModelAndView test(ModelAndView mv) {
		List<Products> prods = (List<Products>) prod.findAll();
		mv.addObject("products", prods);
		mv.setViewName("testDB");
		return mv;
	}

}

package com.itec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AboutUsController {

	@RequestMapping(value= {"about", "aboutUs.html"})
	public ModelAndView about(ModelAndView mv) {
		System.out.println("about us hit");
		mv.setViewName("about");
		return mv;
	}
	
}

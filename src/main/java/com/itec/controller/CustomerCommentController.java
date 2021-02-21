package com.itec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itec.repo.CityStateZipRepo;
import com.itec.services.CustomerCommentHelper;

@Controller
public class CustomerCommentController {
	
	@Autowired
	CityStateZipRepo cRepo;
	
	@RequestMapping(value= {"customerComment","customerComment.html"})
	public ModelAndView customerComment(ModelAndView mv) {
		mv.addObject("zipcodes", CustomerCommentHelper.getZipCodes(cRepo.findAll()));
		mv.setViewName("customerComment");
		return mv;
	}

}

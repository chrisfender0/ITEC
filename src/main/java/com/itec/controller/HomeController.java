package com.itec.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itec.services.ModalPicker;
import com.itec.services.SignInHelper;

@Controller
public class HomeController {
	
	

	@RequestMapping(value={"", "/", "home", "default.html"})
	public ModelAndView home(ModelAndView mv) {
		System.out.println("homepage hit");
		mv.addObject("evenOrOdd", ModalPicker.evenOrOdd());
		mv.setViewName("home");
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
	
	@RequestMapping(value= {"aboutUs_executiveBios","aboutUs_executiveBios.html"})
	public ModelAndView aboutUs_executiveBios(ModelAndView mv) {
		System.out.println("aboutUs_executiveBios hit");
		mv.setViewName("aboutUs_executiveBios");
		return mv;
	}
	
	@RequestMapping(value= {"portal","portal.html"})
	public ModelAndView portal(ModelAndView mv) {
		System.out.println("portal hit");
		mv.setViewName("portal");
		return mv;
	}
	
	//sign in required
	@RequestMapping(value= {"intranetHome","intranetHome.html"})
	public ModelAndView intranetHome(ModelAndView mv, @RequestParam String user, @RequestParam String pass) {
		System.out.println("intranetHome hit");
		System.out.println("reqparam user=" + user);
		System.out.println("reqparam pass="+pass);
		
		String username = SignInHelper.signIn(user, pass);
		if(username.equals("invalid")) {
			mv.addObject("invalid", "invalid");
			mv.setViewName("portal");
			return mv;
		} else {
			mv.addObject("username", username);
			System.out.println(username);
			mv.setViewName("intranetHome");
			return mv;
		}
		
	}
	
	//sign in required
	@RequestMapping(value= {"forms","forms.html"})
	public ModelAndView forms(ModelAndView mv) {
		System.out.println("forms hit");
		mv.setViewName("forms");
		return mv;
	}
	
	//sign in required
	@RequestMapping(value= {"employeeDirectory","employeeDirectory.html"})
	public ModelAndView employeeDirectory(ModelAndView mv) {
		System.out.println("employeeDirectory hit");
		mv.setViewName("employeeDirectory");
		return mv;
	}
	
	//sign in required
	@RequestMapping(value= {"offices","offices.html"})
	public ModelAndView offices(ModelAndView mv) {
		System.out.println("offices hit");
		mv.setViewName("offices");
		return mv;
	}
	
	@RequestMapping(value = "fileOne")
	public void fileOneDownload(HttpServletRequest request, HttpServletResponse response) throws IOException {
		final String FILE_ONE = "C:/Users/chris/Downloads/USW1_ITEC_3402_Week5_toyfair_tradeshow_may25th.pdf";
		File file = new File(FILE_ONE);
		if(file.exists()) {
			String mimeType = URLConnection.guessContentTypeFromName(file.getName());
			if (mimeType == null) {
				mimeType = "application/octet-stream";
			}
			response.setContentType(mimeType);
			response.setHeader("Content-Disposition", "attachment");
			response.setContentLength((int) file.length());
			InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
			FileCopyUtils.copy(inputStream, response.getOutputStream());
		}
	}
	
	@RequestMapping(value = "fileTwo")
	public void fileTwoDownload(HttpServletRequest request, HttpServletResponse response) throws IOException {
		final String FILE_TWO = "C:/Users/chris/Downloads/USW1_ITEC_3402_Week5_proathlete_gamerelease_sep12th.pdf";
		File file = new File(FILE_TWO);
		if(file.exists()) {
			String mimeType = URLConnection.guessContentTypeFromName(file.getName());
			if (mimeType == null) {
				mimeType = "application/octet-stream";
			}
			response.setContentType(mimeType);
			response.setHeader("Content-Disposition", "attachment");
			response.setContentLength((int) file.length());
			InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
			FileCopyUtils.copy(inputStream, response.getOutputStream());
		}
	}
	
}
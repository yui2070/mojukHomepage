package com.inhatc.mojuk.main.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value = "/main.do", method = RequestMethod.GET) // "/"를 링크에 적으면 리턴값인 home.jsp로 가게끔
	public String home(Locale locale, Model model,HttpSession ses) {
	
		return "login"; 
	}
	
	@RequestMapping(value = "/mainpage.do", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		
		return "main/index";
	}

	@RequestMapping(value = "/no_list.do", method = RequestMethod.GET)
	public String no_list(Locale locale, Model model) {
		
		return "/notice/no_list";
	}
	
	@RequestMapping(value = "/no_write.do", method = RequestMethod.GET)
	public String no_write(Locale locale, Model model) {
		
		return "/notice/no_write";
	}
	
	@RequestMapping(value = "/pro_list.do", method = RequestMethod.GET)
	public String pro_list(Locale locale, Model model) {
		
		return "/project/pro_list";
	}
	
	@RequestMapping(value = "/pro_write.do", method = RequestMethod.GET)
	public String pro_write(Locale locale, Model model) {
		
		return "/project/pro_write";
	}
}

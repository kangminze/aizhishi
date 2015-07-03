package com.kxz.aizhishi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@RequestMapping("/hello")
public class HelloWorldController{

	@RequestMapping("/nihao")
	public String helloworld(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello World!");
		mv.setViewName("main");
		System.out.println("testsafasdfasdfadfasdfasfasf");
		return "main";
	}

}

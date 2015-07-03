package com.kxz.aizhishi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorldController{

	@RequestMapping("/nihao")
	public String helloworld(HttpServletRequest arg0,
			HttpServletResponse arg1,ModelMap model) throws Exception {
		model.addAttribute("hello", "你好!");
		return "main";
	}

}

package com.bitacademy.helloweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello2")
	public String hello(String name) {
		System.out.println("name: " + name);
		return "/WEB-INF/views/hello.jsp";
	}
}

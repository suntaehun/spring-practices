package com.bitacademy.helloweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//	@RequestMapping 클래스 + 메소드 [추천]


@Controller
@RequestMapping("/user")
public class UserController {

	@ResponseBody
	@RequestMapping("/joinform")
	public String joinform() {
		return "UserController.joinform()";
	}
	
	@ResponseBody
	@RequestMapping("/join")
	public String join() {
		return "UserController.join()";
	}
}

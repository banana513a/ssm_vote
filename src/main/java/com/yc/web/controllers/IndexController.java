package com.yc.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	
	@RequestMapping(value="/index.action" , method = RequestMethod.GET )	//method = RequestMethod.GET
	public String index(){
		return "login";
	}
	
	
	@RequestMapping(value="/toRegister.action" , method = RequestMethod.GET )
	public String register(){
		return "register";
	}
	
	
}

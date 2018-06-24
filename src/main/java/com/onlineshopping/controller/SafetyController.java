package com.onlineshopping.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SafetyController {
	@RequestMapping(value="safety")
	public String pay(HttpServletRequest request){
		
		return "safety";
	}
}

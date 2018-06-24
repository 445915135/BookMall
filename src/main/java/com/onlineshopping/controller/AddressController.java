package com.onlineshopping.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddressController {
	@RequestMapping(value="address")
	public String information(HttpServletRequest request){
		
		return "address";
	}
}

package com.onlineshopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.OrderDetail;
import com.onlineshopping.service.ProductionService;

@Controller
public class InformationController {
	@Autowired
	ProductionService productionService;
	@RequestMapping(value="information")
	public String information(HttpServletRequest request){
		
		return "information";
	}
	
}

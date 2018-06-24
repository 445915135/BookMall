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
public class IntroductionController {
	@Autowired
	ProductionService productionService;
	@RequestMapping(value="introduction")
	public String introduction(HttpServletRequest request,int gdID){
		Goods goods = productionService.findGoodsById(gdID);
		List<OrderDetail> list = productionService.score(gdID);
		request.setAttribute("goods", goods);
		request.setAttribute("gdID", gdID);
		request.setAttribute("list", list);
		return "introduction";
	}
	
}

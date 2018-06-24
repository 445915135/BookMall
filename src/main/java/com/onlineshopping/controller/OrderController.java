package com.onlineshopping.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.User;
import com.onlineshopping.service.OrdersService;
import com.onlineshopping.service.ProductionService;

@Controller
public class OrderController {
	@Autowired 
	OrdersService ordersService;
	
	
	@RequestMapping(value="order")
	public String information(HttpServletRequest request,int gdID){
//		int id = (int) request.getAttribute("uid"); 拿到用戶ID
//      要有用户ID，我就不写了；
		System.out.println(gdID);
		int id=1;//這是個假的
		ordersService.insertOrders(gdID,id);
		return "order";
	}
}

package com.onlineshopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.OerderDetail1;
import com.onlineshopping.po.User;
import com.onlineshopping.service.OrderDetailService;
import com.onlineshopping.service.OrdersService;
import com.onlineshopping.service.ProductionService;

@Controller
public class OrderController {
	@Autowired 
	OrdersService ordersService;
	@Autowired
	OrderDetailService order;
	
	@RequestMapping(value="order")
	public String information(HttpServletRequest request,int gdID){
//		int id = (int) request.getAttribute("uid"); 拿到用戶ID
//      要有用户ID，我就不写了；
		System.out.println(gdID);
		int id=1;//這是個假的
		ordersService.insertOrders(gdID,id);
		return "order";
	}
	
	@RequestMapping(value="order1")
	public String intddd(HttpServletRequest request){
		List<OerderDetail1> oerderDetail1s=order.selectOrderDetailq();
		request.setAttribute("list", oerderDetail1s);
      	return "order";
	}
}

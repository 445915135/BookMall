package com.onlineshopping.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.dao.OrdersMappers;
import com.onlineshopping.po.Goods;
import com.onlineshopping.po.Orders;
import com.onlineshopping.po.User;
import com.onlineshopping.service.OrderDetailService;
import com.onlineshopping.service.OrdersService;
import com.onlineshopping.service.ProductionService;

@Service
public class OrdersServiceImpo implements OrdersService{
	@Autowired
	OrdersMappers ordersMappers;
	@Autowired
	ProductionService productionService;
	@Autowired
	OrderDetailService orderDetailService;
	public void insertOrders(int gbID,int id){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		Goods goods = productionService.findGoodsById(gbID);
		User user = new User();
		user.setuID(id);
		Orders orders = new Orders();
		orders.setGoods(goods);
		orders.setuID(user);
		orders.setoTime(df.format(new Date()));
		ordersMappers.insertOrders(orders);//订单表
		Orders orders2=ordersMappers.selectOrdersID(orders);
		System.out.println(orders2);
		orderDetailService.insertOrderDetail(orders2, goods);
		//111
	}
	

}

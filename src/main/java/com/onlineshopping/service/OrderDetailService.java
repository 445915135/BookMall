package com.onlineshopping.service;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.Orders;

public interface OrderDetailService {
	public void insertOrderDetail(Orders orders,Goods goods);
}

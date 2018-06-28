package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.OerderDetail1;
import com.onlineshopping.po.Orders;

public interface OrderDetailService {
	public void insertOrderDetail(Orders orders,Goods goods);
	public List<OerderDetail1> selectOrderDetail(Orders orders,Goods goods);
	public List<OerderDetail1> selectOrderDetailq();
}

package com.onlineshopping.dao;

import java.util.List;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.OrderDetail;

public interface ProductionMapper {
	public Goods findGoodsById(int gdID);
	public List<OrderDetail> score(int gdID);
}

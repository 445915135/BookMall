package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.OrderDetail;

public interface ProductionService {
	public Goods findGoodsById(int gdID);/*查询商品信息*/
	public List<OrderDetail> score(int gdID);/*查询评价*/

}

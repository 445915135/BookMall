package com.onlineshopping.dao;

import com.onlineshopping.po.Goods;

public interface ProductionMapper {
	public Goods findGoodsById(int gdID);
}

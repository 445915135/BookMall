package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.UserNum;

public interface HomeService {
	public List<Goods> commodityInformation(int li);					//分页查询商品
	public List<UserNum> getGoodsNum();
}

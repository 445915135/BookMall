package com.onlineshopping.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.dao.ProductionMapper;
import com.onlineshopping.po.Goods;
import com.onlineshopping.service.ProductionService;

@Service
public class ProductionServiceImpl implements ProductionService{
	@Autowired
	ProductionMapper productionMapper; 
	public Goods findGoodsById(int gdID) {
		Goods goods = productionMapper.findGoodsById(gdID);
		return goods;
	}

}

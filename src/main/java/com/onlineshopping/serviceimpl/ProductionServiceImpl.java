package com.onlineshopping.serviceimpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.dao.ProductionMapper;
import com.onlineshopping.po.Goods;
import com.onlineshopping.po.OrderDetail;
import com.onlineshopping.service.ProductionService;

@Service
public class ProductionServiceImpl implements ProductionService{
	@Autowired
	ProductionMapper productionMapper; 
	public Goods findGoodsById(int gdID) {
		Goods goods = productionMapper.findGoodsById(gdID);
		return goods;
	}
	public List<OrderDetail> score(int gdID) {
		List<OrderDetail> list =  productionMapper.score(gdID);
		
		for(int i = 0; i<list.size();i++){  
			 
			Date da = null;
			list.get(i).getOdTime(); 	/*开始的格式*/ 
			Date sqlDate = new java.sql.Date(list.get(i).getOdTime().getTime()); 
			list.get(i).setOdTime(sqlDate);
	    }  
		return list;
		
	}

}

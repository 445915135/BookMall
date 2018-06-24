package com.onlineshopping.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.dao.HomeMapper;
import com.onlineshopping.dao.ProductionMapper;
import com.onlineshopping.po.Goods;
import com.onlineshopping.po.UserNum;
import com.onlineshopping.service.HomeService;
import com.onlineshopping.util.PagingUtil;
@Service
public class HomeServiceImpl implements HomeService{
	@Autowired
	HomeMapper homeMapper; 
	//查询全部商品
	public List<Goods> commodityInformation(int li){
		li=(li-1)*8;
		List<Goods> list=homeMapper.commodityInformation(li);
		return list;
	}
	//查询看有多少页
	public List<UserNum> getGoodsNum(){
		int num=homeMapper.getGoodsNum();
		PagingUtil util=new PagingUtil();
		List<UserNum>listNum=util.getNum(num, 8);
		return listNum;
	}

}

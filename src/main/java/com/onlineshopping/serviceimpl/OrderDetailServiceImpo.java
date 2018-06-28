package com.onlineshopping.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.dao.OrderDetailMapper;
import com.onlineshopping.po.Goods;
import com.onlineshopping.po.OerderDetail1;
import com.onlineshopping.po.Orders;
import com.onlineshopping.po.User;
import com.onlineshopping.service.OrderDetailService;
@Service
public class OrderDetailServiceImpo implements OrderDetailService{
	@Autowired
	OrderDetailMapper orderDetailMapper;
	public void insertOrderDetail(Orders orders,Goods goods){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		OerderDetail1 o = new OerderDetail1();
		o.setGoods(goods);
		o.setOrders(orders);
		o.setOdTime(df.format(new Date()));
		orderDetailMapper.insertOrderDetail(o);
	}
   public List<OerderDetail1> selectOrderDetail(Orders orders,Goods goods){
	     OerderDetail1 oerderDetail1 = new OerderDetail1();
	    oerderDetail1.setGoods(goods);
	    oerderDetail1.setOrders(orders);
	    return orderDetailMapper.selectOerderDetail(oerderDetail1);
   }
   
   public List<OerderDetail1> selectOrderDetailq(){
	   return orderDetailMapper.selectOerderDetail1q();
   }
}

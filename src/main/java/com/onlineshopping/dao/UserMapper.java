package com.onlineshopping.dao;

import java.util.List;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.User;

public interface UserMapper {
	public User findUser(User user);
	public boolean addRegisterInfo(User user);		//增加注册信息
	public List<Goods> commodityInformation(int li);		//全部信息的查询
	public int getGoodsNum();	//查询返回多少页
}

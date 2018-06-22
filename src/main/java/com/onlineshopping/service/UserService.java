package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.User;
import com.onlineshopping.po.UserNum;

public interface UserService {
	public User userLogin(User user);
	public boolean addRegisterInfo(User user) throws Exception;		//增加注册信息
	public List<Goods> commodityInformation(int li);					//分页查询商品
	public List<UserNum> getGoodsNum();
}

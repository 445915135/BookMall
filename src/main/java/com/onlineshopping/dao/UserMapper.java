package com.onlineshopping.dao;

import java.util.List;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.User;

public interface UserMapper {
	public User findUser(User user);
	public boolean addRegisterInfo(User user);		//增加注册信息
	
}

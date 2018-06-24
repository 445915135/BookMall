package com.onlineshopping.service;

import java.util.List;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.User;
import com.onlineshopping.po.UserNum;

public interface UserService {
	public User userLogin(User user);					//登入
	public boolean addRegisterInfo(User user) throws Exception;		//增加注册信息
	
}

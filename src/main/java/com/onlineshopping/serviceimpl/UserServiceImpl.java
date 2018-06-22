package com.onlineshopping.serviceimpl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.onlineshopping.dao.UserMapper;
import com.onlineshopping.po.Goods;
import com.onlineshopping.po.User;
import com.onlineshopping.po.UserNum;
import com.onlineshopping.service.UserService;
import com.onlineshopping.util.PagingUtil;

@Service
public class UserServiceImpl implements UserService{
         @Autowired
         UserMapper userMapper;
         
		public User userLogin(User user) {
			User users= userMapper.findUser(user);
			return users;
		}
		
		//增加注册信息
				public boolean addRegisterInfo(User user)throws Exception {
					user.setuRegTiem(new Date());
					boolean bool=userMapper.addRegisterInfo(user);
					return bool;
				}
				//查询全部商品
				public List<Goods> commodityInformation(int li){
					li=(li-1)*8;
					List<Goods> list=userMapper.commodityInformation(li);
					return list;
				}
				//查询看有多少页
				public List<UserNum> getGoodsNum(){
					int num=userMapper.getGoodsNum();
					PagingUtil util=new PagingUtil();
					List<UserNum>listNum=util.getNum(num, 8);
					return listNum;
				}
}

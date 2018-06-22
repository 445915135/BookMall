package com.onlineshopping.util;

import java.util.ArrayList;
import java.util.List;

import com.onlineshopping.po.UserNum;

/* 分页的工具类，传入多少个，和每页分多少个*/
public class PagingUtil {
	public List<UserNum> getNum(int num,int limit){
		num=(num+limit)/limit;
		List<UserNum> listNum = new ArrayList<UserNum>();
		for (int i = 1; i <= num; i++) {
			 UserNum userNum=new UserNum();
			 userNum.setNum(i);
			 listNum.add(userNum);
		}
		return listNum;	
	}
}

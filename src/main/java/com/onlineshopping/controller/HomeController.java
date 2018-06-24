package com.onlineshopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.UserNum;
import com.onlineshopping.service.HomeService;
import com.onlineshopping.service.UserService;

@Controller
//首页
public class HomeController {
	@Autowired
	HomeService homeService;
	//显示商品信息
	   @RequestMapping(value ="commodityInformation")
	   public String displayCommodity(HttpServletRequest request,Integer li){
		   List<UserNum> listNum=homeService.getGoodsNum();			/*查询有多少页*/
		   request.setAttribute("listNum",listNum);					/*listnum一共有多少页，为现在为2页，传给jsp页面*/			
		   if(li==null&&li==0){
			   li=1;
		   }
		   request.setAttribute("li", li);							/*li为多少页如果第一次进入为空*/
		   List<Goods> list=homeService.commodityInformation(li);	/*分页查询*/
		   System.out.println(list);
		   request.setAttribute("list", list);						/*list为商品，传给前端*/
		   return "home";   
	   }
}

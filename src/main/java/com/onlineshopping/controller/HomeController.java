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
//��ҳ
public class HomeController {
	@Autowired
	HomeService homeService;
	//��ʾ��Ʒ��Ϣ
	   @RequestMapping(value ="commodityInformation")
	   public String displayCommodity(HttpServletRequest request,Integer li){
		   List<UserNum> listNum=homeService.getGoodsNum();			/*��ѯ�ж���ҳ*/
		   request.setAttribute("listNum",listNum);					/*listnumһ���ж���ҳ��Ϊ����Ϊ2ҳ������jspҳ��*/			
		   if(li==null&&li==0){
			   li=1;
		   }
		   request.setAttribute("li", li);							/*liΪ����ҳ�����һ�ν���Ϊ��*/
		   List<Goods> list=homeService.commodityInformation(li);	/*��ҳ��ѯ*/
		   System.out.println(list);
		   request.setAttribute("list", list);						/*listΪ��Ʒ������ǰ��*/
		   return "home";   
	   }
}

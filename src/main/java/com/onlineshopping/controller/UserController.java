package com.onlineshopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.onlineshopping.po.Goods;
import com.onlineshopping.po.User;
import com.onlineshopping.po.UserNum;
import com.onlineshopping.service.UserService;
import com.onlineshopping.util.MD;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	@ResponseBody
   @RequestMapping(value ="userlogin")
   public String login (HttpServletRequest request,User user){
		String aa=MD.MD5(user.getuPwd());
		user.setuPwd(aa);
		User users=userService.userLogin(user);
	    if(users != null){
			 request.getSession().setAttribute("uName", users.getuName());
			 return "true";
		}
	return "false";
   }
	@RequestMapping(value ="addRegisterInfo")
	   @ResponseBody
	   public boolean addRegisterInfo (@RequestBody User user){
		   boolean bool=false;
		   System.out.println(user.uPpwd);
		   String aa=MD.MD5(user.getuPwd());
		   user.setuPwd(aa);
		   try {
			   bool = userService.addRegisterInfo(user);
		   } catch (Exception e) {
			   System.out.println("已经有相同的用户名");
			   e.printStackTrace();
		   }
		   	   return bool;
	   	   }
	   //显示商品信息
	   @RequestMapping(value ="commodityInformation")
	   public String displayCommodity(HttpServletRequest request,Integer li){
		   List<UserNum> listNum=userService.getGoodsNum();			/*查询有多少页*/
		   request.setAttribute("listNum",listNum);					/*listnum一共有多少页，为现在为2页，传给jsp页面*/			
		   if(li==null&&li==0){
			   li=1;
		   }
		   request.setAttribute("li", li);							/*li为多少页如果第一次进入为空*/
		   List<Goods> list=userService.commodityInformation(li);	/*分页查询*/
		   System.out.println(list);
		   request.setAttribute("list", list);						/*list为商品，传给前端*/
		   return "home";   
	   }
}

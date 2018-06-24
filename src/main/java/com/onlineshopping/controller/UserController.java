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
	/*登入*/
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
	   /* 登入检验*/
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
	   
}

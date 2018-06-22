<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head lang="en">
		<script type="text/javascript">
		function register(){
			 var regex = /^1(3[0-9]|5[189]|8[6789])[0-9]{8}$/; 
			 var reg = /^[0-9a-zA-Z]+$/;
			 var emailreg=/^([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/gi;
			 var email=$("#email").val();
			 var phone=$("#phone").val();
			 var username=$("#username").val();
			 var password=$("#password").val();
			 var passwordRepeat=$("#passwordRepeat").val();
			 if(email==""||phone==""||username==""||password==""||passwordRepeat=="")
				 alert("请输入完整的信息");
			 else if(!emailreg.test(email)){
				 alert("非法的电子邮件!");
			 }
			 else if(!regex.test(phone)){
				 alert("请输入正确的手机格式！");
			 }
			 
			 else if(!reg.test(password)||password.length<6||password.length>11){
				 alert("请输入正确的密码格式");
			 }
			 else if(password!=passwordRepeat)
				 alert("请输入相同的密码！");
			 else{
				 $.ajax({
						type:"post",
					    url:"${pageContext.request.contextPath }/addRegisterInfo",
					    contentType:"application/json;charset-utf-8",	//设置头文件
					    data:JSON.stringify({uName:username,uPwd:password,uPhone:phone,uEmail:email}),//把字符串变为json类型的
					 	success:function(result){
					 		if(result==true){
					 				alert("恭喜您，注册成功。");
					 				window.location.href = "/ssm/login";
					 		}else{
					 				alert("很遗憾，注册失败！");
					 				window.location.href = "/ssm/register";
					 		}	
					 	}
					});	
			 }
		}
function disable()
  {
  document.getElementById("submit").disabled=true
  }
function enable()
  {
  document.getElementById("submit").disabled=false
  }
</script>
		<meta charset="UTF-8">
		<title>注册</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<meta name="format-detection" content="telephone=no">
		<meta name="renderer" content="webkit">
		<meta http-equiv="Cache-Control" content="no-siteapp" />

		<link rel="stylesheet" href="${pageContext.request.contextPath}/public/two/AmazeUI-2.4.2/assets/css/amazeui.min.css" />
		<link href="${pageContext.request.contextPath}/public/two/css/dlstyle.css" rel="stylesheet" type="text/css">
		<script src="${pageContext.request.contextPath}/public/two/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath}/public/two/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>

	</head>

	<body>

		<div class="login-boxtitle">
			<a href="home/demo.html"><img alt="" src="${pageContext.request.contextPath}/public/two/images/logobig.png" /></a>
		</div>

		<div class="res-banner">
			<div class="res-main">
				<div class="login-banner-bg"><span></span><img src="${pageContext.request.contextPath}/public/two/images/aa.jpg" width="600px" height="430px" style="margin-top: 20px;"/></div>
				<div class="login-box">

						<div class="am-tabs" id="doc-my-tabs">
							<ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
								<li class="am-active"><a >注册</a></li>
								
							</ul>

							<div class="am-tabs-bd">
								<div class="am-tab-panel am-active">
									<form method="post">
										
							   <div class="user-email">
										<label for="email"><i class="am-icon-envelope-o" style="margin-top: 13px"></i></label>
										<input type="email" name="" id="email" placeholder="请输入邮箱账号">
                 </div>				
                 <div class="user-phone">
								    <label for="phone"><i class="am-icon-mobile-phone am-icon-md" style="margin-top:4px"></i></label>
								    <input type="tel" name="" id="phone" placeholder="请输入手机号">
                 </div>		
                 <div class="user-phone">
								    <label for="username"><i class="am-icon-user" style="margin-top: 13px"></i></label>
								    <input type="tel" name="" id="username" placeholder="请输入用户名">
                 </div>		
                 <div class="user-pass">
								    <label for="password"><i class="am-icon-lock"  style="margin-top:13px"></i></label>
								    <input type="password" name="" id="password" placeholder="设置密码">
                 </div>										
                 <div class="user-pass">
								    <label for="passwordRepeat"><i class="am-icon-lock" style="margin-top:13px"></i></label>
								    <input type="password" name="" id="passwordRepeat" placeholder="确认密码">
                 </div>	
                 
                 </form>
                 
								 <div class="login-links">
										<label for="reader-me">
											<input id="reader-me" type="checkbox" onclick="if (this.checked) {enable()} else {disable()}"> 点击表示您同意商城《服务协议》
										</label>
							  	</div>
										<div class="am-cf">
											<input type="submit" name="" onclick="register()" id="submit" value="注册" class="am-btn am-btn-primary am-btn-sm am-fl" disabled="true">
										</div>

								</div>

								<script>
									$(function() {
									    $('#doc-my-tabs').tabs();
									  })
								</script>

							</div>
						</div>

				</div>
			</div>
			
					<div class="footer ">
						<div class="footer-hd ">
							<p>
								<a href="# ">湖南信息职业技术学院</a>
								<b>|</b>
								<a href="# ">商城首页</a>
								<b>|</b>
								<a href="# ">物流</a>
							</p>
						</div>
						<div class="footer-bd ">
							<p>
								
							</p>
						</div>
					</div>
	</body>

</html>
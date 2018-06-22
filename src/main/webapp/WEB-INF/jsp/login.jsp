<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head lang="en">
		<meta charset="UTF-8">
		<title>登录</title>
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
		<meta name="format-detection" content="telephone=no">
		<meta name="renderer" content="webkit">
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<script language="JavaScript" src="${pageContext.request.contextPath}/public/two/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/public/two/AmazeUI-2.4.2/assets/css/amazeui.css" />
		<link href="${pageContext.request.contextPath}/public/two/css/dlstyle.css" rel="stylesheet" type="text/css">
	</head>

	<body>

		<div class="login-boxtitle">
			<a href="home.html"><img alt="logo" src="${pageContext.request.contextPath}/public/two/images/logobig.png" /></a>
		</div>

		<div class="login-banner">
			<div class="login-main">
				<div class="login-banner-bg"><span></span><img src="${pageContext.request.contextPath}/public/two/images/aa.jpg" width="600px" height="430px" style="margin-top: 20px;"/></div>
				<div class="login-box">

							<h3 class="title">登录商城</h3>

							<div class="clear"></div>
						
						<div class="login-form">
						  <form>
							   <div class="user-name">
								    <label for="user"><i class="am-icon-user" style="margin-top: 13px"></i></label>
								    <input type="text" name="user" id="user" placeholder="邮箱/手机/用户名">
                 </div>
                 <div class="user-pass">
								    <label for="password"><i class="am-icon-lock" style="margin-top: 13px"></i></label>
								    <input type="password" name="password" id="password" placeholder="请输入密码">
                 </div>
              </form>
           </div>
            
            <div class="login-links">
                <label for="remember-me"><input id="remember-me" name="remember-me" type="checkbox" onclick="remember();">记住密码</label>
								<a href="#" class="am-fr">忘记密码</a>
								<a href="${pageContext.request.contextPath}/register" class="zcnext am-fr am-btn-default">注册</a>
								<br />
            </div>
								<div class="am-cf">
									<input type="button" name="" value="登 录" class="am-btn am-btn-primary am-btn-sm" onclick="userLogin()" />
								</div>
						<div class="partner">		
								<h3>合作账号</h3>
							<div class="am-btn-group">
								<li><a href="#"><i class="am-icon-qq am-icon-sm" style="margin-top: 13px"></i><span>QQ登录</span></a></li>
								<li><a href="#"><i class="am-icon-weibo am-icon-sm" style="margin-top: 13px"></i><span>微博登录</span> </a></li>
								<li><a href="#"><i class="am-icon-weixin am-icon-sm" style="margin-top: 13px"></i><span>微信登录</span> </a></li>
							</div>
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
								<a href="# ">支付宝</a>
								<b>|</b>
								<a href="# ">物流</a>
							</p>
						</div>
						<div class="footer-bd ">
							<p>
								<a></a>
							</p>
						</div>
					</div>
	</body>
	<script type="text/javascript">
		function userLogin(){
			var account = $("#user").val();
			var passWord = $("#password").val();
			var email = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
			var tel = /^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/;
			var x = "";
			/* if(passWord.trim().length<32){
				passWord = hex_md5(account+hex_md5(passWord));
			}
			$("#password").val(passWord);
			alert(passWord); */
			if(account!=null&&account!=""&&passWord!=null&&passWord!=""){
				if(email.test(account)){
					$.post("${pageContext.request.contextPath}/userlogin",
							{uEmail:account,uPwd:passWord},
							function(data){
								if(data=="true"){
									window.location.href="${pageContext.request.contextPath}/commodityInformation?li=1";
								}else{
									   alert("用户登录失败");
								   }
							});
				}else
					if(tel.test(account)){
						$.post("${pageContext.request.contextPath}/userlogin",
								{uPhone:account,uPwd:passWord},
								function(data){
									if(data=="true"){
										window.location.href="${pageContext.request.contextPath}/commodityInformation?li=1";
									}else{
										   alert("用户登录失败");
									   }
								});
						alert(x);
					}else{
						$.post("${pageContext.request.contextPath}/userlogin",
								{uName:account,uPwd:passWord},
								function(data){
									if(data=="true"){
										window.location.href="${pageContext.request.contextPath}/commodityInformation?li=1";
									}else{
										   alert("用户登录失败");
									   }
								});
					}
			}else{
				alert("账号密码不能为空");
			}
		}
	</script>
</html>
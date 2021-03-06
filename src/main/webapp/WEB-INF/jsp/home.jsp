<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

		<title>首页</title>

		<link href="${pageContext.request.contextPath}/public/two/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/public/two/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />

		<link href="${pageContext.request.contextPath}/public/two/basic/css/demo.css" rel="stylesheet" type="text/css" />

		<link href="${pageContext.request.contextPath}/public/two/css/seastyle.css" rel="stylesheet" type="text/css" />

		<script type="text/javascript" src="${pageContext.request.contextPath}/public/two/basic/js/jquery-1.7.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/public/two/js/script.js"></script>
	</head>

	<body>

		<!--顶部导航条 -->
		<div class="am-container header">
			<ul class="message-l">
				<div class="topMessage">
					<div class="menu-hd">
						<a>欢迎您，${uName}!</a>
					</div>
				</div>
			</ul>
			<ul class="message-r">
				
				<div class="topMessage my-shangcheng">
					<div class="menu-hd MyShangcheng"><a href="${pageContext.request.contextPath}/information" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
				</div>
				<div class="topMessage mini-cart">
					<div class="menu-hd"><a id="mc-menu-hd" href="${pageContext.request.contextPath}/pay" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
				</div>
				<div class="topMessage favorite">
					<div class="menu-hd"><a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
			</ul>
			</div>

			

			<div class="clear"></div>
			
           <div class="search">
			<div class="search-list">
			<div class="nav-table">
					   <div class="long-title"><span class="all-goods">全部分类</span></div>
					   <div class="nav-cont">
							<ul>
								<li class="index" style="width: 100px"><a>首页</a></li>
                               
							</ul>
						    <div class="nav-extra">
						    	<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
						    	<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
						    </div>
						</div>
			</div>
			
				
					<div class="am-g am-g-fixed">
						<div class="am-u-sm-12 am-u-md-12">
	                  	<div class="theme-popover">														
							
							<ul class="select">
								
								<div class="clear"></div>
								<li class="select-result">
									<dl>
										<dt>已选</dt>
										<dd class="select-no"></dd>
										<p class="eliminateCriteria">清除</p>
									</dl>
								</li>
								<div class="clear"></div>
								<li class="select-list">
									<dl id="select1">
										<dt class="am-badge am-round">分类</dt>	
										 <div class="dd-conent">										
											<dd class="select-all selected"><a href="#">全部</a></dd>
											<dd><a href="#">社科</a></dd>
											<dd><a href="#">文艺</a></dd>
											<dd><a href="#">经济 </a></dd>
											<dd><a href="#">法律 </a></dd>
											<dd><a href="#">古籍 </a></dd>
											<dd><a href="#">艺术 </a></dd>
											<dd><a href="#">科技  </a></dd>
											<dd><a href="#">IT</a></dd>
											<dd><a href="#">生活 </a></dd>
											<dd><a href="#">建筑  </a></dd>
											<dd><a href="#">少儿 </a></dd>
											<dd><a href="#">教辅 </a></dd>
											<dd><a href="#">外文  </a></dd>
											<dd><a href="#">杂志  </a></dd>	
										 </div>
						
									</dl>
								</li>
								
								
							</ul>
							<div class="clear"></div>
                        </div>
							<div class="search-content">
								<div class="sort">
									
									<li><a title="销量">销量排名
									</a></li>
									
								</div>
								<div class="clear"></div>

								<ul class="am-avg-sm-2 am-avg-md-3 am-avg-lg-4 boxes">
								<c:forEach items="${list}" var="v" varStatus="i">
									<li>
										<div class="i-pic limit">
											<img src="${pageContext.request.contextPath}/public/two/images/imgsearch1.jpg" />											
											<p class="title fl"><a href="${pageContext.request.contextPath}/introduction?gdID=${v.gdID}">${v.gdName}</a></p>
											<p class="price fl">
												<b>¥</b>
												<strong>${v.gdPrice}</strong>
											</p>
											<p class="number fl">
												销量<span>${v.gdSaleQty}</span>
											</p>
										</div>
									</li>
								</c:forEach>
									
									
									

							</div>
							<div class="clear"></div>
							<!--分页 -->
							<ul class="am-pagination am-pagination-right">
								<li><a href="${pageContext.request.contextPath}/commodityInformation?li=${li-1>0?li-1:li}">&laquo;</a></li>
								<c:forEach items="${listNum}" var="v" varStatus="i" >
        						<li><a href="${pageContext.request.contextPath}/commodityInformation?li=${v.num}">${v.num}</a></li>
        						</c:forEach>
								<li><a href="${pageContext.request.contextPath}/commodityInformation?li=${li+1<=listNum.size()?li+1:li}">&raquo;</a></li>
							</ul>
						</div>
					</div>
					<div class="footer">
						<div class="footer-hd">
							<p>
								<a href="#">湖南信息职业技术学院</a>
								<b>|</b>
								<a href="#">商城首页</a>
								<b>|</b>
								<a href="#">物流</a>
							</p>
						</div>
						<div class="footer-bd">
							<p>
								
							</p>
						</div>
					</div>
				</div>

			</div>

		<!--引导 -->
		<div class="navCir">
			<li><a href="home2.html"><i class="am-icon-home "></i>首页</a></li>
			<li><a href="sort.html"><i class="am-icon-list"></i>分类</a></li>
			<li><a href="shopcart.html"><i class="am-icon-shopping-basket"></i>购物车</a></li>	
			<li><a href="${pageContext.request.contextPath}/public/two/person/index.html"><i class="am-icon-user"></i>我的</a></li>					
		</div>

		<!--菜单 -->
		<div class=tip>
			<div id="sidebar">
				<div id="wrap">
					<div id="prof" class="item">
						<a href="#">
							<span class="setting"></span>
						</a>
						<div class="ibar_login_box status_login">
							<div class="avatar_box">
								<p class="avatar_imgbox"><img src="${pageContext.request.contextPath}/public/two/images/no-img_mid_.jpg" /></p>
								<ul class="user_info">
									<li>用户名：sl1903</li>
									<li>级&nbsp;别：普通会员</li>
								</ul>
							</div>
							<div class="login_btnbox">
								<a href="#" class="login_order">我的订单</a>
								<a href="#" class="login_favorite">我的收藏</a>
							</div>
							<i class="icon_arrow_white"></i>
						</div>

					</div>
					<div id="shopCart" class="item">
						<a href="#">
							<span class="message"></span>
						</a>
						<p>
							购物车
						</p>
						<p class="cart_num">0</p>
					</div>
					

					

					<div id="brand" class="item">
						<a href="#">
							<span class="wdsc"><img src="${pageContext.request.contextPath}/public/two/images/wdsc.png" /></span>
						</a>
						<div class="mp_tooltip">
							我的收藏
							<i class="icon_arrow_right_black"></i>
						</div>
					</div>

					

					<div class="quick_toggle">
						<li class="qtitem">
							<a href="#"><span class="kfzx"></span></a>
							<div class="mp_tooltip">客服中心<i class="icon_arrow_right_black"></i></div>
						</li>
						
					</div>

					<!--回到顶部 -->
					<div id="quick_links_pop" class="quick_links_pop hide"></div>

				</div>

			</div>
			<div id="prof-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					我
				</div>
			</div>
			<div id="shopCart-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					购物车
				</div>
			</div>
			<div id="asset-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					资产
				</div>

				<div class="ia-head-list">
					<a href="#" target="_blank" class="pl">
						<div class="num">0</div>
						<div class="text">优惠券</div>
					</a>
					<a href="#" target="_blank" class="pl">
						<div class="num">0</div>
						<div class="text">红包</div>
					</a>
					<a href="#" target="_blank" class="pl money">
						<div class="num">￥0</div>
						<div class="text">余额</div>
					</a>
				</div>

			</div>
			<div id="foot-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					足迹
				</div>
			</div>
			<div id="brand-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					收藏
				</div>
			</div>
			<div id="broadcast-content" class="nav-content">
				<div class="nav-con-close">
					<i class="am-icon-angle-right am-icon-fw"></i>
				</div>
				<div>
					充值
				</div>
			</div>
		</div>
		<script>
			window.jQuery || document.write('<script src="basic/js/jquery-1.9.min.js"><\/script>');
		</script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/public/two/basic/js/quick_links.js"></script>

<div class="theme-popover-mask"></div>

	</body>

</html>
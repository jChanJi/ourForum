<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/main.css">
<script type="text/javascript" src="js/focus.js"></script>
<script type="text/javascript" src="js/jquery-3.2.0.js"></script>
<script type="text/javascript" src="js/mouse_hover.js"></script>
<script type="text/javascript" src="js/part_desc.js"></script>
</head>
<body>
<div class="header">
	<!-- 横幅：注册登录 -->
	<div class="banner">
		<ul>
			<li class="banner_logo"><img alt="" src="image/logo.jpg"></li>
			<li class="banner_login"><a href="register.jsp">注册</a></li>
			<li class="banner_register"><a href="login.jsp">登陆</a></li>
			<div class="clear_both"></div>
		</ul>
	</div>
	<!-- 导航 -->
	<div class="navigator">
		
	</div>
	<!-- 板块选择 -->
	<div class="header_part">
		<!--焦点图展示 -->
		<div id="hot_part" class="hot_part">
			<ul id="hot_part_list">
				<li><a href="http://www.36dsj.com/archives/category/bigdata"><img src="image/hot1.jpg" id="focusImg"></a></li>
				<!-- <li><a href=""><img src="image/hot2.jpg"></a></li>
				<li><a href=""><img src="image/hot3.jpg"></a></li>
				<li><a href=""><img src="image/hot4.jpg"></a></li>-->
			</ul>
			<!--  
			<span class="leftArrow" id="leftArrow"><a>&lt;</a></span>
			<span class="rightArrow" id="rightArrow"><a>&gt;</a></span>
			-->
			<ol class="focusBox">
				<li onclick="showPic(1)">1</li>
				<li onclick="showPic(2)">2</li>
				<li onclick="showPic(3)">3</li>
				<li onclick="showPic(4)">4</li>
			</ol>
		</div>
		<!--  
		<div class="show_list" id="show_list"></div>-->
	</div>
</div>
<div class="mid">
	<h1><strong>大数据论坛</strong></h1>
	<div class="mid_model1 mid_model">
		<a href="everyPart.jsp">
		<img id="mid_model1" alt="" src="image/model1.jpg">
		<h2>大数据动向</h2>
		</a>
	</div>
	<div class="mid_model mid_model2">
		<img id="mid_model2" alt="" src="image/model2.jpg">
		<a href="">
		<h2>大数据应用</h2>
		</a>
	</div>
	<div class="mid_model mid_model3">
		<img id="mid_model3" alt="" src="image/model3.jpg">
		<a href="">
		<h2>大数据可视化</h2>
		</a>
	</div>
	<div class="mid_model mid_model4">
		<img id="mid_model4" alt="" src="image/model4.jpg">
		<a href="">
		<h2>数据分析</h2>
		</a>
	</div>
	<div class="mid_model mid_model5">
		<img id="mid_model5" alt="" src="image/model1.jpg">
		<a href="">
		<h2>大数据动向</h2>
		</a>
	</div>
	<div class="mid_model mid_model6">
		<img id="mid_model6" alt="" src="image/model2.jpg">
		<a href="">
		<h2>大数据应用</h2>
		</a>
	</div>
	<div class="mid_model mid_model7">
		<img id="mid_model7" alt="" src="image/model3.jpg">
		<a href="">
		<h2>大数据可视化</h2>
		</a>
	</div>
	<div class="mid_model mid_model8">
		<img id="mid_model8" alt="" src="image/model4.jpg">
		<a href="">
		<h2>数据分析</h2>
		</a>
	</div>
	<div class="clear_both"></div>
</div>
<div class="clear_both"></div>
<!-- <div class="showList">
	<div class="showList_part">
		<img alt="" src="image/s1.jpg">
		<a id="showList_p1" href="">大数据百科</a>
	</div>
	<div class="showList_part">
		<img alt="" src="image/s2.png">
		<a id="showList_p2" href="">大数据企业</a>
	</div>
	<div class="showList_part">
		<img alt="" src="image/s3.png">
		<a id="showList_p3" href="">大数据存储</a>
	</div>
	<div class="showList_part">
		<img alt="" src="image/s3.png">
		<a id="showList_p4" href="">大数据技术</a>
	</div>
</div> -->
<div class="footer">
	<p>Copyright 2017 BigData forum 大数据论坛（吉吉国王小组）版权所有<br/>
	中国南京 江宁区 金陵科技学院 咨询热线：000-000-0000 666-666-6666<br/><br/>
	</p>
	<p>吉春 王顺 章海蔚 薛家乐 王琪 周野</p>
</div>
</body>
</html>
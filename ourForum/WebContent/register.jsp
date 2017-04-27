<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/register.css">
<script type="text/javascript" src="js/jquery-3.2.0.js"></script>
<script type="text/javascript" src="js/registerCheck.js"></script>
<script type="text/javascript" src="js/registerPasswdCheck.js"></script>
<script type="text/javascript" src="js/mouse_hover.js"></script>
</head>
<body>
<div class="header">
	<div class="banner">
		<ul>
			<li class="banner_logo"><img alt="" src="image/logo.jpg"></li>
			<li class="banner_login"><a href="main.jsp">大数据论坛首页</a></li>
			<div class="clear_both"></div>
		</ul>
	</div>
</div>
<div class="mid">
	<h1><em><strong>注册</strong></em></h1>
	<div class="mid_main">
	<form action= "login.do" method="post">
		<ul>
			<li>
				<input type="text" id="userName" name="userName" placeholder="用户名" autocomplete="off">
				<p id="userNamePrompt"></p>
			</li>
			<li>
				<input type="password" id="password" name="password" placeholder="密码" autocomplete="off">
				<p id="passwdPrompt1"></p>
			</li>
			<li>
				<input type="password" id="password_confirm" name="password_confirm" placeholder="确认密码" autocomplete="off">
				<p id="passwdPrompt2"></p>
			</li>
			<li>
				<input type="submit" id="mid_main_btn" class="mid_main_btn" value="同意协议并登录">
			</li>
		
			<li class="li1">---------------大数据论坛协议书--------------</li>
			<li><a href="login.jsp">已有账号？立即登陆</a></li>
		</ul>
		</form>
	</div>
	<div class="footer">
		<p>Copyright 2017 BigData forum 大数据论坛（吉吉国王小组）版权所有<br/>
		中国南京 江宁区 金陵科技学院 咨询热线：000-000-0000 666-666-6666<br/><br/>
		</p>
		<p>吉春 王顺 章海蔚 薛家乐 王琪 周野</p>
	</div>
</div>
</body>
</html>
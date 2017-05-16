<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.0.js"></script>
<script type="text/javascript" src="js/loginUsernameCheck.js"></script>
<script type="text/javascript" src="js/loginPasswdCheck.js"></script>
<script type="text/javascript" src="js/mouse_hover.js"></script>
<script type="text/javascript" src="js/verification.js"></script>
<link rel="stylesheet" href="css/login.css">
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
		<!-- 登陆 -->
		<div class="mid_main" id="u_login">
		
			<ul>
				<li class="mid_main_li1">用户登陆</li>
				<li class="mid_main_li2"><input id="userName" name="userName"
					type="text" placeholder="用户名" autocomplete="off">
					<p id="namePrompt"></p></li>
				<li class="mid_main_li3"><input id="password" name="password"
					type="password" placeholder="密码" autocomplete="off">
					<p id="passwdPrompt">区分大小写哟！</p></li>
				<li class="mid_main_li4"><input class="mid_main_button"
					id="load" type="submit" value="登陆"></li>
				<li class="mid_main_li5"><a class="mid_main_href"
					href="register.jsp">还没有账号？立即注册</a> <br>
				<br>
				<a id="forget" class="mid_main_href" href="javascript:void(0)" onclick="show()" >忘记密码？</a></li>
				
			</ul>
	
		</div>
			<div class= "forgetpd" id = "forgetpd" style="display: none;">
			<div class="forgetpd-ct">
					用户名:<input type="text"><br>
					 密码：<input type="password"><br>
					重复密码：<input type="password"><br> 
					手机号码：<input type="text" name="phone" id= "phone"><br>
					验证码：<input type="text" id="code"><button type="submit" id="verificatiocode">发送验证码</button><br>
					<button type="submit" style="width: 80px;height: 40px" id="submit_1">点击提交</button>
					</div>
					</div>

		<div class="footer">
			<p>
				Copyright 2017 BigData forum 大数据论坛（吉吉国王小组）版权所有<br /> 中国南京 江宁区 金陵科技学院
				咨询热线：000-000-0000 666-666-6666<br />
				<br />
			</p>
			<p>吉春 王顺 章海蔚 薛家乐 王琪 周野</p>
		</div>
	</div>

</body> 

<script>

    function show(){
       document.getElementById('u_login').style.display='none';
       document.getElementById('forgetpd').style.display='block';

       
    };




</script>
</html>
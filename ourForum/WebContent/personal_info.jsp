<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/personal_info.css">
<script type="text/javascript" src="js/jquery-3.2.0.js"></script>
<script type="text/javascript" src="js/personalInfo.js"></script>
<script type="text/javascript" src="js/mouse_hover.js"></script>
<title>Insert title here</title>
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
<div class="main_bg">
	<div class="user">
		<ul class="user_set">
			<li class="user_name"><em>mayuyu</em></li>
			<!-- 头像 图片 -->
			<li class="user_set"><a href="personal_info.jsp"><img src="image/user.jpg" class="user_pic"></a></li>
		</ul>
		<div class="clear_both"></div>
	</div>
	<div class="mainForum">
		<div class="left">
			<div class="left_pic"><img src="image/user.jpg" class="left_pic_set"></div>
			<div class="left_changePic"><a href="">更换头像</a></div>
		</div>
		<div class="right">
			<table class="r_table">
				<tr>
					<td>用户名：</td>
				</tr>
				<tr>
					<td><input type="text" class="" id="username" value="" name="username" autocomplete="off"></td>
					<td id="username_prompt" class="prompt"></td>
				</tr>
				<tr>
					<tr><td>性别：</td></tr>
					<tr><td><label><input type="radio" id="sex" name="sex" value="male" checked autocomplete="off">男</label>
						&nbsp&nbsp&nbsp&nbsp&nbsp<label><input type="radio" name="sex" value="female" autocomplete="off">女</label></td>
					</tr>
				</tr>
				<tr>
					<td>邮箱：</td>
				</tr>
				<tr>
					<td><input type="text" id="email" name="email" value="" autocomplete="off"></td>
					<td id="email_prompt" class="prompt"></td>
				</tr>
				<tr>
					<td>职业：</td>
				</tr>
				<tr>
					<td><textarea maxlength="25" id="profession" name="profession" style="resize:none"></textarea></td>
					<td id="profession_prompt" class="prompt"></td>
				</tr>
				<tr>
					<td>简介：</td>
				</tr>
				<tr>
					<td><textarea maxlength="100" id="introduce" name="introduce" style="resize:none"></textarea></td>
					<td id="introduce_prompt" class="prompt"></td>
				</tr>
				<tr>
					<td>地址：</td>
				</tr>
				<tr>
					<td><textarea maxlength="50" id="address" name="address" style="resize:none"></textarea></td>
					<td id="address_prompt" class="prompt"></td>
				</tr>
				<tr>
					<td><input class="submit" type="submit" value="保存"></td>
				</tr>
			</table>
		</div>
		<div class="clear_both"></div>
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
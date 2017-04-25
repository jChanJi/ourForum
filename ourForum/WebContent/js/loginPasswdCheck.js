/**
 * 验证密码信息
 */
$(document).ready(function(){
	$("#password").focus(function(){
		$("#passwdPrompt").html("<font color=\"white\">请输入密码</font>");
	});
	$("#password").blur(function(){
		$("#passwdPrompt").html("");
	});
	$("#load").click(function passCheck(){
		var nameStr = $("#userName").val();
		var passStr = $("#password").val();
		$.ajax({
			type:"POST",
			url:"loginPasswdcheck?userName=" + nameStr + "&password=" + passStr,
			dataType:"text",
			success:function(data){
				if(data.length == 1){
					$("#passwdPrompt").html("<font color=\"red\">用户名或密码错误</font>");
				}else{
					window.location.href="./main.jsp";
					//$("#login_success").attr = ("href","${pageContext.request.contextPath}/main.jsp");
				}
			},
			error:function(){
				alert("error!");
			},
		});
	});
});

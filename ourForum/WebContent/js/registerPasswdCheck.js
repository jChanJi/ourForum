/**
 * 验证注册密码
 */
$(document).ready(function(){
	$("#password").focus(function(){
		$("#passwdPrompt1").html("<font color=\"white\">请输入密码</font>");
	});
	$("#password").blur(function(){
		$("#passwdPrompt1").html("");
	});
	$("#mid_main_btn").click(function passCheck(){
		var nameStr = $("#userName").val();
		var passStr = $("#password").val();
		var passConfStr = $("#password_confirm").val();
		$.ajax({
			type:"POST",
			url:"registerPasswdCheck?userName=" + nameStr + "&password=" + passStr + "&password_confirm=" + passConfStr,
			dataType:"text",
			success:function(data){
				if(data.length == 2){
					$("#passwdPrompt2").html("<font color=\"red\">密码确认有误</font>");
				}else{
					window.location.href="./login.jsp";
				}
			},
			error:function(){
				alert("error!");
			},
		});
	});
});

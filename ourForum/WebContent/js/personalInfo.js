/**
 * 个人信息修改页面信息验证
 */
$(document).ready(function(){
	$("#username").focus(function(){
		$("username_prompt").html("<font color=\"white\">请输入字母或数字，不得超过16位</font>");
	});
	$("#username").blur(function(){
		var nameStr = $("#username").val();
		$.ajax({
			type:"POST",
			url:"personalInfo?username=" + nameStr,
			dataType:"text",
			success:function(data){
				$("#username_prompt").html(data);
			},
			error:function(){
				alert("error");
			},
		});
	});
	
	//邮箱验证
	$("#email").focus(function(){
		$("#email_prompt").html("<font color=\"white\">请输入可用邮箱</font>");
	});
	$("#email").blur(function(){
		var email = $("#email").val();
		$.ajax({
			type:"POST",
			url:"personalInfoEmail?email=" + email,
			dataType:"text",
			success:function(data){
				$("#email_prompt").html(data);
			},
			error:function(){
				alert("error");
			},
		});
	});
	
	
});
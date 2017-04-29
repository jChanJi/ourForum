/**
 * 注册用户名验证
 */
$(document).ready(function(){
	$("#userName").focus(function(){
		$("#userNamePrompt").html("<font color=\"white\">请输入字母或数字，不得超过16位</font>");
	});
	$("#userName").blur(function(){
		var nameStr = $("#userName").val();
		$.ajax({
			type:"POST",
			url:"registerCheck?userName=" + nameStr,
			dataType:"text",
			success:function(data){
				if(data.length == 1){
					$("#userNamePrompt").html("<font color=\"white\">用户名可以使用</font>");
					$("#mid_main_btn").removeAttr("disabled");
				}else if(data.length == 2){
					$("#userNamePrompt").html("<font color=\"red\">用户名不能为空</font>");
					$("#mid_main_btn").attr({"disabled":"disabled"});
				}else if(data.length == 3){
					$("#userNamePrompt").html("<font color=\"red\">含有非法字符</font>");
					$("#mid_main_btn").attr({"disabled":"disabled"});
				}else if(data.length == 4){
					$("#userNamePrompt").html("<font color=\"red\">用户名过短</font>");
					$("#mid_main_btn").attr({"disabled":"disabled"});
				}
			},
			error:function(){
				alert("error");
			},
		});
	});
	
});
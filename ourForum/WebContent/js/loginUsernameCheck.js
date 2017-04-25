/**
 * 提示用户名
 */

$(document).ready(function(){
	$("#userName").focus(function(){
		$("#namePrompt").html("<font color=\"white\">请输入字母或数字，不得超过16位</font>");
	});
	$("#userName").blur(function(){
		var nameStr = $("#userName").val();
		//var passStr = $("#password").val();
		$.ajax({
			type:"POST",
			url:"logincheck?userName=" + nameStr,
			//url:"logincheck?userName=" + nameStr + "&password=" + passStr,
			dataType:"text",
			success:function(data){
				if(data.length == 1){
					$("#namePrompt").html("<font color=\"white\">用户名可以使用</font>");
				}else if(data.length == 2){
					$("#namePrompt").html("<font color=\"red\">用户名不能为空</font>");
				}else if(data.length == 3){
					$("#namePrompt").html("<font color=\"red\">含有非法字符</font>");
				}else if(data.length == 4){
					$("#namePrompt").html("<font color=\"red\">用户名过短</font>");
				}
			},
			error:function(){
				alert("error");
			},
		});
	});
	
});

/**var xmlHttp = false;
function createXMLHttpRequest() {
	if (window.XMLHttpRequest){
		xmlHttp = new XMLHttpRequest();
	}else if (window.ActiveXObject){
		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
}

function check(){
	createXMLHttpRequest();
	xmlHttp.onreadystatechange = callback;
	var nameStr = $("#userName").val();
	var passStr = $("#password").val();
	var url = "logincheck?userName=" + nameStr + "&password=" + passStr;
	xmlHttp.open("GET",url);
	//xmlHttp.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=UTF-8");
	xmlHttp.send(null);
}

function callback(){
	alert(xmlHttp.readyState);
	if(xmlHttp.readyState == 4){
		if(xmlHttp.status == 200){
			var str = xmlHttp.responseText;
			alert(str);
			if(str.length == 1){
				$("#namePrompt").html("用户名可以使用");
			}else if(str.length == 2){
				$("#namePrompt").html("用户名不能为空");
			}
		}
	}
}*/
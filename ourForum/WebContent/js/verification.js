
$(document).ready(function(){
	
	$("#verificatiocode").click(function(){
		$.ajax({
			type:"POST",
			url:"forgetpd",
			//url:"logincheck?userName=" + nameStr + "&password=" + passStr,
			dataType:"text",
			async: true,   //是否为异步请求
	        cache: false,  //是否缓存结果
			data:{
				 phone:$("#phone").val()
			},
			success:function(data){
				
			},
			error:function(){
				out.print("error!");
			},
		});	
		
	});
		
	$("#submit_1").click(function(){
		$.ajax({
			type:"POST",
			url:"modifysucess",
			//url:"logincheck?userName=" + nameStr + "&password=" + passStr,
			dataType:"text",
			async: true,   //是否为异步请求
	        cache: false,  //是否缓存结果
			data:{
				 code:$("#code").val()
			},
			success:function(data){
				if(data=="success"){
					location.href="./login.jsp";
				}
				else{
					alert("fail");
				}
			},
			error:function(){
				out.print("error!");
			},
		});	
		
	});

	
});
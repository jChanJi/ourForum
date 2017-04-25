/**
 * 图片轮播效果
 */
//标识轮播到第几个图片
var sign = 2;
function showPic(index){
	//轮播效果中当前显示的图片
	var foucusImg = document.getElementById("focusImg");
	//图片路径
	var imgSrc = "image/hot";
	imgSrc = imgSrc + index+".jpg";
	//更换照片
	focusImg.src = imgSrc;
	//获取数字列表
	var lis = document.getElementsByClassName("focusBox")[0].getElementsByTagName("li");
	//移除所有轮播按钮的css样式
	for(var i = 0;i<lis.length;i++){
		lis[i].className="";
	}
	//设置轮播图片对应图片的轮播按钮样式
	lis[index-1].className = "cur";
}
	//对轮播图片进行计算处理
	function setCurrentPic(){
		showPic(sign);
		sign++;
		if(sign == 5){
			sign = 1;
		}
	}
	//窗体加载完成时指定显示的图片
	window.onload = function(){
		showPic(1);
}
	//设置定时器
	window.setInterval("setCurrentPic()",2000);
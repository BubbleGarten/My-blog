<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<script src="${basePath}/static/js/jQuery.js"></script>
<!-- 登录 -->
<div class='content'>
	<input type="text" id="username" placeholder="请输入用户名、手机号"> 
	<br>
	<br>
	<input type="password" id="password" placeholder="请输入密码">	
	<button class="login_btn" onclick="login()">登陆</button>
</div>
<script>
	function login(){
		var username=$('#username').val();
		var password=$('#password').val();
		alert(username + "," + password);
		$.ajax({
			type:"post",
			url:"loginController.jsp",
			data:{"username":username,"password":password},//传递给controller的json数据
			error:function(){
	            alert("登陆出错！");
	        },
	        success:function(data){ //返回成功执行回调函数。
                if(data == -1){
                    alert('用户名和密码不能为空！');
                }else if(data == -2){
                    alert('用户名不存在！');
                }else if(data == -3){
                    alert('用户名或密码错误！');
                }else{
                    //登录成功后返回首页
                    window.location.href = "${basePath}"; 
                }
            }
		});
	}
</script>
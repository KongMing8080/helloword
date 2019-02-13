<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
</head>
<body>
	<h3>登录</h3>
	<div>
		<label for="username">用户名: </label>
		<input type="text" id="username" name="username">
		<br/>
		<label for="password">密码: </label>
		<input type="password" id="password" name="password">
		<br/>
		<button id="loginBtn">登录</button>
	</div>
	<script type="text/javascript">
		$(function(){
			$('#loginBtn').bind({'click':function(){
				var username = $.trim($('#username').val());
				var password = $.trim($('#password').val());
				if(username!="" && password!=""){
					//alert("登录...");
					$.ajax({
						url:baseUrl+"/login/toLogin",
						type:"POST",
						data:{accounts:username, password:password},
						success:function(result){
							try{
								if(result.status=='1'){ //成功
									//alert(result.message);
								window.location.href=baseUrl+"/login/fun/menu";
								}else{ //失败
									alert('登录失败: '+result.message);
								}
							}catch(e){
								alert('登录失败: '+e);
							}
						},
						error:function (XMLHttpRequest, textStatus, errorThrown) {
						    // 通常 textStatus 和 errorThrown 之中
						    // 只有一个会包含信息
						    //this; // 调用本次AJAX请求时传递的options参数
						    alert('登录失败: '+textStatus);
						}
					});
				}else{
					alert("用户名或密码不能为空! ");
				}
			}});
		})
	</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../common/header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>功能页面</title>
</head>
<body>
	<h3>用户信息</h3>
	<p>
		用户名: <c:out value="${uAccounts }"></c:out>
	</p>
	<div>
		<button>服务包列表</button>
	</div>
	<script type="text/javascript">
		$(function(){
			
		})
	</script>
</body>
</html>
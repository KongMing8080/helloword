<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<fmt:requestEncoding value="utf-8" />
<meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no">
<script type="text/javascript" src="<c:url value="/support/jquery/jquery-3.2.1.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/support/bootstrap/js/bootstrap.min.js"/>"></script>
<link rel="stylesheet" type="text/css" href="<c:url value="/support/bootstrap/css/bootstrap.min.css" />" />
<link rel="stylesheet" type="text/css" href="<c:url value="/support/bootstrap/css/bootstrap-theme.min.css" />" />
<script>
	var baseUrl='<%=request.getContextPath()%>';
</script>
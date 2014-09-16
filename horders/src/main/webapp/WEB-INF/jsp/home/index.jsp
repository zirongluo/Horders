<%@ include file="/WEB-INF/jsp/common/common.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Horders</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/sys/basic.css" />
<script src="<c:url value="/resources/js/lib/jquery-1.7.1.min.js"/>"></script>
</head>
<body>
	<div class="header">
		<h2>HORDERS</h2>
		<h1>
			<a href="home/home" target="bottomFrame">Home</a>
		</h1>
		<h1>
			<a href="code/get_code" target="bottomFrame">Get Code</a>
		</h1>
		<h1>
			<a href="topup/topup" target="bottomFrame">Top Up</a>
		</h1>
		<h1>
			<a href="http://www.tmall.com/" target="bottomFrame">FAQ</a>
		</h1>
		<h1>
			<a href="http://www.tmall.com/" target="bottomFrame">Suggestion</a>
		</h1>
	</div>
	<div class="bottom">
		<!-- 
		<iframe src="${pageContext.request.contextPath}/index.jsp"
			name="bottomFrame" id="bottomFrame" frameborder="0"
			marginwidth="0" marginheight="0" scrolling="no"scrolling="auto" width="100%" height="100%"></iframe>
			 -->
		<iframe src="home/home" name="bottomFrame" id="bottomFrame"
			frameborder="0" scrolling="no" class="bottom_frame"></iframe>
	</div>
</body>
</html>
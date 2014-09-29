<%@ include file="/WEB-INF/jsp/common/common.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>home</title>
<style type="text/css">
body {
	margin: 0px;
	width:1600px;
	height: 925px;
		background: url(${pageContext.request.contextPath}/resources/images/home_background.png);
		filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale');
	border: 0px;
	background-size: 100% 100%;
	overflow-x: scroll;
}

.left {
	height: 920px;
	width: 60%;
	float: left;
}

.right {
	height: 920px;
	width: 30%;
	float: left;
}

.right_top {
	position:relative;
	top: 100px;
	left: 20px;
	width: 80%;
	height: 150px;
			background: #FFFFFF;

}

.right_bottom {
	position:relative;
	background: #FFFFFF;
	top: 200px;
	left: 20px;
	width: 80%;
	height: 480px;
}
</style>
</head>
<body>
	<div class="left">
		<iframe src="${pageContext.request.contextPath}/page/home/welcome.jsp"
			name="bottomFrame" id="bottomFrame" frameborder="no" border="0"
			marginwidth="0" marginheight="0" scrolling="no"
			allowtransparency="yes" scrolling="auto" width="100%" height="100%"
			noresize="noresize"></iframe>
	</div>
	<div class="right">
		<div class="right_top">
			<iframe src="${pageContext.request.contextPath}/page/home/signin.jsp"
				name="bottomFrame" id="bottomFrame" frameborder="no" border="0"
				marginwidth="0" marginheight="0" scrolling="no"
				allowtransparency="yes" scrolling="auto" width="100%" height="100%"
				noresize="noresize"></iframe>
		</div>
		<div class="right_bottom">
			<iframe
				src="${pageContext.request.contextPath}/page/home/register.jsp"
				name="bottomFrame" id="bottomFrame" frameborder="no" border="0"
				marginwidth="0" marginheight="0" scrolling="no"
				allowtransparency="yes" scrolling="auto" width="100%" height="100%"
				noresize="noresize"></iframe>
		</div>
	</div>
</body>
</html>
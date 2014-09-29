<%@ include file="/WEB-INF/jsp/common/common.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.title {
	margin: 0px;
	margin-top: 50px;
	margin-left: 10px;
	width: 100px;
	height: 30px;
	font-family: Arial;
	font-size: 24px;
	font-weight: bold;
	font-style: normal;
	text-decoration: none;
	color: #666666;
}

.tap {
	margin: 0px;
	width: 100%;
	height: 30px;
}

.tap_1 {
	margin: 0px;
	margin-left: 20px;
	font-family: Arial;
	font-size: 13px;
	font-weight: bold;
	font-style: normal;
	text-decoration:none;
	color: #000000;
	width: 100px;
	height: 30px;
	line-height: 30px;
	background:#c1cdcd;
	float: left;
}

.tap_2 {
	margin: 0px;
	margin-left: 20px;
	font-family: Arial;
	font-size: 13px;
	font-weight: bold;
	font-style: normal;
	text-decoration:none;
	color: #000000;
	width: 130px;
	height: 30px;
	line-height: 30px;
	background:#c1cdcd;
	float: left;
}

.tap a{
margin:0px;
margin-left:5px;
	font-family: Arial;
	font-size: 13px;
	font-weight: bold;
	font-style: normal;
	text-decoration:none;
	color: #000000;
}

.line{
margin:0px;
width:100%;
height:1px;
background:#c1cdcd;
}

.bottom {
	margin: 0;
	margin-top:10px;
	height: 100%;
	width: 100%;
}

.bottom_frame{
	margin: 0px;
	width:100%;
	height: 100%;
	marginwidth:0;
	marginheight:0;
	scrolling:no;
}
</style>
</head>
<body>
	<h1 class="title">Record</h1>
	<div id="tap" class="tap">
		<h2 class="tap_1">
			<a href="${pageContext.request.contextPath}/topupInfo" target="record">Top Up</a>
		</h2>
		<h2 class="tap_2">
			<a href="${pageContext.request.contextPath}/verficationCodeInfo" target="record">Verification Code</a>
		</h2>
	</div>
	<div class="line"></div>
	<div class="bottom">
		<iframe src="${pageContext.request.contextPath}/topupInfo" name="record" id="record"
			frameborder="0" scrolling="no" class="bottom_frame"></iframe>
	</div>
</body>
</html>
<%@ include file="/WEB-INF/jsp/common/common.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	margin: 0px;
	width:1600px;
	height: 925px;
	background: #FFFFFF;
}

.wrap {
	position: relative;
	margin: 0;
	left: 15%;
	height: 100%;
	width: 70%;
	background:
		url(${pageContext.request.contextPath}/resources/images/new_get_code_bg.png)
		no-repeat;
}

.content {
	position: relative;
	margin: 0;
	left: 5%;
	top: 10%;
	width: 90%;
	height: 90%;
	background: #FFFFFF;
}

.interaction {
	margin: 0px;
	height: 100%;
	float: left;
	width: 700px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #333333;
	background: transparent;
}

.info {
	margin: 0px;
	height: 100%;
	float: left;
	width: 300px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #333333;
	background: transparent;
}

.user {
	margin: 0px;
	width: 250px;
	height: 150px;
	background: #ffffff;
}

.contact {
	margin-top: 100px;
	margin-left: 0px;
	width: 250px;
	height: 150px;
	background: #ffffff;
}

.wel {
	margin-left: 10%;
	margin-top: 30px;
	width: 80%;
	height: 190px;
}

.left {
	margin-top: 30px;
	background: transparent;
	height: 100%;
	float: left;
	width: 35%;
}

.item {
	margin-top: 0px;
	margin-left: 200px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #333333;
}

.number {
	margin-top: 70px;
	margin-left: 130px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #333333;
}

.verification {
	margin-top: 99px;
	margin-left: 110px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #333333;
}

.right {
	margin-top: 30px;
	margin-left: 0px;
	background: transparent;
	height: 100%;
	float: left;
	width: 50%;
}

.selection {
	position: relative;
	margin-left: 0px;
	width: 333px;
	height: 22px;
	font-family: Arial;
	font-size: 13px;
	color: #000000;
	font-style: normal;
	font-weight: normal;
	text-decoration: none;
	margin-left: 0px;
}

.keyword {
	margin-top: 10px;
	position: relative;
	width: 150px;
	height: 22px;
	margin-left: 0px;
	font-family: Arial;
	text-align: left;
	word-wrap: break-word;
	float: none;
}

.search {
	margin-top: 10px;
	width: 50px;
	height: 27px;
	background:
		url(${pageContext.request.contextPath}/resources/images/search.png);
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale');
	border: 0px;
	background-size: 100% 100%;
	float: none;
}

.add {
	margin-top: 10px;
	width: 80px;
	height: 27px;
	background:
		url(${pageContext.request.contextPath}/resources/images/search.png);
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale');
	border: 0px;
	background-size: 100% 100%;
	float: none;
}

.num {
	position: relative;
	margin-top: 35px;
	width: 333px;
	height: 22px;
	font-family: Arial;
	font-size: 13px;
	color: #000000;
	font-style: normal;
	font-weight: normal;
	text-decoration: none;
	margin-left: 0px;
}

.capture {
	margin-top: 30px;
	margin-left: 100px;
	width: 80px;
	height: 27px;
	background:
		url(${pageContext.request.contextPath}/resources/images/search.png);
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale');
	border: 0px;
	background-size: 100% 100%;
	float: none;
}

.release {
	margin-top: 30px;
	margin-left: 50px;
	width: 80px;
	height: 27px;
	background:
		url(${pageContext.request.contextPath}/resources/images/search.png);
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale');
	border: 0px;
	background-size: 100% 100%;
	float: none;
}

.ver {
	margin-top: 30px;
	width: 333px;
	height: 120px;
	margin-left: 0px;
	font-family: Arial;
	text-align: left;
	word-wrap: break-word;
	float: none;
}

.capture_1 {
	margin-top: 30px;
	margin-left: 250px;
	width: 80px;
	height: 27px;
	background:
		url(${pageContext.request.contextPath}/resources/images/search.png);
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale');
	border: 0px;
	background-size: 100% 100%;
	float: none;
}

.username {
	margin: 10px;
	font-family: Arial;
	font-size: 20px;
	font-weight: bold;
	font-style: normal;
	text-decoration: none;
	height: 20px;
	width: 39%;
	color: #333333;
	background: transparent;
	float: left;
}

.username h1 {
	margin: 0px;
	width: 100%;
	height: :100%;
	font-family: Arial;
	font-size: 20px;
	font-weight: bold;
	font-style: normal;
	text-decoration: none;
}

.status {
	margin: 10px;
	height: 20px;
	width: 35%;
	font-family: Arial;
	font-size: 14px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	background: transparent;
	color: #0654BA;
	float: right;
}

.status a {
	margin: 0px;
	width: 100%;
	height: :100%;
	font-family: Arial;
	font-size: 14px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	text-align: left;
	color: #0654BA;
}

.email {
	margin-left: 10px;
	margin-top: 30px;
	height: 20px;
	width: 25%;
	font-family: Arial;
	font-size: 14px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #333333;
	background: transparent;
	float: left;
}

.email h1 {
	margin: 0px;
	width: 100%;
	height: :100%;
	font-family: Arial;
	font-size: 14px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #333333;
}

.email_detail {
	margin-left: 10px;
	margin-top: 30px;
	height: 20px;
	width: 60%;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #E47911;
	float: right;
	background: transparent;
}

.email_detail h1 {
	margin: 0px;
	width: 100%;
	height: :100%;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	text-align: left;
	color: #E47911;
}

.head {
	margin : 0px;
	width: 100%;
	height: 70px;
	margin: 0px;
}

.bottom {
	margin : 0px;
	width: 100%;
	height: 90%;
	margin: 0px;
}

.label {
	margin-left: 50px;
	margin-top: 15px;
	width:43px;
	height:43px;
	float: left;
}

.title {
	margin: 0px;
	margin-left: 30px;
	margin-top: 17px;
	font-family: Arial;
	font-size: 28px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	text-align: left;
	float: left;
}
</style>
</head>
<body>
	<div class="wrap">
		<div class="content">
			<div class="head">
				<img
					src="${pageContext.request.contextPath}/resources/images/top_up_label.jpg"
					class="label" />
				<h1 class="title">Top Up</h1>
			</div>
			<div class="bottom">
			<iframe src="${pageContext.request.contextPath}/page/topup/topup_content.jsp"
				name="bottomFrame" id="bottomFrame" frameborder="no" border="0"
				marginwidth="0" marginheight="0" scrolling="no"
				allowtransparency="yes" scrolling="auto" width="100%" height="100%"
				noresize="noresize"></iframe>
			</div>
		</div>

	</div>
</body>
</html>
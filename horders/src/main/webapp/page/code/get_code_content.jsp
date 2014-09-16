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

.content {
	width: 100%;
	height: 100%;
	background: transparent;
}

.interaction {
	margin: 0px;
	margin-left: 30px;
	height: 480px;
	float: left;
	width: 500px;
	border: 1px;
	border-style: solid;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #333333;
	background: transparent;
	font-family: Arial;
	border-color: #D0D0D0;
}

.info {
	margin: 0px;
	margin-left:50px;
	height: 100%;
	float: left;
	width: 399px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #333333;
	background: transparent;
}

.user {
	margin: 50px;
	width: 250px;
	height: 150px;
	background: #ffffff;
}

.contact {
	margin-top: 100px;
	margin-left: 50px;
	width: 250px;
	height: 150px;
	background: #ffffff;
}

.left {
	margin-top: 30px;
	background: transparent;
	height: 100%;
	float: left;
	width: 37%;
}

.item {
	margin-top: 0px;
	margin-left: 115px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #333333;
}

.number {
	margin-top: 80px;
	margin-left: 45px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #333333;
}

.verification {
	margin-top: 99px;
	margin-left: 20px;
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
	height: 100%;
	float: left;
	width: 57%;
}

.selection {
	position: relative;
	margin-left: 0px;
	width: 100%;
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
	width: 110px;
	height: 22px;
	margin-left: 0px;
	font-family: Arial;
	text-align: left;
	word-wrap: break-word;
	float: none;
}

.search {
	margin-top: 10px;
	margin-left: 10px;
	width: 50px;
	height: 32px;
	background:
		url(${pageContext.request.contextPath}/resources/images/search.png);
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale');
	border: 0px;
	background-size: 100% 100%;
	float: none;
	width: 50px;
}

.add {
	margin-top: 10px;
	margin-left: 20px;
	width: 80px;
	height: 32px;
	background:
		url(${pageContext.request.contextPath}/resources/images/search.png);
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale');
	border: 0px;
	background-size: 100% 100%;
	float: none;
}

.num {
	margin: 0px;
	position: relative;
	margin-top: 35px;
	width: 100%;
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
	margin-top: 10px;
	margin-left: 110px;
	width: 80px;
	height: 32px;
	background:
		url(${pageContext.request.contextPath}/resources/images/search.png);
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale');
	border: 0px;
	background-size: 100% 100%;
	float: none;
}

.release {
	margin: 0px;
	margin-top: 10px;
	margin-left: 10px;
	width: 80px;
	height: 32px;
	background:
		url(${pageContext.request.contextPath}/resources/images/search.png);
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale');
	border: 0px;
	background-size: 100% 100%;
	float: none;
}

.ver {
	margin: 0px;
	margin-top: 50px;
	margin-left: 0px;
	width: 100%;
	height: 120px;
	font-family: Arial;
	text-align: left;
	word-wrap: break-word;
	float: none;
}

.capture_code {
	margin-top: 10px;
	margin-left: 200px;
	width: 80px;
	height: 32px;
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
</style>
</head>
<body>
	<div class="content">
		<div class="interaction">
			<div class="left">
				<h1 class="item">Item:</h1>
				<h1 class="number">Phone number:</h1>
				<h1 class="verification">Pverification Vode:</h1>
			</div>
			<div class="right">
				<SELECT id="selection" class="selection">
					<OPTION selected value="HotItems">Hot Items:</OPTION>
					<OPTION value="google confirm">google confirm</OPTION>
					<OPTION value="Facebook confirm">Facebook confirm</OPTION>
					<OPTION value="twitter confirm">twitter confirm</OPTION>
					<OPTION value="apple id confirm">apple id confirm</OPTION>
					<OPTION value="ebay confirm">ebay confirm</OPTION>
					<OPTION value="Amazon confirm">Amazon confirm</OPTION>
					<OPTION value="paypal confirm">paypal confirm</OPTION>
					<OPTION value="instagram confirm">instagram confirm</OPTION>
				</SELECT> <br> <input id="keyword" type="text" value="Search"
					class="keyword" />
				<button class="search">search</button>
				<button class="add">Add new</button>
				<br> <input id="num" type="text" value="" class="num" /> <br>
				<button class="capture">Capture</button>
				<button class="release">Release</button>
				<br> <input id="ver" type="text" value="" class="ver" />
				<button class="capture_code">Capture</button>
			</div>
		</div>
		<div class="info">
			<iframe
				src="${pageContext.request.contextPath}/page/code/info.jsp"
				name="bottomFrame" id="bottomFrame" frameborder="no" border="0"
				marginwidth="0" marginheight="0" scrolling="no"
				allowtransparency="yes" scrolling="auto" width="100%" height="100%"
				noresize="noresize"></iframe>
			<!--
			<div class="user">
				<div class="username">
					<h1>Shen Xie</h1>
				</div>
				<div class="status">
					<a href="home/home" target="bottomFrame">[Sign Out]</a> <br>
				</div>
				<div class="email">
					<h1>Email:</h1>
				</div>
				<div class="email_detail">
					<h1>zirongluo@163.com</h1>
				</div>
			</div>
			<div class="contact">
				<div class="username">
					<h1>Shen Xie</h1>
				</div>
				<div class="status">
					<a href="home/home" target="bottomFrame">[Sign Out]</a> <br>
				</div>
				<div class="email">
					<h1>Email:</h1>
				</div>
				<div class="email_detail">
					<h1>zirongluo@163.com</h1>
				</div>

			</div>
			  -->
		</div>
	</div>
</body>
</html>
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
	width: 100%;
	height: 100%;
}

.user {
	margin: 0px;
	margin-top: 20px;
	margin-left: 50px;
	width: 270px;
	height: 130px;
	border: 1px;
	border-style: solid;
	background: #ffffff;
	border-color: #D0D0D0;
}

.contact {
	margin-top: 100px;
	margin-left: 50px;
	border: 1px;
	width: 330px;
	height: 450px;
	border-style: solid;
	border-color: #D0D0D0;
}

.username {
	margin: 10px;
	font-family: Arial;
	font-size: 20px;
	font-weight: bold;
	font-style: normal;
	text-decoration: none;
	height: 20px;
	width: 35%;
	color: #333333;
	background: transparent;
	float: left;
}

.account {
	height: 35px;
	width: 100%;
	background:
		url(${pageContext.request.contextPath}/resources/images/title_bar.png);
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale');
	border: 0px;
	background-size: 100% 100%;
}

.notify {
	height: 35px;
	width: 100%;
	background:
		url(${pageContext.request.contextPath}/resources/images/title_bar.png);
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale');
	border: 0px;
	background-size: 100% 100%;
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
	margin-right: 0px;
	margin-top: 13px;
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
	margin: 0px;
	margin-left: 10px;
	margin-top: 10px;
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
	margin: 0px;
	margin-left: 5px;
	margin-top: 7px;
	margin-right: 15px;
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
	height: 20px;
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

.dotted_line {
	margin: 0px;
	margin-top: 5px;
	width: 100%;
	height: 1px;
}

.dotted_line_norify {
	margin: 0px;
	margin-top: 5px;
	margin-bottom: 3px;
	width: 100%;
	height: 1px;
}

.balance {
	margin: 10px;
	font-family: Arial;
	font-size: 20px;
	font-weight: bold;
	font-style: normal;
	text-decoration: none;
	height: 20px;
	width: 45%;
	color: #333333;
	background: transparent;
	float: left;
	font-family: Arial;
}

.balance h1 {
	margin: 0px;
	width: 100%;
	height: :100%;
	font-family: Arial;
	font-size: 20px;
	font-weight: bold;
	font-style: normal;
	text-decoration: none;
}

.money {
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #E47911;
}

.topup {
	margin: 10px;
	margin-left: 0px;
	margin-right: 0px;
	margin-top: 13px;
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
	height: 20px;
	margin-right: 0px;
}

.topup a {
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

.hints {
	margin: 10px;
	font-family: Arial;
	font-size: 20px;
	font-weight: bold;
	font-style: normal;
	text-decoration: none;
	height: 20px;
	width: 35%;
	color: #333333;
	background: transparent;
	float: left;
}

.hints h1 {
	margin: 0px;
	width: 100%;
	height: :100%;
	font-family: Arial;
	font-size: 20px;
	font-weight: bold;
	font-style: normal;
	text-decoration: none;
}

ol {
	position: relative;
	margin-right: 10px;
}

.wrod {
	font-family: Arial;
	font-size: 15px;
	font-style: normal;
	text-decoration: none;
}
.wrod_detail {
	font-family: Arial;
	font-size: 15px;
	font-style: normal;
	text-decoration: none;
	text-align: justify;
	text-justify: distribute;
}
</style>
</head>
<body>
	<div class="user">
		<div class="account">
			<div class="username">
				<h1>Sen Xie</h1>
			</div>
			<div class="status">
				<a href="home/home" target="bottomFrame">[Sign Out]</a> <br>
			</div>
		</div>
		<div class="email">
			<h1>Email:</h1>
		</div>
		<div class="email_detail">
			<h1>zirongluo@163.com</h1>
		</div>
		<img
			src="${pageContext.request.contextPath}/resources/images/dotted_line.png"
			class="dotted_line">
		<!-- 
		<div class="balance">
			<h1>Balance:  <span class="money">$5.0</span></h1>
		</div>
		<div class="status">
			<a href="home/home" target="bottomFrame">[Top Up]</a> <br>
		</div>
		 -->
		<div class="balance">
			<h1>
				Balance: <span class="money">$5.0</span>
			</h1>
		</div>
		<div class="topup">
			<a href="home/home" target="bottomFrame">[Top Up]</a> <br>
		</div>
	</div>
	<div class="contact">
		<div class="notify">
			<div class="hints">
				<h1>Hints</h1>
			</div>
		</div>
		<!--
		<div class="email">
			<h1>Email:</h1>
		</div>
		<div class="email_detail">
			<h1>zirongluo@163.com</h1>
		</div>
		<img
			src="${pageContext.request.contextPath}/resources/images/dotted_line.png"
			class="dotted_line">
		<div class="balance">
			<h1>
				Balance: <span class="money">$5.0</span>
			</h1>
		</div>
		<div class="topup">
			<a href="home/home" target="bottomFrame">[Top Up]</a> <br>
		</div>
		-->
		<ol>
			<li class="wrod"><span class="wrod_detail ">When you choose the wrong item,
					forexample, you want to verify Gmail, but you choose reset Gmail
					password, then you will not receive the verification code.</span> <img
				src="${pageContext.request.contextPath}/resources/images/dotted_line.png"
				class="dotted_line_norify"></li>
			<li class="wrod"><span calss="wrod_detail ">You can capture at most 5 phone
					numbers, then you should release them to get new.</span> <img
				src="${pageContext.request.contextPath}/resources/images/dotted_line.png"
				class="dotted_line_norify"></li>
			<li class="wrod">When you capture phone number,it's free. Only
				you capture your verification code,it will deduct your balance. <img
				src="${pageContext.request.contextPath}/resources/images/dotted_line.png"
				class="dotted_line_norify">
			</li>
			<li class="wrod">When you capture a phone number, please type it
				in the website you want toverify,and wait for a moment to capture
				verification code.If you didn't get it,please wait for a while,then
				capture it again.</li>

		</ol>
	</div>
</body>
</html>
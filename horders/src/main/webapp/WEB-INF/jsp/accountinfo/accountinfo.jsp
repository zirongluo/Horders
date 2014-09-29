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
	width: 1600px;
	height: 925px;
	background: #FFFFFF;
}

.top {
	position: relative;
	margin: 0;
	left: 15%;
	height: 200px;
	width: 70%;
		background:
		url(${pageContext.request.contextPath}/resources/images/new_get_code_bg.png);
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale');
	border: 0px;
	background-size: 100% 100%;
}

.bottom {
	position: relative;
	margin: 0;
	margin-top:10px;
	left: 15%;
	height: 700px;
	width: 70%;
}
.content {
	position: relative;
	margin: 0;
	left: 5%;
	top: 50px;
	width: 90%;
	height: 150px;
	background: transparent;
}

.head {
	margin: 0px;
	width: 100%;
	height: 150px;
	margin: 0px;
	background: #FFFFFF;
}

.me {
	margin: 10px;
	width: 130px;
	height: 130px;
	float: left;
}

.userinfo {
	margin: 0px;
	width: 800px;
	height: 130px;
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

.user {
	margin: 0px;
	width: 800px;
	height: 130px;
}

.account {
	margin: 0px;
	width: 100%;
	background: transparent;
	border: 0px;
	height: 50px;
}

.info_line_wrap {
	margin: 0px;
	margin-top:30px;
	width: 100%;
	background: transparent;
	border: 0px;
	height: 30px;
}

.info_line_wrap_three {
	margin: 0px;
	width: 100%;
	background: transparent;
	border: 0px;
	height: 30px;
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
	width: 70px;
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
	margin-left: 5px; margin-top : 7px;
	height: 20px;
	width: 80px;
	font-family: Arial;
	font-size: 14px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #333333;
	background: transparent;
	float: left;
	margin-top: 7px;
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
	width: 120px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #E47911;
	float: left;
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
	width: 130px;
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
	width: 80px;
	font-family: Arial;
	font-size: 14px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	background: transparent;
	color: #0654BA;
	float: left;
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

.getcode {
	margin: 10px;
	margin-left: 0px;
	margin-right: 0px;
	margin-top: 13px;
	height: 20px;
	width: 80px;
	font-family: Arial;
	font-size: 14px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	background: transparent;
	color: #0654BA;
	float: left;
	height: 20px;
	margin-right: 0px;
}

.getcode a {
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
</style>
</head>
<body>
	<div class="top">
		<div class="content">
			<div class="head">
				<img id="me"
					src="${pageContext.request.contextPath}/resources/images/me.png"
					class="me" />
				<div id="userinfo" class="userinfo">

					<div class="account">
						<div class="username">
							<h1>Sen Xie</h1>
						</div>
						<div class="status">
							<a href="home/home" target="bottomFrame">[Sign Out]</a> <br>
						</div>
					</div>
					<div class="info_line_wrap">
						<div class="email">
							<h1>Email:</h1>
						</div>
						<div class="email_detail">
							<h1>zirongluo@163.com</h1>
						</div>
					</div>
					<div class="info_line_wrap_three">
						<div class="balance">
							<h1>
								Balance: <span class="money">$5.0</span>
							</h1>
						</div>
						<div class="topup">
							<a href="home/home" target="bottomFrame">[Top Up]</a> <br>
						</div>
												<div class="getcode">
							<a href="home/home" target="bottomFrame">[Get Code]</a> <br>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>
	<div class="bottom">
			<iframe src="${pageContext.request.contextPath}/page/userinfo/record.jsp"
				name="bottomFrame" id="bottomFrame" frameborder="no" border="0"
				marginwidth="0" marginheight="0" scrolling="no"
				allowtransparency="yes" scrolling="auto" width="100%" height="100%"
				noresize="noresize"></iframe>
			</div>
</body>
</html>
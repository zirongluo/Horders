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

.content {
	width: 100%;
	height: 100%;
	background: transparent;
}

.interaction {
	margin: 0px;
	margin-left: 30px;
	height: 550px;
	float: left;
	width: 500px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #333333;
	background: transparent;
	font-family: Arial;
	border: 1px;
	border-style: solid;
	border-color: #D0D0D0;
}

.info {
	margin: 0px;
	margin-left: 50px;
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
.interaction_top {
	margin: 0px;
	width: 100%;
	height: 150px;
}
.amount {
	margin-top: 0px;
	margin-left: 115px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #333333;
}

.payment {
	margin-top: 45px;
	margin-left: 108px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #333333;
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

.payment_log {
	margin: 0px;
	margin-top: 33px;
	margin-left: 80px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	width: 130px;
	height: 70px;
}

.instant {
	position: relative;
	margin: 0px;
	margin-top: 0px;
	margin-left: 110px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #000000;
}

.instant_block {
	margin: 0px;
	margin-top: 5px;
	margin-left: 110px;
}

.instant_detail {
	margin: 0px;
	font-family: Arial;
	font-size: 16px;
	font-weight: bold;
	font-style: normal;
	text-decoration: none;
	color: #000000;
	text-align: justify;
	text-justify: distribute;
}

.radio {
	margin-left: 185px;
	margin-top: 30px;
	font-family: Arial;
	font-size: 12px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #8899A6;
	float: left;
}

.paypal {
	margin-top: 20px;
	margin-left: 5px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	width: 130px;
	height: 30px;
}

.agree_wrap {
	margin-left: 10px;
	margin-top: 35px;
	float: left;
}

.select {
	margin: 0px;
	margin-top: 35px;
	margin-left: 110px;
	font-family: Arial;
	font-size: 12px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #8899A6;
	float: left;
}

.agree {
	margin: 0px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #000000;
}

.agreement {
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #0654BA;
}
.dotted_line_norify {
	margin: 5%;
	margin-top: 20px;
	margin-bottom: 3px;
	width: 90%;
	height: 1px;
}

.continue {
	margin-top: 50px;
	margin-left: 350px;
	width: 90px;
	height: 37px;
	background:
		url(${pageContext.request.contextPath}/resources/images/search.png);
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale');
	border: 0px;
	background-size: 100% 100%;
	float: none;
}

</style>
</head>
<body>
	<div class="content">
		<div class="interaction">
			<div class="interaction_top">
				<div class="left">
					<h1 class="amount">Amount:</h1>
					<h1 class="payment">Payment:</h1>
				</div>
				<div class="right">
					<SELECT id="selection" class="selection">
						<OPTION selected value="HotItems">USD $5.00</OPTION>
						<OPTION value="google confirm">USD $6.00</OPTION>
						<OPTION value="Facebook confirm">USD $7.00</OPTION>
						<OPTION value="twitter confirm">USD $8.00</OPTION>
						<OPTION value="apple id confirm">USD $9.00</OPTION>
						<OPTION value="ebay confirm">USD $10.00</OPTION>
					</SELECT> <br> <img
						src="${pageContext.request.contextPath}/resources/images/paypal_1.png"
						class="payment_log">
				</div>
				<span class="instant">Instant Activation</span><br>
			<div class="instant_block">
				<span class="instant_detail">You will receive your account
					info automatically via email right after email right after you make
					the payment by Paypal.(You can also pay by Credit Cards)</span>
			</div>
			<label><input name="radio" type="radio" checked="checked"
				class="radio" /><img
				src="${pageContext.request.contextPath}/resources/images/paypal.png"
				class="paypal"></label><br> <label><input name="select"
				type="checkbox" class="select" /></label>
			<div class="agree_wrap">
				<span class="agree">I do agree to the </span><a
					href="${pageContext.request.contextPath}/code/get_code"
					target="_parent"><span class="agreement">Tems Of Service</span></a><br>
				<span class="agree">and</span> <a
					href="${pageContext.request.contextPath}/code/get_code"
					target="_parent"><span class="agreement"> USER AGREEMENT</span></a>
			</div>
			<img
				src="${pageContext.request.contextPath}/resources/images/dotted_line.png"
				class="dotted_line_norify">
				<button class="continue">Continue</button>
			</div>
		</div>
		<div class="info">
			<iframe src="${pageContext.request.contextPath}/page/code/info.jsp"
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
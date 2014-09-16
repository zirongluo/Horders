<%@ include file="/WEB-INF/jsp/common/common.jsp"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
body {
	margin: 0;
}

body div {
	margin: 0;
	width: 100%;
	height:150px;
}

.username {
	position: relative;
	margin-left: 10%;
	margin-top: 10%;
	width: 80%;
	height: 25px;
	text-align: left;;
	font-family: 'Arial';
	font-size: 13px;
	color: #868686;
	font-style: normal;
	font-weight: normal;
	text-decoration: none;
}

.password {
	margin-left: 10%;
	margin-top: 10px;
	width: 47%;
	height: 25px;
	font-family: Arial;
	text-align: left;
	word-wrap: break-word;
	float: left;
}

.submit_button {
	right: 0px;
	margin-right: 10%;
	margin-top: 10px;
	width: 25%;
	height: 32px;
	float: right;
}

.retc{
margin:0px;
margin-top:10px;
border:0px;
width:100%;
height:30px;
float:left;
}
.remember {
	margin-left: 10%;
	margin-top: 5px;
	font-family: Arial;
	font-size: 12px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #8899A6;
	float:left;
}
.forgot{
margin-right: 10%;
	margin-top: 5px;
font-family:Arial;
font-size:12px;
font-weight:normal;
font-style:normal;
text-decoration:none;
color:#0084B4;
float:right;
}
</style>
<script src="<c:url value="/resources/js/lib/jquery-1.7.1.min.js"/>"></script>
<script type="text/javascript">
	//var remember_selected = false;
	$(function() {
		$(".submit_button")
				.click(
						function() {
							var username = $.trim($(".username").val());
							var password = $.trim($("#password").val());
							if ((username == "" || password == "")
									|| (username == "Email" && password == "Password")) {
								alert(" 您的[客户号]或者[密码]必须填写!");
								return false;
							}
							$("#login").action = '${pageContext.request.contextPath}/code/get_code';
							//$("#login").attr("target","bottomFrame");
							$("#login").submit();
						})
		$("#username").focus(function() {
			$(this).val("");
		})
		$("#password").focus(function() {
			$(this).val("");
		})
		/*
		$(".remember").click(function(){
			if(remember_selected){
				$(this).attr("checked",false);
				remember_selected = false;
			}
			else{
				$(this).attr("checked",true);
				remember_selected = true;
			}
			})*/
	})
</script>
</head>
<body>
	<form name="login" id="login" action="/horders/topup/topup"
		method="get" target="_parent">
		<div>
			<INPUT id="username" type=text value="Email" class="username">
			<INPUT id="password" type=text value="Password" class="password">
			<img
				src="${pageContext.request.contextPath}/resources/images/sign_in.png"
				class="submit_button">
				<div class="retc">
				<label><input
				name="remember" type="checkbox" checked="checked" class="remember" />Remember me</label>
			<a href="${pageContext.request.contextPath}/code/get_code" target="_parent" class="forgot">Forgot password?</a>
				</div>
		</div>
	</form>
</body>
</html>
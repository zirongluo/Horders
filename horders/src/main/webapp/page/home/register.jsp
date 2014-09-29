<%@ include file="/WEB-INF/jsp/common/common.jsp"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
	margin: 0px;
	margin-left: 10%;
	background: #FFFFFF;
	width: 100%;
	height: 100%;
}

h1 {
	margin: 0px;
	margin-top: 10px;
	font-family: Arial;
	font-size: 28px;
	font-weight: bold;
	font-style: normal;
	text-decoration: none;
	color: #363636;
}

h2 {
	margin: 0px;
	margin-top: 10px;
	font-family: Arial;
	font-size: 16px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #363636
}

.input_left {
	width: 37%;
	height: 30px;
	margin: 0px;
	margin-top: 7px;
	text-align: left;;
	font-family: 'Arial';
	font-size: 13px;
	color: #868686;
	font-style: normal;
	font-weight: normal;
	text-decoration: none;
	float: left;
	text-align: left;
}

.submit {
	width: 30%;
	height: 33px;
	margin: 0px;
	margin-top: 7px;
	text-align: left;;
	font-family: 'Arial';
	font-size: 13px;
	color: #868686;
	font-style: normal;
	font-weight: normal;
	text-decoration: none;
	float: left;
	text-align: left;
}

.input_right {
	width: 37%;
	height: 30px;
	margin: 0px;
	margin-top: 7px;
	margin-left: 25px;
	text-align: left;
	font-family: 'Arial';
	font-size: 13px;
	color: #868686;
	font-style: normal;
	font-weight: normal;
	text-decoration: none;
	float: left;
}

.input_whole {
	margin: 7px;
	margin-left: 0px;
	width: 82%;
	height: 30px;
	text-align: left;;
	font-family: 'Arial';
	font-size: 13px;
	color: #868686;
	font-style: normal;
	font-weight: normal;
	text-decoration: none;
	float: left;
}

.refresh {
	width: 37%;
	height: 30px;
	margin: 0px;
	margin-top: 13px;
	margin-left: 25px;
	text-align: left;
	font-family: Arial;
	font-size: 12px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #0084B4;
	float: left;
}

SELECT {
	margin: 0px;
	width: 37%;
	height: 30px;
	font-family: 'Arial';
	font-size: 13px;
	color: #000000;
	font-style: normal;
	font-weight: normal;
	text-decoration: none;
	float: left;
}
.agree {
	margin-top: 5px;
	font-family: Arial;
	font-size: 15px;
	font-weight: normal;
	font-style: normal;
	text-decoration: none;
	color: #8899A6;
	float:left;
}
.agreement{
margin-right: 10%;
	margin-top: 5px;
font-family:Arial;
font-size:15px;
font-weight:normal;
font-style:normal;
text-decoration:none;
color:#0084B4;
float:right;
}
</style>
<script src="<c:url value="/resources/js/lib/jquery-1.7.1.min.js"/>"></script>
<script type="text/javascript">
	$(function() {
		$("div INPUT").focus(function() {
			$(this).val("");
		})
		$("#submit").click(function(){
			var firstname = $.trim($("#first_name").val());
			var surname = $.trim($("#surname").val());
			var email = $.trim($("#email").val());
			var password = $.trim($("#password").val());
			var confirm = $.trim($("#confirm").val());
			var nationlity = $("#nationlity").val();
			var checknum = $.trim($("#checknum").val());
			if(firstname == "" || firstname == "First name"){
				alert("First name should not be empty");
				return;
			}
			if(surname == "" || surname == "Surname"){
				alert("Surname should not be empty!");
				return;
			}
			if(email == "" || email == "Email"){
				alert("Email should not be empty!");
				return;
			}
			if(password == "" || password == "Password"){
				alert("Password should not be empty!");
				return;
			}
			if(confirm == "" || confirm == "Confirm your password"){
				alert("Confirm password should not be empty!");
				return;
			}
			else if (password != confirm){
				alert("password is not same");
				return;
			}
			if(nationlity == ""){
				alert("Nationlity should not be empty!");
				return;
			}
			if(checknum  == "" || checknum == "Enter the code below"){
				alert("Checknum should not be empty!");
				return;
			}
			var url = '${pageContext.request.contextPath}/register';
			var data = "({" + "firstname:firstname,"
					+ "surname:surname,"
					+ "email:email,"
					+ "password:password,"
					+ "confirm:confirm,"
					+ "nationlity:nationlity,"
					+ "checknum:checknum "+"})";
			//$("#login").action = '${pageContext.request.contextPath}/code/get_code';
			//$("#login").attr("target","bottomFrame");
			//$("#login").submit();
			var callback = function(data, status) {
				//var cookie = $.cookie('ZYKIDFTKDIOSDE_'); 
				//alert("\n状态：" + data);
				if(data == "fail"){
					alert(" invalid email or the email already registered");
				}
				else{
				top.location.href = '${pageContext.request.contextPath}/register_success';
				}
			};
			var call = function(response){
	            //var obj = window.open("about:blank","_blank");  
	            //obj.document.write(response);
	            	//top.scrollTop(0);
	//alert($(window).scrollTop());
	top.location.href = '${pageContext.request.contextPath}/register_success';
				
	        }
			$.post(url,eval(data),callback);
			
		});
	})
</script>
</head>
<body>
	<form name="login" id="login" action="/horders/topup/topup"
		method="get" target="_parent">
		<div>
			<h1>Creat an account</h1>
			<h2>It's free and always will be</h2>
			<INPUT id="first_name" type=text value="First name"
				class="input_left"> <INPUT id="surname" type=text
				value="Surname" class="input_right"> <INPUT id="email"
				type=text value="Email" class="input_whole"> <INPUT
				id="password" type=text value="Password" class="input_whole">

			<INPUT id="confirm" type=text value="Confirm your password"
				class="input_whole"> <SELECT id="nationlity">
				<OPTION selected value="Nnationality">Nnationality</OPTION>
				<OPTION value="US">US</OPTION>
				<OPTION value="China">China</OPTION>
			</SELECT> <INPUT id="checknum" type=text value="Enter the code below"
				class="input_whole" /> <br>
			<div class="input_left">
				<img src="/horders/home/image_code" alt="code" width=100%
					height=100% />
			</div>
			<a href="${pageContext.request.contextPath}/code/get_code"
				target="_parent" class="refresh">Refresh the code</a> 
			<div class="input_whole">
				<label><input name="remember" type="checkbox"
					class="remember" />agree with the </label> <a
					href="${pageContext.request.contextPath}/code/get_code"
					target="_parent">USER AGREEMENT</a>
			</div>
			<img id="submit"
				src="${pageContext.request.contextPath}/resources/images/submit.png"
				class="submit" />
		</div>
	</form>
</body>
</html>
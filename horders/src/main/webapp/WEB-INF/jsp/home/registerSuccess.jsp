<%@ include file="/WEB-INF/jsp/common/common.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.logo{
 margin:0px;
 margin-left:150px;
 margin-top:200px;
 height:100px;
 width:100px;
 float:left;
}
.notify{
	margin:0px;
	 margin-left:50px;
 margin-top:220px;
 height:100px;
 width:500px;
 float:left;
}
.title{
margin:0px;
font-family:Arial;
font-size:16px;
font-weight:bold;
font-style:normal;
text-decoration:none;
color:#000000;
height:55px;
}
.detail{
margin:0px;
font-family:Arial;
font-size:16px;
font-weight:normal;
font-style:normal;
text-decoration:none;
color:#5E5E5E;
height:45px;
}
</style>
<script src="<c:url value="/resources/js/lib/jquery-1.7.1.min.js"/>"></script>
<script type="text/javascript">
$(function() {
	//$(window).scrollTop(0);
	//alert($(document).scrollTop());
});
</script>
</head>
<body>
<div class = "logo">
<img src="${pageContext.request.contextPath}/resources/images/email_logo.jpg" alt="" width=100%
					height=100% />
</div>
<div class= "notify">
<h1 class="title">verification emali has been sent your email</h1>
<h1 class= "detail">Click your email and follow the link to finish creating your account.</h1>
</div>

</body>
</html>
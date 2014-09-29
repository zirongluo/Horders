<%@ include file="/WEB-INF/jsp/common/common.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.borderTable {
margin : 0px;
width:100%;
height:100%;
    border: 1px #d7d7d7 solid;
    border-bottom: none;
    border-right: none;
}
.borderTable th {
    height: 40px;
    line-height: 40px;
    border-right: 1px #d7d7d7 solid;
    border-bottom: 1px #d7d7d7 solid;
    background: -moz-linear-gradient(#ecf1f7, #e4e8eb) repeat 0 0;
    background: -webkit-linear-gradient(#ecf1f7, #e4e8eb) repeat 0 0;
    background: linear-gradient(#ecf1f7, #e4e8eb) repeat 0 0;
    filter:progid:DXImageTransform.Microsoft.Gradient(startColorStr='#ecf1f7', endColorStr='#e4e8eb', gradientType='0');
}

.borderTable td {
    border-right: 1px #d7d7d7 solid;
    border-bottom: 1px #d7d7d7 solid;
    height: 25px;
    padding: 5px 0px;
    padding-right: 3px;
    line-height: 20px;
    padding-left: 3px;
    text-align:center;

}
</style>
<script type="text/javascript">

</script>
</head>
<body>
<table id= "borderTable" class= "borderTable">
<!--
<c:forEach var="i" begin="1" end="10" step="1">
<tr><td>No.</td><td>Description</td><td>Amount</td><td>Balance</td><td>CreateDTS</td></tr>
</c:forEach>
  -->
<tr bgcolor="#FFEFD5"><td>No.</td><td>Description</td><td>Amount</td><td>Balance</td><td>CreateDTS</td></tr>
<c:forEach var="cell" items="${accountInfoList}"  varStatus="status" >
<tr <c:if test="${status.count%2==0}">bgcolor="#FFEFD5"</c:if>><td>${cell.id}</td><td>${cell.description}</td><td>Amount</td><td>Balance</td><td>CreateDTS</td></tr>
</c:forEach>

</table>


</body>
</html>
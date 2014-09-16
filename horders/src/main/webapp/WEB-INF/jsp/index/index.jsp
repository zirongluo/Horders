<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>jquery简洁TAB</title>
<style>
* {
	margin: 0;
	padding: 0;
}

body {
	font: 12px/19px Arial, Helvetica, sans-serif;
	color: #666;
}

.tab {
	width: 240px;
	margin: 50px;
}

.tab_menu {
	clear: both;
}

.tab_menu li {
	float: left;
	text-align: center;
	cursor: pointer;
	list-style: none;
	padding: 1px 6px;
	margin-right: 4px;
	background: #F1F1F1;
	border: 1px solid #898989;
	border-bottom: none;
}

.tab_menu li.hover {
	background: #DFDFDF;
}

.tab_menu li.selected {
	color: #FFF;
	background: #6D84B4;
}

.tab_box {
	clear: both;
	border: 1px solid #898989;
	height: 100px;
}

.hide {
	display: none
}
</style>
<script src="http://www.codefans.net/ajaxjs/jquery-1.6.2.min.js"
	type="text/javascript"></script>
<script type="text/javascript">
	//<![CDATA[
	$(function() {
		var $div_li = $("div.tab_menu ul li");
		$div_li.click(function() {
			$(this).addClass("selected") //当前<li>元素高亮
			.siblings().removeClass("selected"); //去掉其它同辈<li>元素的高亮
			var index = $div_li.index(this); // 获取当前点击的<li>元素 在 全部li元素中的索引。
			$("div.tab_box > div") //选取子节点。不选取子节点的话，会引起错误。如果里面还有div
			.eq(index).show() //显示 <li>元素对应的<div>元素
			.siblings().hide(); //隐藏其它几个同辈的<div>元素
		}).hover(function() {
			$(this).addClass("hover");
		}, function() {
			$(this).removeClass("hover");
		})
	})
	//]]>
</script>
</head>
<body>
	<div class="tab">
		<div class="tab_menu">
			<ul>
				<li class="selected">国际1</li>
				<li>科技1</li>
				<li>军事1</li>
			</ul>
		</div>
		<div class="tab_box">
			<div>国际</div>
			<div class="hide">科技</div>
			<div class="hide">军事</div>
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>、

<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>重庆吉芯公司后台管理</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</head>
<body>
<%@ include file="/jsp/Backstage/BackStage_header.jsp"%>
<%@ include file="/jsp/lbImage.jsp"%>
<div class="container">
	<table class="table">
		<tr>
			<th>产品类型</th>
			<th>产品类型描述</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${findCpzxDelete}" var="findCpzxDelete">
			<tr>
				<td>${findCpzxDelete.cplxtype }</td>
				<td>${findCpzxDelete.cplxcontent }</td>
				<td><a href="${pageContext.request.contextPath}/cpzxAction_deleteCpzx?uuid=${findCpzxDelete.uuid}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>
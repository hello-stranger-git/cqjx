<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<form action="${pageContext.request.contextPath}/newsAction_updateNews">
		新闻类型:
		<select name="newstype">
			<c:forEach items="${newsList}" var="newsList">
				<option>${newsList.newstype }</option>
			</c:forEach>
		</select>
		<textarea class="form-control" rows="10" placeholder="新闻类型描述"
			name="newscontent"></textarea>
		<button type="submit" class="btn btn-primary">修改</button>
	</form>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>、

<%@ taglib uri="/struts-tags" prefix="s"%>
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
	<form action="${pageContext.request.contextPath}/newsMessageAction_addnewsMessage" method="post" enctype="multipart/form-data">
		新闻类型:<select name="newstype">
				<c:forEach items="${addNewsIndex}" var="addNewsIndex">
					<option>${addNewsIndex.newstype}</option>
				</c:forEach>
			  </select>
		新闻资讯名称:<input type="text" name="newsname">
		<textarea class="form-control" rows="10" placeholder="新闻类型描述"
			name="newscontent"></textarea>
		<input type="file" name="newsImage" required="required">	
		<button type="submit" class="btn btn-primary">添加</button>
	</form>
	</div>
</body>
</html>
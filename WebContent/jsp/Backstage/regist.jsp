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
		<form class="form-inline container"
			action="${pageContext.request.contextPath }/userRegist_regist"
			method="post">
			<div class="form-group">
				<label>账号</label> <input type="text" class="form-control"
					name="username" id="exampleInputEmail3" placeholder="请输入账号">
			</div>
			<div class="form-group">
				<label>密码</label> <input type="password" class="form-control"
					name="password" id="exampleInputPassword3" placeholder="请输入密码">
			</div>
			<button type="submit" class="btn btn-primary">注册</button>
		</form>
	</div>
</body>
</html>
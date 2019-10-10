<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>重庆吉芯科技有限公司后台管理</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet">
</head>
<body>
	<%@ include file="/jsp/Header.jsp"%>
	<%@ include file="/jsp/lbImage.jsp"%>
	<div class="singInTitle">
		<h1>登录</h1>
	</div>
	<form class="form-inline container">
		<div class="form-group">
			<label>账号</label> <input type="email" class="form-control"
				id="exampleInputEmail3" placeholder="请输入账号">
		</div>
		<div class="form-group">
			<label>密码</label> <input type="password" class="form-control"
				id="exampleInputPassword3" placeholder="请输入密码">
		</div>
		<button type="submit" class="btn btn-primary">登录</button>
		<div class="checkbox">
			<label> <input type="checkbox"> 记住密码
			</label>
		</div>
	</form>
	<%@ include file="/jsp/Footer.jsp"%>
</body>
</html>
<style>
.singInTitle {
	text-align: center;
	margin:20px;
}
.form-inline .form-group	{
	display: block;
}
.form-inline {
	text-align: center;
	line-height: 4;
}
.singInTitle>h1{
	font-weight: 500;
}
.bmdz,.zxns,.gsjj{
	display: none;
}
</style>
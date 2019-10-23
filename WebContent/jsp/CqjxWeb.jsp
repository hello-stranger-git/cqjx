<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>重庆吉芯科技有限公司人才招聘网</title>
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/InitCss.css">
<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/footer.css">
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/CqjxWeb.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</head>
<body oncontextmenu="return false" onselectstart="return false">
	<%@ include file="/jsp/Header.jsp"%>
	<article class="article_main">
		<!-- 轮播图 -->
		<%@ include file="/jsp/lbImage.jsp"%>




		<div
			style="line-height: 3.5; width: 80%; margin: auto; text-align: center;">
			<h3 class="center_h3">公司简介</h3>
		</div>
		<hr
			style="width: 80%; border: 1px solid #e3e4e5; margin-bottom: 35px; margin-top: 0px;">
		<div class="every_message">
			<div class="media">
				<div class="media-left">
					<a href="#"> <img class="media-object"
						src="${pageContext.request.contextPath}/img/index_center.jpg"
						style="width: 400px; height: 270px;">
					</a>
				</div>
				<div class="media-body">
					<!-- <h4 class="media-heading">Media heading</h4> -->
					
						<ul>
							<c:forEach items="${gsjjList }" var="gsjjList">
								<li>
									<span class="info">${gsjjList}</span>
								</li>
							</c:forEach>
						</ul>
				</div>
			</div>
	</article>
	<%@ include file="/jsp/Footer.jsp"%>
</body>
</html>
<style>
.news {
	margin-top: 50px;
}
.row {
	width: 80%;
	margin: auto;
}
.every_message{
	width: 80%;
    margin: auto;
}
.info{
	font-size: 18px;
}
</html>
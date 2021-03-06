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
	href="${pageContext.request.contextPath}/css/center_context.css">
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
		<div class="xgzl">
			<div class="xgzl_title clearfix">
				<span
					style="box-shadow: rgba(83, 88, 93, 0.5) 2px 2px 6px 6px; border-radius: 4px; width: 124px; background: #e3e4e5; margin-bottom: 25px; font-size: 20px; font-weight: bold; display: inline-block; font-style: italic; color: #afacac;">相关资料</span>
				<a href="${pageContext.request.contextPath}/webLxwmAction_findLxwm">
					<p id="xgzl_title_bmdz" style="color: #FFFFFF; background: blue; border-radius: 8px; box-shadow: rgba(83, 88, 93, 0.98) 2px 4px 6px;">
						<span>联系我们</span>
					</p>
				</a>
			</div>

			<div class="xgzl_menu">
				<!-- 联系方式 -->
				<div class="xgzl_lxfs" id="xgzl_lxfs">
					<div class="xgzl_lxfs_title">
						<span>联系方式</span>
					</div>
					<hr>
					<hr>
					<ul class="xgzl_lxfs_context">
						<c:forEach items="${lxwmList }" var="lxwmList">
								<li>
									<span class="info">${lxwmList}</span>
								</li>
							</c:forEach>
					</ul>
				</div>
			</div>
		</div>
	</article>
	<%@ include file="/jsp/Footer.jsp"%>
</body>
</html>
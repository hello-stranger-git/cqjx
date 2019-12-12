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
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/index.js"></script>
</head>
<body oncontextmenu="return false" onselectstart="return false">
	<%@ include file="/jsp/Header.jsp"%>
	<article class="article_main">
		<!-- 轮播图 -->
		<%@ include file="/jsp/lbImage.jsp"%>
		<div class="title"
			style="line-height: 3.5; width: 80%; margin: auto; text-align: center;">
			<!-- <h3 class="center_h3">公司简介</h3> -->
			<ul >
				<li id="news"><a>新闻资讯</a></li>
				<li id="introduce"><a>公司简介</a></li>
				<li id="product"><a>产品资讯</a></li>
			</ul>
		</div>
		<!-- <hr style="width: 80%; border: 1px solid #e3e4e5; margin-bottom: 35px; margin-top: 0px;"> -->
		<div class="every_message">
			<div class="media introduceDiv"  id="introduceDiv">
				<div class="media-left">
					<a href="#"> <img class="media-object"
						src="${pageContext.request.contextPath}/img/index_center.jpg"
						style="width: 400px; height: 270px;">
					</a>
				</div>
				<div class="media-body">
					<!-- <h4 class="media-heading">Media heading</h4> -->
								${gsjjList.gsjj}
				</div>
			</div>
			<div id="newsDiv" class="newsDiv">
				<div class="xgzl_menu" style="border:0px">
				<!-- 联系方式 -->
				<div class="xgzl_lxfs" id="xgzl_lxfs">
						<div class="row">
						  <c:forEach items="${newsMessageListAll }" var="newsnav" end="5">
							  <div class="col-sm-6 col-md-3">
							    <div class="thumbnail">
							      <img src="upload/${newsnav.newsImageName}" style="width:240px;height:200px">
							      <div class="caption">
							        <h3 style="height: 27px;display: -webkit-box;-webkit-box-orient: vertical;-webkit-line-clamp: 1;overflow: hidden;">
							        	<c:if test="${!empty newsnav.newsname}">
									       ${newsList.newsname}
										</c:if>
								        <c:if test="${empty newsnav.newsname}">
									       ${newsList.newstype}
										</c:if>
							        </h3>
							        <div style="height: 60px;display: -webkit-box;-webkit-box-orient: vertical;-webkit-line-clamp: 3;overflow: hidden;">
							        	<p>${newsnav.newscontent}</p>
							        </div>
							        <p style="text-align: center;">
							       
							        	
							        	<c:if test="${!empty newsnav.newsname}">
									        <a href="${pageContext.request.contextPath}/webNewsMessageAction_findNewsMessageUuid?uuid=${newsnav.uuid}" class="btn btn-primary" role="button">查看详情</a> 
										</c:if>
								        <c:if test="${empty newsnav.newsname}">
									        <a href="${pageContext.request.contextPath}/webNewsAction_findNewsMessage?uuid=${newsnav.uuid}" class="btn btn-primary" role="button">查看详情</a> 
										</c:if>
							        
							        </p>
							      </div>
							    </div>
							   </div>
							</c:forEach>
						  </div>
				</div>
			</div>
			</div>
			<div id="productDiv" class="productDiv">
						<div class="row">
						  <c:forEach items="${cpzxMessageListAll }" var="cpzxList" end="2">
							  <div class="col-sm-6 col-md-3">
							    <div class="thumbnail">
							      <img src="upload/${cpzxList.cpzxImageName}" style="width:240px;height:200px">
							      <div class="caption">
							        <h3 style="height: 27px;display: -webkit-box;-webkit-box-orient: vertical;-webkit-line-clamp: 1;overflow: hidden;">
								        <c:if test="${!empty cpzxList.cplxname}">
									       ${cpzxList.cplxname}
										</c:if>
								        <c:if test="${empty cpzxList.cplxname}">
									       ${cpzxList.cplxtype}
										</c:if>
							        </h3>
							        <div style="height: 60px;display: -webkit-box;-webkit-box-orient: vertical;-webkit-line-clamp: 3;overflow: hidden;">
							        	<p>${cpzxList.cplxcontent}</p>
							        </div>
							        <p style="text-align: center;">
							        	<c:if test="${!empty cpzxList.cplxname}">
									       <a href="${pageContext.request.contextPath}/webCpzxMessageAction_findCpzxMessageUuid?uuid=${cpzxList.uuid}" class="btn btn-primary" role="button">查看详情</a>
										</c:if>
								        <c:if test="${empty cpzxList.cplxname}">
							        		<a href="${pageContext.request.contextPath}/webCpzxAction_findCpzxMessage?uuid=${cpzxList.uuid}" class="btn btn-primary" role="button">查看详情</a>
										</c:if>
							        </p>
							      </div>
							    </div>
							   </div>
							</c:forEach>
						  </div>
			</div>
		</div>
	</article>
	<input style="display:none" type="text" value="${newsnav} %>" id="newsValue">
	<input style="display:none" type="text" value="${cpzxnav} %>" id="cplxValue">
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



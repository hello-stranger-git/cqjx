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
<%@ include file="/jsp/lbImage.jsp"%>
<article class="article_main">
		<div class="xgzl">
			<div class="xgzl_title clearfix">
					<span
						style="box-shadow: rgba(83, 88, 93, 0.5) 2px 2px 6px 6px; border-radius: 4px; width: 124px; background: #e3e4e5; margin-bottom: 25px; font-size: 20px; font-weight: bold; display: inline-block; font-style: italic; color: #afacac;">产品咨询</span>
					<c:forEach items="${webFindCpzxIndex }" var="webFindCpzxIndex">
						<a href="${pageContext.request.contextPath}/webCpzxMessageAction_findCplx?cplxtype=${webFindCpzxIndex.cplxtype}">
							<p id="xgzl_title_bmdz" style="color: #FFFFFF; background: blue; border-radius: 8px; box-shadow: rgba(83, 88, 93, 0.98) 2px 4px 6px;margin-bottom: 15px;">
								<span>${webFindCpzxIndex.cplxtype}</span>
							</p>
						</a>
					</c:forEach>
				</div>
				<div class="xgzl_menu" style="border:0px">
				<!-- 联系方式 -->
				<div class="xgzl_lxfs" id="xgzl_lxfs">
<!-- 					<div class="xgzl_lxfs_title">
						<span>产品咨询</span>
					</div>
					<hr>
					<hr>
 -->				
 					
						<div class="row">
						  <c:forEach items="${webFindCpzxIndex }" var="webFindCpzxIndex">
							  <div class="col-sm-6 col-md-3">
							    <div class="thumbnail">
							      <img src="upload/${webFindCpzxIndex.cpzxImageName}" style="width:240px;height:200px">
							      <div class="caption">
							        <h3 style="height: 27px;display: -webkit-box;-webkit-box-orient: vertical;-webkit-line-clamp: 1;overflow: hidden;">${webFindCpzxIndex.cplxtype}</h3>
							        <p style="height: 60px;display: -webkit-box;-webkit-box-orient: vertical;-webkit-line-clamp: 3;overflow: hidden;">${webFindCpzxIndex.cplxcontent}</p>
							        <p style="text-align: center;"><a href="${pageContext.request.contextPath}/webCpzxAction_findCpzxMessage?uuid=${webFindCpzxIndex.uuid}" class="btn btn-primary" role="button">查看详情</a> </p>
							      </div>
							    </div>
							   </div>
							</c:forEach>
						  </div>
				</div>
			</div>
		</div>
	</article>
	<%@ include file="/jsp/Footer.jsp"%>

</body>
</html>
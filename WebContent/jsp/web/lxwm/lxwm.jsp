<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<a href="${pageContext.request.contextPath}/jsp/web/lxwm/lxwm.jsp">
					<p id="xgzl_title_bmdz"
						style="color: #FFFFFF; background: blue; border-radius: 8px; box-shadow: rgba(83, 88, 93, 0.98) 2px 4px 6px;">
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
						<li>联系人：</li>
						<li>李老师：13658375181</li>
						<li>喻老师：15123322929</li>
						<li>联系地址：重庆市沙坪坝西永大道23号</li>
						<li>邮编：401332</li>
						<li>校园招聘现场：提交简历（贴照片）、成绩单、学术成果、荣誉奖励证明等材料；</li>
						<li>线上招聘：将电子版材料发至邮箱：jishuweixin@sina.com，文件名格式：姓名+学历+学校+专业+岗位类别.doc</li>
					</ul>
				</div>
			</div>
		</div>
	</article>
	<%@ include file="/jsp/Footer.jsp"%>
</body>
</html>
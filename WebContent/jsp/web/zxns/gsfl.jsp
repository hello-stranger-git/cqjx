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
	<%@ include file="/jsp/lbImage.jsp"%>
	<article class="article_main">
		<!-- 轮播图 -->
		<!-- <div class="lbt_img"> -->
		<!-- </div> -->
		<div class="xgzl">
			<div class="xgzl_title clearfix">
				<span
					style="box-shadow: rgba(83, 88, 93, 0.5) 2px 2px 6px 6px; border-radius: 4px; width: 124px; background: #e3e4e5; margin-bottom: 25px; font-size: 20px; font-weight: bold; display: inline-block; font-style: italic; color: #afacac;">招贤纳士</span>
				<a href="${pageContext.request.contextPath}/jsp/web/zxns/rczp.jsp">
					<p id="xgzl_title_bmdz">
						<span>人才招聘</span>
					</p>
				</a> <a href="${pageContext.request.contextPath}/jsp/web/zxns/gsfl.jsp">
					<p id="xgzl_title_xts"
						style="color: #FFFFFF; background: blue; border-radius: 8px; box-shadow: rgba(83, 88, 93, 0.98) 2px 4px 6px;">
						<span>公司福利</span>
					</p>
				</a>
				<!-- <p id="xgzl_title_lxfs"><span onclick="lxfs()">学历要求<span></p> -->
			</div>

			<div class="xgzl_menu">
				<!-- 公司福利 -->
				<div class="xgzl_lxfs" id="xgzl_lxfs" style="display: block">
					<div class="xgzl_lxfs_title">
						<span>公司福利</span>
					</div>
					<hr>
					<hr>
					<ul class="xgzl_lxfs_context">
						<li>吉芯科技，作为中国电子科技集团公司主导成立的国有控股高端集成电路研发平台化公司（员工持股的混合所有制公司），以解决国家集成电路行业自主可控高端发展为需求，以核心技术突破为导向，面向国家重大战略需求，面向国民经济主战场，面向高性能模数混合集成电路研发与产业化环节，构建“单点突破-系列化-全信号链全谱系”的发展模式。
						</li>
						<li>吉芯科技致力于成为具有自主知识产权、国际先进的混合信号集成电路研发机构及产业化平台，为国家核心关键元器件自主可控奠定稳固基石。</li>
						<li>公司的注册资本4.5亿，国有控股、员工持股，未来的技术大牛持股不是镜花水月。</li>
						<li>带薪年假（含高温假）</li>
						<li>各种补贴：交通、通讯……</li>
						<li>五险一金、健康体检、免费食堂</li>
						<li>节日费、结婚祝福金、子女出生祝福金</li>
						<li>邮编：401332</li>
						<li>优秀人才一人一策</li>
					</ul>
				</div>
			</div>

		</div>
	</article>
	<%@ include file="/jsp/Footer.jsp"%>
</body>
</html>
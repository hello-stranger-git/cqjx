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
				<p id="xgzl_title_bmdz"
					style="color: #FFFFFF; background: blue; border-radius: 8px; box-shadow: rgba(83, 88, 93, 0.98) 2px 4px 6px;">
					<span><a
						href="${pageContext.request.contextPath}/jsp/web/zxns/rczp.jsp"></a>人才招聘</span>
				</p>
				<p id="xgzl_title_xts">
					<a href="${pageContext.request.contextPath}/jsp/web/zxns/gsfl.jsp">公司福利</a></span>
				</p>
			</div>

			<div class="xgzl_menu">
				<!-- 报名地址 -->
				<div class="xgzl_bmdz" id="xgzl_bmdz">
					<div class="xgzl_bmdz_title">
						<span>人才招聘</span>
					</div>
					<hr>
					<hr>
					<div class="main_index"
						style="line-height: 2; width: 80%; margin: auto;">
						<span>一、招聘岗位</span>
						<ul>
							<li>数字/模拟/数模混合信号集成电路设计；</li>
							<li>射频集成电路设计；</li>
							<li>射频模拟混合信号集成电路测试及应用开发；</li>
							<li>集成电路设计平台及共性技术；</li>
							<li>微电子集成电路质量可靠性技术；</li>
						</ul>
						<span>二、专业需求</span>
						<ul>
							<li>电子科学与技术、微电子，微电子与物理电子学，半导体物理，通信，电子信息工程，自动化，机械/机电一体化，测控技术与仪器，电路与系统，信号处理等电子类及其应用领域的相关学科。
							</li>
						</ul>
						<span>三、学历要求</span>
						<ul>
							<li>招录学历以硕士、博士为主，特定岗位招录优秀本科生。</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</article>
	<%@ include file="/jsp/Footer.jsp"%>
</body>
</html>
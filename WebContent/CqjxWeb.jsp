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

		<div class="news">
			<h2 style="text-align: center; margin-bottom: 30px;">新闻资讯</h2>
			<!-- 新闻信息 -->
			<div class="row">
				<div class="col-sm-6 col-md-4">
					<div class="thumbnail">
						<!-- 
						<img src="${pageContext.request.contextPath}/img/index/lbt_3.jpg">
						 -->
						<div class="caption">
							<h3>实时新闻</h3>
							<p>...</p>
							<!-- <p>
								<a href="#" class="btn btn-primary" role="button">Button</a> <a
									href="#" class="btn btn-default" role="button">Button</a>
							</p>
							 -->
						</div>
					</div>
				</div>

				<div class="col-sm-6 col-md-4">
					<div class="thumbnail">
						<!-- 
						<img src="${pageContext.request.contextPath}/img/index/lbt_3.jpg">
						 -->
						<div class="caption">
							<h3>当前新闻</h3>
							<p>...</p>
							<!-- <p>
								<a href="#" class="btn btn-primary" role="button">Button</a> <a
									href="#" class="btn btn-default" role="button">Button</a>
							</p>
							 -->
						</div>
					</div>
				</div>

				<div class="col-sm-6 col-md-4">
					<div class="thumbnail">
						<!-- 
						<img src="${pageContext.request.contextPath}/img/index/lbt_3.jpg">
						 -->
						<div class="caption">
							<h3>以往新闻</h3>
							<p>...</p>
							<!-- <p>
								<a href="#" class="btn btn-primary" role="button">Button</a> <a
									href="#" class="btn btn-default" role="button">Button</a>
							</p>
							 -->
						</div>
					</div>
				</div>
			</div>
		</div>


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
					<span class="info">重庆吉芯科技有限公司（以下简称吉芯科技）是中电科技集团重庆声光电有限公司的控股产业公司，是整合中国电子科技集团有限公司相关技术专业资源成立的国有控股高科技企业（员工持股的混合所有制公司）。
					吉芯科技注册资本4.5亿元人民币，技术人员近百人，硕士及以上占70%，拥有发明专利100余件，货架产品100余款。
					公司定位为高性能模数混合集成电路产品供应商、解决方案服务商的无晶圆设计(Fabless)公司，以高性能模数混合集成电路为核心，并以此拓展IP、RF-SoC、微系统等技术、产品和解决方案。
					公司以解决国家集成电路行业自主可控高端发展为需求，以核心技术突破为导向，面向国家重大战略需求，面向国民经济主战场，面向高性能模数混合集成电路研发与产业化环节，构建“单点突破-系列化-全信号链全谱系”的发展模式。
					吉芯科技致力于成为国际先进的混合信号集成电路研发机构及产业化平台，为国家核心关键元器件自主可控奠定稳固基石。
					</span>
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
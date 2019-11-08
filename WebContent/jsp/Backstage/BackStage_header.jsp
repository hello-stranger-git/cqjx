<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>重庆吉芯科技有限公司后台管理</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/InitCss.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/Header.css">
</head>
<body>
	<header class="header">
		<ul class="topnav clearfix">
			<span class="gs_name">重庆吉芯科技有限公司</span>
			<li class="gsjj"><a
				href="${pageContext.request.contextPath}/userRegist_registIndex">注册</a>
			</li>
			<li class="bmdz"><a
				href="${pageContext.request.contextPath}/lxwmAction_findLxwm">联系我们</a>
			</li>
			
			<li class="gsjj"><a
							href="${pageContext.request.contextPath}/gsflAction_findGsfl">公司福利</a>
			</li>
			
			<li class="zxns">
				<!-- <span>招贤纳士</span> --> <a>人才招聘</a>
				<div class="zpxx_submenu">
					<ul>
						<li><a
							href="${pageContext.request.contextPath}/rczpAction_addRczpIndex">添加人才招聘</a></li>
						<li><a
							href="${pageContext.request.contextPath}/rczpAction_findRczp">修改人才招聘</a></li>
						<li><a
							href="${pageContext.request.contextPath}/rczpAction_deleteRczpIndex">删除人才招聘</a></li>
					</ul>
				</div>
			</li>
			
			
			
			
			<li class="zxns">
				<!-- <span>招贤纳士</span> --> <a>产品资讯</a>
				<div class="zpxx_submenu">
					<ul>
						<li><a
							href="${pageContext.request.contextPath}/cpzxAction_addCplxIndex">添加产品类型</a></li>
						<li><a
							href="${pageContext.request.contextPath}/cpzxAction_addCpzxIndex">添加产品资讯</a></li>
						<li><a
							href="${pageContext.request.contextPath}/cpzxAction_findCpzx">修改产品类型</a></li>
						<li><a
							href="${pageContext.request.contextPath}/cpzxAction_deleteCpzxIndex">删除产品类型</a></li>
					</ul>
				</div>
			</li>

			<li class="zxns">
				<!-- <span>招贤纳士</span> --> <a>新闻资讯</a>
				<div class="zpxx_submenu">
					<ul><li><a
							href="${pageContext.request.contextPath}/newsAction_addNewslxIndex">添加新闻类型</a></li>
						<li><a
							href="${pageContext.request.contextPath}/newsAction_addNewsIndex">添加新闻资讯</a></li>
						<li><a
							href="${pageContext.request.contextPath}/newsAction_findNews">修改新闻类型</a></li>
						<li><a
							href="${pageContext.request.contextPath}/newsAction_deleteNewsIndex">删除新闻类型</a></li>
					</ul>
				</div>
			</li>


			<li class="gsjj"><a
				href="${pageContext.request.contextPath}/gsjjAction_findGsjj">首页</a>
			</li>
		</ul>
	</header>
</body>
</html>
<style scoped="scoped">
</style>
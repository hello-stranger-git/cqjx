<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>重庆吉芯科技有限公司后台管理</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/InitCss.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/Header.css">
<script type="text/javascript"
src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
</head>
<body>
    <header class="header">
        <ul class="topnav clearfix">
            <span class="gs_name">重庆吉芯科技有限公司</span>
            <li class="bmdz">
                <a href="${pageContext.request.contextPath}/webLxwmAction_findLxwm">联系我们</a>
            </li>
            <li class="zxns">
                <!-- <span>招贤纳士</span> -->
                <a>招贤纳士</a>
                <div class="zpxx_submenu">
                    <ul>
                        <li><a href="${pageContext.request.contextPath}/webRczpAction_findRczp">人才招聘</a></li>
                        <li><a href="${pageContext.request.contextPath}/webGsflAction_findGsfl">公司福利</a></li>
                    </ul>
                </div>
            </li>
            
            <li class="zxns">
                <!-- <span>产品资讯</span> -->
                <a href="${pageContext.request.contextPath}/webCpzxAction_webFindCpzxIndex">产品资讯</a>
                <div class="zpxx_submenu">
                    <ul>
                    	<c:if test="${!empty cpzxnav}">
	                        <c:forEach items="${cpzxnav}" var="cpzxnav">
		                        <li><a href="${pageContext.request.contextPath}/webCpzxMessageAction_findCplx?cplxtype=${cpzxnav.cplxtype}">${cpzxnav.cplxtype}</a></li>
	                        </c:forEach>
                        </c:if>
                    </ul>
                </div>
            </li>
            
            
            
            <li class="zxns">
                <!-- <span>产品资讯</span> -->
                <a href="${pageContext.request.contextPath}/webNewsAction_webFindNewsIndex">新闻资讯</a>
                <div class="zpxx_submenu">
                    <ul>
                        <c:if test="${!empty newsnav}">
	                        <c:forEach items="${newsnav}" var="newsnav">
		                        <li><a href="${pageContext.request.contextPath}/webNewsMessageAction_findNews?newstype=${newsnav.newstype}">${newsnav.newstype}</a></li>
	                        </c:forEach>
                        </c:if>
                    </ul>
                </div>
            </li>
            
            
            <li class="gsjj">
                <a href="${pageContext.request.contextPath}/webGsjjAction_findGsjj">首页</a>
            </li>
        </ul>
    </header>
</body>
</html>
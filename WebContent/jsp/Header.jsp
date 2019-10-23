<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>重庆吉芯科技有限公司后台管理</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/InitCss.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/Header.css">
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
            <li class="gsjj">
                <a href="${pageContext.request.contextPath}/webCpzxAction_webFindCpzx">产品资讯</a>
            </li>
            
            <li class="gsjj">
                <a href="${pageContext.request.contextPath}/webNewsAction_findNews">新闻资讯</a>
            </li>
            
            
            <li class="gsjj">
                <a href="${pageContext.request.contextPath}/webGsjjAction_findGsjj">首页</a>
            </li>
        </ul>
    </header>
</body>
</html>
<style scoped="scoped">
</style>
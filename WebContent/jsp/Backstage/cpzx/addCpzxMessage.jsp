<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>、

<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>重庆吉芯公司后台管理</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
	
	
<script type="text/javascript" src="${pageContext.request.contextPath}/js/wangEditor.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/wangEditor.min.js"></script>
<script type="text/javascript">
window.onload = function(){
	var E = window.wangEditor
    var editor = new E('#div1')
    var $text1 = $('#addCpzxMessageEditor')
    editor.customConfig.onchange = function (html) {
        // 监控变化，同步更新到 textarea
        $text1.val(html)
    }
    editor.create()
    // 初始化 textarea 的值
    $text1.val(editor.txt.html())
}

</script>
</head>
<body>
	<%@ include file="/jsp/Backstage/BackStage_header.jsp"%>
	<%@ include file="/jsp/lbImage.jsp"%>
	<div class="container">
		<form action="${pageContext.request.contextPath}/cpzxAction_addCpzx"  enctype="multipart/form-data" method="post">
		产品类型:<input type="text" name="cplxtype" >
		<div id="div1">
		 </div>
		<textarea style="display:none" id="addCpzxMessageEditor" class="form-control" rows="10" placeholder="产品类型描述"
			name="cplxcontent"></textarea>
		<input type="file" name="cpzxImage" required="required">
		<button type="submit" class="btn btn-primary">添加</button>
	</form>
	</div>
</body>
</html>
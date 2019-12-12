<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>重庆吉芯有限公司人才招聘网站</title>
</head>
<body onload="toGsjj()">
	
</body>
<script type="text/javascript">	
	function toGsjj(){
		window.location.href="<%=request.getContextPath()%>/webGsjjAction_findGsjj";
	}

</script>
</html>
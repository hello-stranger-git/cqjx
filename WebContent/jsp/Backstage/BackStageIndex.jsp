<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>重庆吉芯科技有限公司后台管理</title>
<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</head>
<body  oncontextmenu="return false" onselectstart="return false">
	<div>
		<%@ include file="/jsp/Header.jsp"%>
		<%@ include file="/jsp/lbImage.jsp"%>
		<div class="container">
				<!-- Nav tabs -->
				<ul class="nav nav-tabs" role="tablist">
					<li role="presentation" class="active"><a href="#index"
						aria-controls="index" role="tab" data-toggle="tab">首页</a></li>
					<li role="presentation"><a href="#cpzx" aria-controls="cpzx"
						role="tab" data-toggle="tab">产品资讯</a></li>
					<li role="presentation" class="dropdown"><a
						class="dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false"> 招贤纳士
							<span class="caret"></span>
					</a>
						<ul class="dropdown-menu">
							<li role="presentation"><a href="#rczp" aria-controls="lxwm"
						role="tab" data-toggle="tab">人才招聘</a></li>
						<li role="presentation"><a href="#gsfl" aria-controls="lxwm"
						role="tab" data-toggle="tab">公司福利</a></li>
						</ul></li>
					<li role="presentation"><a href="#lxwm" aria-controls="lxwm"
						role="tab" data-toggle="tab">联系我们</a></li>
				</ul>
				
				<!-- Tab panes -->
				<div class="tab-content">
					<div role="tabpanel" class="tab-pane fade in active" id="index">
						<textarea class="form-control" rows="10"></textarea>
						<button type="button" class="btn btn-primary">修改</button>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="cpzx">
						<textarea class="form-control" rows="10"></textarea>
						<button type="button" class="btn btn-primary">修改</button>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="rczp">
						<textarea class="form-control" rows="10"></textarea>
						<button type="button" class="btn btn-primary">修改</button>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="gsfl">
						<textarea class="form-control" rows="10"></textarea>
						<button type="button" class="btn btn-primary">修改</button>
					</div>
					<div role="tabpanel" class="tab-pane fade" id="lxwm">
						<textarea class="form-control" rows="10"></textarea>
						<button type="button" class="btn btn-primary">修改</button>
					</div>
				</div>
		</div>
	</div>
	<%@ include file="/jsp/Footer.jsp"%>
</body>
</html>
<style scoped="scoped">
	.nav-tabs{
		font-size: 20px;
    	margin-top: 20px;
	}
	.container{
		    background-color: #fff;
		    border-color: #ddd;
		    border-width: 1px;
		    border-radius: 4px 4px 0 0;
		    box-shadow: none;
	}
	.form-control{
			margin:35px 0px;
	}
	.bmdz,.zxns,.gsjj{
		display: none;
	}
</style>
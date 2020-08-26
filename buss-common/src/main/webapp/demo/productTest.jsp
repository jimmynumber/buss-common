<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page
	import="java.text.SimpleDateFormat"
	import="java.util.Date"
%>
<% 
	String staticUrl = config.getServletContext().getInitParameter("staticUrl");
	Date dt=new Date();
	SimpleDateFormat matter=new SimpleDateFormat("yyyy-MM-dd");
	String millis = matter.format(dt);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=staticUrl%>/common/js/jquery-1.12.4.min.js?v=<%=millis%>"></script>
<script type="text/javascript" src="<%=staticUrl%>/common/js/bootstrap.min.js?v=<%=millis%>"></script>
<link rel="stylesheet" href="<%=staticUrl%>/common/css/bootstrap.css?v=<%=millis%>" >
<link rel="stylesheet" href="<%=staticUrl%>/common/buss-css/product.css?v=<%=millis%>" >
<link rel="stylesheet/less" href="<%=staticUrl%>/common/css/common.less?v=<%=millis%>" >
<script type="text/javascript" src="<%=staticUrl%>/common/js/less.js?v=<%=millis%>"></script>
</head>
<body>
<div class="container-fluid">
	<a id="modal-47993" href="#modal-container-47993" onclick="initProdLevel('1')" role="button" class="btn" data-toggle="modal">触发遮罩窗体</a>
	<div class="modal fade" id="modal-container-47993" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
					<h4 class="modal-title" id="myModalLabel">产品查询</h4>
				</div>
				<div class="modal-body">
					
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="saveBtn">保存</button>
				</div>
			</div>
		</div>
	</div>
	</div>
</body>

<script type="text/javascript" src="<%=staticUrl%>/common/buss-js/product.js"></script>
</html>
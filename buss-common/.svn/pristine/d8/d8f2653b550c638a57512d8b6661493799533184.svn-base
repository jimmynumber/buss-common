<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page
	import="java.text.SimpleDateFormat"
	import="java.util.Date"
%>
<% 
	String staticUrl = config.getServletContext().getInitParameter("staticUrl");
	System.out.println("test="+staticUrl);
	Date dt=new Date();
	SimpleDateFormat matter=new SimpleDateFormat("yyyy-MM-dd");
	String millis = matter.format(dt);
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=staticUrl%>/common/js/jquery-1.12.4.min.js?v=<%=millis%>"></script>
<script type="text/javascript" src="<%=staticUrl%>/common/js/jquery-ui.js?v=<%=millis%>"></script>
<script type="text/javascript" src="<%=staticUrl%>/common/buss-js/organizationJs.js?v=<%=millis%>"></script>
<script type="text/javascript">
	function queryCompany() {
		var branchData = queryCompanyByEmp('00114260');
		if (branchData != null) {
			var html = "";
			var len = branchData.length;
			if (len == 1) {
				html += "<option value='"+branchData[0].id+"'>"+branchData[0].id+" - "+branchData[0].name+"</option>";
			} else if (len > 1){
				html += "<option value=''>全部</option>";
				for (i=0; i<len; i++){
					html += "<option value='"+branchData[i].id+"'>"+branchData[i].id+" - "+branchData[i].name+"</option>";
				}
				
			}
			$(".company").html(html);
		}
	}
	function queryBranch() {
		var branchData = queryBranchByEmp('00114260');
		if (branchData != null) {
			var html = "";
			var len = branchData.length;
			if (len == 1) {
				html += "<option value='"+branchData[0].id+"'>"+branchData[0].id+" - "+branchData[0].name+"</option>";
			} else if (len > 1){
				html += "<option value=''>全部</option>";
				for (i=0; i<len; i++){
					html += "<option value='"+branchData[i].id+"'>"+branchData[i].id+" - "+branchData[i].name+"</option>";
				}
				
			}
			$(".branch").html(html);
		}
	}
</script>
</head>
<body>
	<button  onclick="queryCompany()">查询分公司</button>
	<label>分公司：</label>
	<select id="company" class="company" name="company"><option value="">全部</option></select>
	</br>
	<button  onclick="queryBranch()">查询营业所</button>
	<label>营业所：</label>
	<select id="branch" class="branch" name="branch"><option value="">全部</option></select>
</body>
</html>
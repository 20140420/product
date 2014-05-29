<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
	<%@include file="/WEB-INF/pages/common/head.jsp"%>
	<div id="box">
<div id="left">
<div id="left_s01">
	<s:a action="customer_login" namespace="/customer">
		<img src="${context_path}/css/images/index_23.gif" class="imgx5" />
	</s:a>
	<s:a action="customer_reg" namespace="/customer">
		<img src="${context_path}/css/images/index_26.gif" class="imgx5" />
	</s:a>
		<img src="${context_path}/css/images/index_27.gif" />
</div>
<div id="left_s02">
	<img src="${context_path}/css/images/index_25.gif" width="489" height="245"	class="imgz5" />
</div>
<!-- 类别 -->

</div>
	</div>
  </body>
</html>

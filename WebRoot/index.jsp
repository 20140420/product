<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- 后台页面 -->
<s:url action="admin_manager" namespace="/admin" var="manager"></s:url>
<!-- 管理员登入页面 -->
<s:url action="user_login" namespace="/admin/user" var="user_login"></s:url>
<!-- WEB-INF里面主页 -->
<s:url action="indexweb" namespace="/" var="index"></s:url>
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
	<META HTTP-EQUIV="Refresh" CONTENT="2;URL=indexweb.html">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
	<center>
		<img src="<%=request.getContextPath()%>/css/images/load.gif"><br>
		<p>页面加载中......</p>
    <a href="${index}">WEB-INF里面主页</a><br>
    <a href="${manager}">无登入后台页面</a><br>
    <a href="${user_login}">管理员登入</a><br>
	</center>
  </body>
</html>

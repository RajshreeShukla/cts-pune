<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>from session.jsp page</h1>
<% response.setIntHeader("refresh",7);%>
<jsp:useBean id="ref" class="com.cts.bean.LoginBean" scope="session"></jsp:useBean>
	<jsp:getProperty property="userName" name="ref" />
	<jsp:getProperty property="password" name="ref" />


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

  session.setMaxInactiveInterval(5);
 %>
<!-- com.cts.bean.LoginBean ref=new LoginBean() -->
	<jsp:useBean id="ref" class="com.cts.bean.LoginBean" scope="session"/>
	
	<!-- ref.setUserNAme(request.getParameter("userName")) -->
	<%-- <jsp:setProperty property="userName" name="ref"/>
	<jsp:setProperty property="password" name="ref"/>
 --%><%-- <jsp:forward page="viewLogic.jsp"></jsp:forward> --%>
<jsp:setProperty property="*" name="ref"/>

</body>
</html>
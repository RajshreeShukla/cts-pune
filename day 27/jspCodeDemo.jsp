<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="i" begin="3" end="30" step="2">
<c:out value="${i}"></c:out>
</c:forEach>
<c:forTokens var="website" items="www.google.com" delims="">
<c:out value="${website} "></c:out>
</c:forTokens>
</body>
</html>
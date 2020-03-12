<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource user="root" password="root"
		url="jdbc:mysql://localhost:3306/ctspune"
		driver="com.mysql.jdbc.Driver" />
	<%-- <sql:update>
insert into employee values(9,"raj","vg45","manager",46,234,345)
</sql:update>
 --%>
	<%-- <sql:update>
 update employee designation="Senior manager" where name="raj"
 </sql:update> --%>
	<sql:query var="rs" sql="select * from employee">
	</sql:query>
	<table border="1px solid black " style="border-collapse: collapse;" >
		<tr>
			<th>id</th>
			<th>name</th>
			<th>address</th>
			<th>designation</th>
			<th>age</th>
			<th>salary</th>
			<th>phone</th>


			<c:forEach var="row" items="${rs.rows}">
				<tr>
					<td><c:out value="${row.id} "></c:out></td>
					<td><c:out value="${row.name} "></c:out></td>
					<td><c:out value="${row.address} "></c:out></td>
					<td><c:out value="${row.designation} "></c:out></td>
					<td><c:out value="${row.age} "></c:out></td>
					<td><c:out value="${row.salary} "></c:out></td>
					<td><c:out value="${row.phone} "></c:out></td>
			</c:forEach>
	</table>
</body>
</html>
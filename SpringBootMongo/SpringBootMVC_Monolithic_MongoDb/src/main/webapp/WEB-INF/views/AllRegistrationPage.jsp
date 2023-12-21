<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="MenuPage.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>MOBILE</th>
			<th>PASSWORD</th>
			<th>DELETE</th>
			<th>UPDATE</th>
		</tr>
		<c:forEach var="student" items="${AllStudents}">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.email}</td>
				<td>${student.mobile}</td>
				<td>${student.password}</td>
				<td><a href="Delete?id=${student.id}">Delete</a></td>
				<td><a href="FindDataById?id=${student.id}">Update</a>
			</tr>
		</c:forEach>
	</table>

</body>
</html>

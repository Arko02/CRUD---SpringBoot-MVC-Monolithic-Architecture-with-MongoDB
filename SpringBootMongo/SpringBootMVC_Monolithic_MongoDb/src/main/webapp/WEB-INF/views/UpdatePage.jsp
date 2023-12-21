<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="MenuPage.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student Details</title>
</head>
<body>

	<form action="UpdateDetails" method="post">

		<table border="">
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>MOBILE</th>
				<th>PASSWORD</th>
			</tr>
			<tr>
				<td>${Student.id}<input type="hidden" name="id"
					value="${Student.id}">
				</td>
				<td>${Student.name}<input type="text" name="name"
					value="${Student.name}" />
				</td>
				<td>${Student.email}<input type="text" name="email"
					value="${Student.email}" />
				</td>
				<td>${Student.mobile}<input type="text" name="mobile"
					value="${Student.mobile}" />
				</td>
				<td>${Student.password}<input type="text" name="password"
					value="${Student.password}" />
				</td>
				<td><input type="submit" value="Update" /></td>
			</tr>
		</table>

	</form>

</body>
</html>

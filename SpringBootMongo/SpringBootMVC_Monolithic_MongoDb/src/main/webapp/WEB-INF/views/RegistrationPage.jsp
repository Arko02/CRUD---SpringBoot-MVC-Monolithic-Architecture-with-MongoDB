<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="MenuPage.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="SaveData" method="post">
		<pre>
	Name<input type="text" name="name" />
	Email<input type="text" name="email" />
	Mobile<input type="text" name="mobile" />
	Password<input type="text" name="password" />
	<input type="submit" value="Save" />
	</pre>
	</form>

</body>
</html>
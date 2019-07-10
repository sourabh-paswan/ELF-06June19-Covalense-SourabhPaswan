<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%
	int userId = (Integer) (request.getAttribute("userId"));
	String password = (String) request.getAttribute("password");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management SpringWeb</title>
</head>
<body>

	userid:
	<%=userId%><br> password: <%=password%>


</body>
</html>
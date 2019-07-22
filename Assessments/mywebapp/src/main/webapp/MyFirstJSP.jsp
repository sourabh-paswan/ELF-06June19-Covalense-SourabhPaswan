

<!DOCTYPE html>
<%@page import="java.util.Date"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My First Html</title>
</head>
<body>
	<h1>
		current Date and time is :
		<%
		String currentDateTime = new Date().toString();
	%><br>
		<span style="color: green;"><%=currentDateTime%></span>
	</h1>


</body>
</html>
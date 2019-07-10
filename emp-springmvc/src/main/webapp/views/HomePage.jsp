<%@page import="com.covalense.emp.dto.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>employee-Spring</title>
</head>
<body>
	<h1>Welcome to home page</h1>
	<form action="./validator/validate/employee/search">
	<input type="search">
	</form>
	<div>
	id: ${id} <br>
	password : ${pas}<br>
	NAME        <br>
AGE : ${empbean.getEmpid()} <br>       
GENDER      <br>
SALARY      <br>
PHONE       <br>
JOINING_DATE<br>
AC_NO       <br>
EMAIL       <br>
DEGIGNATION <br>
DOB         <br>
DEPT_ID     <br>
MANAGER_ID  <br>
password<br>

	
	<br>
	
	</div>
</body>
</html>
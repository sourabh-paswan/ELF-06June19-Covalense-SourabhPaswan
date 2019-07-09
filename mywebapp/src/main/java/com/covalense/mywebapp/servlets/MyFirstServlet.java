package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String currentDateTime = new Date().toString();
		
		String htlmrsponce = "<!DOCTYPE html>"+
				"<html>"+
				"<head>"+
				"<meta charset=\"ISO-8859-1\">"+
				"<title>My First Html</title>"+
				"</head>"+
				"<body>"+
				"	<h1>"+
				"		current Date and time is : <span style=\"color: green\">"+ currentDateTime +
				"</span>"+
				"	</h1>"+
				"</body>"+
				"</html>";
		
		
		//send the above html response to browser
		resp.setContentType("text/html");
		resp.setHeader("Refresh", "1");//auto refresh every second
		PrintWriter out = resp.getWriter();
		out.print(htlmrsponce);
	}//end of doget()

}//end of class

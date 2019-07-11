package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.java.Log;
@Log
public class MyFirstServlet extends HttpServlet {
	
	
	public MyFirstServlet(){
		System.out.println("somthing");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String currentDateTime = new Date().toString();
		
		
		String httpMethod = req.getMethod();
		String protocol = req.getProtocol();
		String requestUrl = req.getRequestURL().toString();
		log.info("httpMethod"+httpMethod);
		log.info("protocol"+protocol);
		log.info("requestUrl"+requestUrl);
		
				
		//Get Query string information
	String fnameValue= 	req.getParameter("fname");
	String lnameValue= 	req.getParameter("lname");
		
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
				"<br><br>"+" First name : "+fnameValue+"<br>"+" last name : "+lnameValue+
				"	</h1>"+
				"</body>"+
				"</html>";
		
		
		//send the above html response to browser
		resp.setContentType("text/html");
		//resp.setContentType("application/pdf");
		//resp.setContentType("video/mp4");
		//resp.setHeader("Refresh", "1");//auto refresh every second
		PrintWriter out = resp.getWriter();
		out.print(htlmrsponce);
	}//end of doget()

}//end of class

package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createcookie")
public class CreateCookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// create a cookie
		Cookie nyNameCookie = new Cookie("myname", "sp");

		Cookie myLocationCookie = new Cookie("myLocation", "bangu");
		myLocationCookie.setMaxAge(7 * 24 * 60 * 60);
		// send the above cokkie to browser
		resp.addCookie(nyNameCookie);
		resp.addCookie(myLocationCookie);

		PrintWriter out = resp.getWriter();
		out.print("created the cookie !!!");

	}

}

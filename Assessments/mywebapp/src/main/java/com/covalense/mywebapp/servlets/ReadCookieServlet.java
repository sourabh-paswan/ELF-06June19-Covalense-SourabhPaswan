package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readcookie")
public class ReadCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie[] recievedCookies = req.getCookies();
		PrintWriter out = resp.getWriter();

		if (recievedCookies == null) {
			out.print("cokkies are not psent");
		} else {
			out.print("cokkies are psent");

			for (Cookie rcvdCooki : recievedCookies) {
				out.print("cookie name : " + rcvdCooki.getName());
				out.print("cookie name : " + rcvdCooki.getValue());
			}
		}
	}
}

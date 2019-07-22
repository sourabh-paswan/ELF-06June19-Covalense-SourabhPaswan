package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		//invalidate the http session
		HttpSession session = req.getSession(false);
		if(session!=null) {
		session.invalidate();}

		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"ISO-8859-1\">");
		out.print("<title>My Servlet Response</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h6 class=\"text-center\">");
		out.print("<span style=\"color:red\">");
		out.print("logged out successfully");
		out.print("</span>");
		out.print("</h6>");
		out.print("</body>");
		out.print("</html>");

		RequestDispatcher dispatcher = req.getRequestDispatcher("/loginPage");
		dispatcher.include(req, resp);

	}

}

package com.covalense.mywebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;

/**
 * Servlet implementation class ForwardServlet
 */
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// String url = "http://www.gmail.com";

		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		employeeInfoBean.setId(45);
		employeeInfoBean.setName("hella");
		employeeInfoBean.setPhone(78999998);

		// pass the above abject to employeesearchservlet
		// request.setAttribute("info", employeeInfoBean);
		ServletContext ctx = getServletContext();
		ctx.setAttribute("info", employeeInfoBean);
		String url = "search?Id=7";

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);

	}

}

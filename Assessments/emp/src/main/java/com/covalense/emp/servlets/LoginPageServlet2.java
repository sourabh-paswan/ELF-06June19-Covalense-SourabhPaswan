package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;
import com.covalense.emp.dto.EmployeeInfoBean;

@WebServlet("/loginpagemvc")
public class LoginPageServlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		PrintWriter out = resp.getWriter();
		// validate the session
		HttpSession session = req.getSession(false);
		if (session == null) {
			out.print("<h1><span style='color:red'>Invaled session!! pls login!!</span></h1>");
			out.print("<br><br>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		} else {

			String idValue = req.getParameter("eid");
			ArrayList<EmployeeInfoBean> beans = searchLikeEmployee(idValue);
			resp.setContentType("text/html");

			if (beans == null || beans.size() == 0) {
				RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
				dispatcher.forward(req, resp);

			} else {
				session.setAttribute("empdata", beans);
				Cookie cookie = new Cookie("JSESSIONID", session.getId());
				resp.addCookie(cookie);

				out.print("<!DOCTYPE html>");
				out.print("<html>");
				out.print("<head>");
				out.print("<meta charset=\"ISO-8859-1\">");
				out.print("<title>Search Result</title>");
				out.print("</head>");
				out.print("<body>");
				// out.print("<form action=>");
				out.print("<h1>");
				out.print("<span style=\"color:green\">");
				out.print("Employee(s) Found");
				out.print("</span>");
				out.print("<br><br>");
				out.print("</h1>");
				out.println("Employee(s) Found");
				for (EmployeeInfoBean employeeInfoBean : beans) {
					out.print("<br><a href='./display?eid=" + employeeInfoBean.getId() + "'" + "/> ID : "
							+ employeeInfoBean.getId());
					out.print("Name : " + employeeInfoBean.getName());
				}
				out.print("</body>");
				out.print("</html>");

			}
		}

	}

	private ArrayList<EmployeeInfoBean> searchLikeEmployee(String id) {

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		ArrayList<EmployeeInfoBean> beans = dao.getAllEmployeeInfo(id);

		return beans;
	}
}

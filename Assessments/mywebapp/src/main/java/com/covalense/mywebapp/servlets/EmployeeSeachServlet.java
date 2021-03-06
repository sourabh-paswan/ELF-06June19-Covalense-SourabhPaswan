package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

@WebServlet(urlPatterns = "/search", initParams = {
		@WebInitParam(name="actress", value="basanti")
})
//@WebServlet("/search/employeeSearch")
public class EmployeeSeachServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		ServletContext ctx = getServletContext();
		String movieName = ctx.getInitParameter("movie");
		
		ServletConfig config = getServletConfig();
		String actorName = config.getInitParameter("actor");
		String actressname = config.getInitParameter("actress");
		
		String idValue = req.getParameter("Id");

		// interact with db and get the employe info
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean bean = dao.getEmployeeInfo(idValue);

		// send the response to browser
		PrintWriter out = resp.getWriter();

		if (bean == null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><SPAN STYLE=\"color: red\"> employee not found..</span>");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><SPAN STYLE=\"color: green\"> employee  found..</span>");
			out.print("<br>");
			out.print("<br>Id " + bean.getId());
			out.print("<br>NAME " + bean.getName());
			out.print("<br>AGE " + bean.getAge());
			out.print("<br>GENDER " + bean.getGender());
			out.print("<br>SALARY " + bean.getSalary());
			out.print("<br>PHONE " + bean.getPhone());
			out.print("<br>JOINING_DATE " + bean.getJoiningDate());
			out.print("<br>AC_NO " + bean.getAccountNo());
			out.print("<br>EMAIL " + bean.getEmail());
			out.print("<br>DEGIGNATION " + bean.getDesignation());
			out.print("<br>DOB " + bean.getDob());
			out.print("<br>DEPT_ID " + bean.getDepartmentId());
			out.print("<br>MANAGER_ID " + bean.getManagerId());
			out.print("<br>movieName " + movieName);
			out.print("<br>actorName " + actorName);
			out.print("<br>actress " + actressname);
			
			out.print("</BODY>");
			out.print("</HTML>");
		}
		
		
		//get the object from forward servlet
//		EmployeeInfoBean employeeInfoBean =  (EmployeeInfoBean) req.getAttribute("info");
		EmployeeInfoBean employeeInfoBean =  (EmployeeInfoBean) ctx.getAttribute("info");
		
		if (employeeInfoBean == null) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><SPAN STYLE=\"color: red\"> employeeinfobean object not found..</span>");
			out.print("</BODY>");
			out.print("</HTML>");
		} else {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><SPAN STYLE=\"color: green\"> employeeinfobean object  found..</span>");
			out.print("<br>");
			out.print("<br>Id " + employeeInfoBean.getId());
			out.print("<br>NAME " + employeeInfoBean.getName());
			out.print("<br>PHONE " + employeeInfoBean.getPhone());
			out.print("</BODY>");
			out.print("</HTML>");
		}

	}

}

package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.DepartmentInfoBean;
import com.covalense.mywebapp.dao.DepartmentDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

public class Department extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idValue = req.getParameter("Id");
		String nameValue = req.getParameter("Name");

		DepartmentDAO dao = EmployeeDAOFactory.getInstance();
		DepartmentInfoBean empInfo = new DepartmentInfoBean();

		empInfo.setDeptId(Integer.parseInt(idValue));
		empInfo.setDeptName(nameValue);
		
		boolean savedept = dao.decreatecreateEmployeeInfo(empInfo);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		if (savedept == true) {
			out.print("<HTML>");
			out.print("<BODY>");
			out.print("<H1><SPAN STYLE=\"color: red\"> department created..</span>");
			out.print("</BODY>");
			out.print("</HTML>");
		}

	}
}

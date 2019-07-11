package com.covalense.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.dao.EmployeeDAO;
import com.covalense.mywebapp.dao.EmployeeDAOFactory;

@WebServlet("/createEmployee")
public class CreateEmployeeInfo extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String idValue = req.getParameter("Id");
		String nameValue = req.getParameter("Name");
		String ageValue = req.getParameter("AGE");
		String genderValue = req.getParameter("GENDER");
		String SalaryValue = req.getParameter("SALARY");
		String phoneValue = req.getParameter("PHONE");
		String joiningDateValue = req.getParameter("JOINING_DATE");
		String accountNoValue = req.getParameter("AC_NO");
		String emailValue = req.getParameter("EMAIL");
		String designationValue = req.getParameter("DEGIGNATION");
		String dobValue = req.getParameter("DOB");
		String departmentIdValue = req.getParameter("DEPT_ID");
		String managerIdValue = req.getParameter("MANAGER_ID");

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		EmployeeInfoBean empInfo = new EmployeeInfoBean();
		empInfo.setId(Integer.parseInt(idValue));
		empInfo.setName(nameValue);
		empInfo.setAge(Integer.parseInt(ageValue));
		empInfo.setGender(genderValue);
		empInfo.setSalary(Integer.parseInt(SalaryValue));
		empInfo.setPhone(Integer.parseInt(phoneValue));
		empInfo.setJoiningDate(new Date());
		empInfo.setAccountNo(Integer.parseInt(accountNoValue));
		empInfo.setEmail(emailValue);
		empInfo.setDesignation(designationValue);
		empInfo.setDob(new Date());
		empInfo.setDepartmentId(Integer.parseInt(departmentIdValue));
		empInfo.setManagerId(Integer.parseInt(managerIdValue));

		boolean saveemp = dao.createEmployeeInfo(empInfo);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

	}
}

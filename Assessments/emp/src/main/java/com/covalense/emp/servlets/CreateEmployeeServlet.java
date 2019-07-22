package com.covalense.emp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.EmployeeOtherInfoBean;

@WebServlet("/create")

public class CreateEmployeeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String idValue = req.getParameter("eid");
		int id = Integer.parseInt(req.getParameter("eid"));

		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();

		employeeInfoBean.setId(id);
		employeeInfoBean.setDepartmentId(Integer.parseInt(req.getParameter("edeptid")));
		employeeInfoBean.setManagerId(Integer.parseInt(req.getParameter("emanagerid")));
		employeeInfoBean.setAccountNo(Integer.parseInt(req.getParameter("eaccount")));
		employeeInfoBean.setDesignation(req.getParameter("edesignation"));
		employeeInfoBean.setEmail(req.getParameter("email"));
		employeeInfoBean.setGender(req.getParameter("egender"));
		try {
			employeeInfoBean.setJoiningDate(formatter.parse(req.getParameter("jdate")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		employeeInfoBean.setName(req.getParameter("ename"));
		employeeInfoBean.setPhone(Integer.parseInt(req.getParameter("ephone")));
		employeeInfoBean.setSalary(Double.parseDouble(req.getParameter("esalary")));
		try {
			employeeInfoBean.setDob(formatter.parse(req.getParameter("edob")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		employeeInfoBean.setAge(Integer.parseInt(req.getParameter("eage")));

		// inserting data for table Employee_other
		EmployeeOtherInfoBean empOther = new EmployeeOtherInfoBean();
		empOther.setId(id);
		empOther.setPan(req.getParameter("epan"));
		empOther.setMarried(true);
		empOther.setBloodGrp(req.getParameter("eblood"));
		empOther.setChallanged(false);
		empOther.setEmergencyNo(Integer.parseInt(req.getParameter("eemergency")));
		empOther.setEmergencyName(req.getParameter("eemergencycontact"));
		empOther.setNationality(req.getParameter("eNationality"));
		empOther.setReligion(req.getParameter("eReligion"));
		empOther.setFatherName(req.getParameter("eFatherName"));
		empOther.setMotherName(req.getParameter("eMother"));
		empOther.setSpouse(req.getParameter("eSpouse"));
		empOther.setPassport(req.getParameter("ePassport"));
		empOther.setAadhar(Integer.parseInt(req.getParameter("eAadhar")));

		employeeInfoBean.setEmpOther(empOther);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		if (dao.createEmployeeInfo(employeeInfoBean)) {

			RequestDispatcher dispatcher = req.getRequestDispatcher("./RegisterSuccess.jsp?msg=xyz");
			dispatcher.include(req, resp);

		} else {

			RequestDispatcher dispatcher = req.getRequestDispatcher("./Registerfail.jsp");
			dispatcher.include(req, resp);

		}

	}

	private boolean saveNewEmployee() {

		return true;

	}
}

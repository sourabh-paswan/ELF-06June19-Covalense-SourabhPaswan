package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.covalense.emp.commons.EMPCosnstants.*;

import com.covalense.emp.commons.EMPCosnstants;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactoryOld;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.UserBean;

@Controller
@RequestMapping("/login")
@PropertySource(PROPERTYFILE)
public class LoginController {

	@Autowired
	@Qualifier("hibernate")
	EmployeeDAO dao;

	@GetMapping("/loginpage")
	public String loginpage() {
		return EMPCosnstants.VIEW_LOGIN;
	}

	@PostMapping("/authenticate")
	public String authenticate(int empid, String pwd, HttpServletRequest req, @Value("${msg}") String msg,
			@Value("${dbInteractionType}") String dbInteractionType) {

		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
		dao = EmployeeDAOFactoryOld.getInstance(dbInteractionType);
		EmployeeInfoBean employeeInfoBean2 = dao.getEmployeeInfo(empid);

		if (employeeInfoBean.getId() == empid && employeeInfoBean.getPassword() == pwd) {
			HttpSession session = req.getSession(true);
			session.setAttribute("empbean", employeeInfoBean);
			session.setAttribute("pas", pwd);
			return EMPCosnstants.VIEW_HOMEPAGE;
		}
		req.setAttribute("msg", "invalid credentials");
		return EMPCosnstants.VIEW_LOGIN;
	}

	@GetMapping("/logout")
	public String logout(HttpSession httpSession, String msg, ModelMap modelMap) {
		httpSession.invalidate();
		modelMap.addAttribute("logoutsuccess", "thanks for visit");
		return EMPCosnstants.VIEW_LOGIN;
	}
}

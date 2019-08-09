package com.covalense.emp.controller;

import static com.covalense.emp.commons.EMPCosnstants.PROPERTYFILE;

import java.util.List;

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

import com.covalense.emp.commons.EMPCosnstants;
import com.covalense.emp.dao.EmployeeDAO;
import com.covalense.emp.dao.EmployeeDAOFactory;
import com.covalense.emp.dto.EmployeeAddressInfoBean;
import com.covalense.emp.dto.EmployeeEducationInfoBean;
import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.dto.EmployeeOtherInfoBean;

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

	@GetMapping("/createEmployee")
	public String createEmp() {
		return EMPCosnstants.CREATE_VIEW;
	}
	
	@GetMapping("/updateEmployee")
	public String getUpdateEmployee() {
		return EMPCosnstants.UPDATE_VIEW;
	}

	@PostMapping("/updateEmployee")
	public String updateEmployee(EmployeeInfoBean bean,int mngr_id) {
		
		EmployeeInfoBean mgrBean = dao.getEmployeeInfo(mngr_id);
		bean.setManagerId(mgrBean);
		dao.updateEmployeeInfo(bean);
		return EMPCosnstants.VIEW_HOMEPAGE;
	}
	
	
	
	
	
	@PostMapping("/createEmployee")
	public String saveEmployee(EmployeeInfoBean bean, ModelMap modelMap, int managerId) {

		EmployeeInfoBean bean2 = dao.getEmployeeInfo(managerId);
		bean.setManagerId(bean2);

		List<EmployeeEducationInfoBean> educationInfoBeans = bean.getEducationInfoBean();
		for (EmployeeEducationInfoBean employeeEduInfoBean : educationInfoBeans) {
			employeeEduInfoBean.getEducationPkBean().setInfoBean(bean);
		}

		List<EmployeeAddressInfoBean> addrBeans = bean.getAddressInfoBean();
		for (EmployeeAddressInfoBean employeeAddressInfoBean : addrBeans) {
			employeeAddressInfoBean.getAddressPkBean().setInfoBean(bean);
		}

		/*
		 * List<EmployeeExperienceInfoBean> expBeans = bean.getExperienceInfoBeans();
		 * for (EmployeeExperienceInfoBean employeeExperienceInfoBean : expBeans) {
		 * employeeExperienceInfoBean.getExperiencePKBean().setInfoBean(bean); }
		 */

		EmployeeOtherInfoBean otherInfoBean = bean.getEmployeeOtherInfoBean();
		otherInfoBean.setInfoBean(bean);


		if (dao.createEmployeeInfo(bean)) {
			modelMap.addAttribute("msg", "Employee added successfully");

		} else {
			modelMap.addAttribute("msg", "insertion fails");
			return "createEmployee";
		}
		return "createEmployee";
	}

	@PostMapping("/authenticate")
	public String authenticate(int id, String password, HttpServletRequest req, @Value("${msg}") String msg,
			@Value("${dbInteractionType}") String dbInteractionType) {

		EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();

		// dao = EmployeeDAOFactory.getInstance(dbInteractionType);
		EmployeeInfoBean employeeInfoBean2 = dao.getEmployeeInfo(id);

		if (employeeInfoBean.getId() == id && employeeInfoBean.getPassword() == 1234) {
			HttpSession session = req.getSession(true);
			session.setAttribute("empbean", employeeInfoBean);
			session.setAttribute("pas", password);
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

package com.covalense.springboot.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.springboot.dto.EmployeeAddressInfoBean;
import com.covalense.springboot.dto.EmployeeEducationInfoBean;
import com.covalense.springboot.dto.EmployeeInfoBean;
import com.covalense.springboot.dto.EmployeeOtherInfoBean;
import com.covalense.springboot.dto.EmployeeResponse;
import com.covalense.springboot.dto.ExperienceInfoBean;
import com.covalense.springboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@GetMapping(path = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
	public String helloWorld() {
		return "Hello World !!!";
	}

	@PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse createEmployee(@RequestBody EmployeeInfoBean bean) {

		bean.getEmployeeOtherInfoBean().setInfoBean(bean);

		for (EmployeeAddressInfoBean addressInfoBean : bean.getAddressInfoBean()) {
			addressInfoBean.getAddressPkBean().setInfoBean(bean);
		}

		for (EmployeeEducationInfoBean educationInfoBean : bean.getEducationInfoBean()) {
			educationInfoBean.getEducationPkBean().setInfoBean(bean);
		}

		for (ExperienceInfoBean experienceInfoBean : bean.getExperienceInfoBeans()) {
			experienceInfoBean.getExperiencePKBean().setInfoBean(bean);
		}

		EmployeeInfoBean manager = bean.getManagerId();
		if (manager != null) {
			manager = repository.findById(manager.getId()).get();
			bean.setManagerId(manager);
		}

		EmployeeResponse response = new EmployeeResponse();
		if (!repository.existsById(bean.getId())) {
			repository.save(bean);
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("employee data added successfully");
		} else {
			response.setStatusCode(401);
			response.setMessage("fail");
			response.setDescription("employee data added failure");
		}

		return response;
	}// end of createEmployee

	@PostMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse updateEmployee(@RequestBody EmployeeInfoBean bean, HttpServletRequest request) {

		bean.getEmployeeOtherInfoBean().setInfoBean(bean);

		for (EmployeeAddressInfoBean addressInfoBean : bean.getAddressInfoBean()) {
			addressInfoBean.getAddressPkBean().setInfoBean(bean);
		}

		for (EmployeeEducationInfoBean educationInfoBean : bean.getEducationInfoBean()) {
			educationInfoBean.getEducationPkBean().setInfoBean(bean);
		}

		for (ExperienceInfoBean experienceInfoBean : bean.getExperienceInfoBeans()) {
			experienceInfoBean.getExperiencePKBean().setInfoBean(bean);
		}

		EmployeeInfoBean manager = bean.getManagerId();
		if (manager != null) {
			manager = repository.findById(manager.getId()).get();
			bean.setManagerId(manager);
		}

		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			if (repository.existsById(bean.getId())) {
				bean.getEmployeeOtherInfoBean().setOtherInfoId(repository.findByEmpId(bean).getOtherInfoId());
				repository.save(bean);
				response.setStatusCode(201);
				response.setMessage("success");
				response.setDescription("employee data updated successfully");
			} else {
				response.setStatusCode(401);
				response.setMessage("fail");
				response.setDescription("employee data update failure");
			}

			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("failure");
			response.setDescription("please login first");
			return response;
		}
	}// end of updateEmployee

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse getEmployee(int id, HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			EmployeeInfoBean bean = repository.findById(id).get();
			if (bean != null) {
				response.setStatusCode(201);
				response.setMessage("success");
				response.setDescription("employee data found successfully");
				response.setInfoBeans(Arrays.asList(bean));
			} else {
				response.setStatusCode(401);
				response.setMessage("fail");
				response.setDescription("employee data not found");
			}

			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("failure");
			response.setDescription("please login first");
			return response;
		}
	}// end of getEmployee

	@DeleteMapping(path = "/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse deleteEmployee(int id, HttpServletRequest request) {
		EmployeeResponse response = new EmployeeResponse();
		if (request.getSession(false) != null) {
			if (repository.existsById(id)) {
				repository.deleteById(id);
				response.setStatusCode(201);
				response.setMessage("success");
				response.setDescription("employee data deleted successfully");
			} else {
				response.setStatusCode(401);
				response.setMessage("fail");
				response.setDescription("employee data deleted failed");
			}

			return response;
		} else {
			response.setStatusCode(501);
			response.setMessage("failure");
			response.setDescription("please login first");
			return response;
		}
	}// end of deleteEmployee

	@GetMapping(value = "/getOtherInfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeOtherInfoBean getOtherInfo(int id) {
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(id);
		return repository.findByEmpId(bean);
	}// end of getOtherInfo

	@GetMapping(path = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse searchEmployee(int id) {
		EmployeeInfoBean bean = repository.findById(id).get();
		EmployeeResponse response = new EmployeeResponse();
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("employee data found successfully");
			response.setInfoBeans(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("fail");
			response.setDescription("employee data not found");
		}

		return response;
	}// end of searchEmployee

	@PostMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse login(int id, int password, HttpServletRequest request) {
		EmployeeInfoBean bean = repository.findById(id).get();
		EmployeeResponse employeeResponse = new EmployeeResponse();
		if (bean != null && bean.getPassword() == password) {
			employeeResponse.setStatusCode(201);
			employeeResponse.setMessage("successfull");
			employeeResponse.setDescription("employee login successfully");
			employeeResponse.setInfoBeans(Arrays.asList(bean));
			request.getSession().setAttribute("bean", bean);
			;
		} else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("failure");
			employeeResponse.setDescription("employee login failure");
		}
		return employeeResponse;

	}

	@GetMapping(value = "/logout") // produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse logout(HttpSession session) {
		session.invalidate();
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("successfull");
		response.setDescription("logged out successfully");
		return response;
	}

	@GetMapping(value = "/readCookie", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponse readCookie(@CookieValue(name = "JSESSIONID") String sessionId) {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(201);
		response.setMessage("successfull");
		response.setDescription("jsessssid  " + sessionId);
		return response;
	}

}

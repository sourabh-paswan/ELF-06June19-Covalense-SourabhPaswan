package com.covalense.lms.controllers;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covalense.lms.dto.UserResponse;
import com.covalense.lms.dto.UsersBean;
import com.covalense.lms.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LibraryController {

	@Autowired
	UserRepository repository;

	@GetMapping(path = "/library", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getHello() {
		return "welcome to library manegment system";
	}

	@PostMapping(path = "/createUser", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse createUser(@RequestBody UsersBean bean) {

		UserResponse response = new UserResponse();
		bean.setUserId((int) Math.random());
		repository.save(bean);
		
		response.setStatusCode(201);
		response.setMessage("Successfull");
		response.setDescription("Employee data inserted successfully");
		response.setUsersBeans(Arrays.asList(bean));
		return response;
	}

	@GetMapping(value = "/logout", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse logout(HttpSession session) {
		session.invalidate();
		UserResponse response = new UserResponse();
		response.setStatusCode(201);
		response.setMessage("successfull");
		response.setDescription("logged out successfully");
		return response;
	}

	@PostMapping(value = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse login(Integer userId, String password, String userType, HttpServletRequest request) {
		UsersBean bean = repository.findById(userId).get();
		UserResponse employeeResponse = new UserResponse();
		System.out.println(password + "   " + userId + "  " + bean);
		if (bean != null && bean.getPassword().equals(password) && bean.getUserType().equals(userType)) {
			employeeResponse.setStatusCode(201);
			employeeResponse.setMessage("successfull");
			employeeResponse.setDescription("user login successfully");
			employeeResponse.setUsersBeans(Arrays.asList(bean));
			request.getSession().setAttribute("bean", bean);
		} else {
			employeeResponse.setStatusCode(401);
			employeeResponse.setMessage("failure");
			employeeResponse.setDescription("user login failure");
		}
		return employeeResponse;

	}
}

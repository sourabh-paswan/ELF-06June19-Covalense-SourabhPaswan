package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.dto.UserBean;

@Controller
@RequestMapping("/session")
public class SessionController {

	@GetMapping("/loginform")
	public String login() {
		return "MyForm";
	}

	@PostMapping("/login")
	public String authenticate(UserBean userBean, HttpServletRequest req) {
		if (userBean.getEmpid() == 101 && userBean.getPwd() == 1234) {
			HttpSession session = req.getSession(true);
			return "userhome";
		}
		req.setAttribute("msg", "invalid credentials");
		return "MyForm";
	}

}

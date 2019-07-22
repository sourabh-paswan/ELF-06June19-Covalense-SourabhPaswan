package com.covalense.emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.covalense.emp.dto.UserBean;

@Controller
@RequestMapping("/forms")
public class FormHandlingController {

	@GetMapping("/getForm")
	public String getForm() {
		return "MyForm";
	}

	@PostMapping("/formSubmit")
	public String submitForm(HttpServletRequest req) {
		int userid = Integer.parseInt((req.getParameter("userId")));
		String password = req.getParameter("password");
		req.setAttribute("userId", userid);
		req.setAttribute("password", password);
		return "FormDataDisplay";
	}

	@PostMapping("/formSubmit2")
	public String submitForm2(int userid, String password, ModelMap modelMap) {
		modelMap.addAttribute("userId", userid);
		modelMap.addAttribute("password", password);
		return "FormDataDisplay";
	}

	// ===========================================
	// third way by bean
	@PostMapping("/formSubmit3")
	public String submitForm3(UserBean userbean, ModelMap modelMap) {
		modelMap.addAttribute("userbean", userbean);
		return "FormDataBeanDisplay";
	}

	// ===========================================
	// fourth way by request parameter
	@PostMapping("/formSubmit4")
	public String submitForm4(@RequestParam(name = "userId") int userId,
			@RequestParam(name = "password") String password, ModelMap modelMap) {
		modelMap.addAttribute("userId", userId);
		modelMap.addAttribute("password", password);
		return "FormDataDisplay";
	}

	// ===========================================
	// fifth way by Expression language
	@PostMapping("/formSubmit5")
	public String submitForm5(@RequestParam(name = "userId") int userId,
			@RequestParam(name = "password") String password, ModelMap modelMap) {
		modelMap.addAttribute("userId", userId);
		modelMap.addAttribute("password", password);
		return "FormDataDisplayEL";
	}

	// ===========================================
	// sixth way by Expression language
	@PostMapping("/formSubmit6")
	public String submitForm6(UserBean userbean, ModelMap modelMap) {
		modelMap.addAttribute("userbean", userbean);
		return "FormDataBeanDisplayEL";
	}

}

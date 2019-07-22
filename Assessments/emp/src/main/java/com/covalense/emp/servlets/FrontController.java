package com.covalense.emp.servlets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.covalense.emp.dto.EmployeeInfoBean;

@Controller
@RequestMapping("/employee")
public class FrontController {
	
	@GetMapping("/mylogin")
	public String getForm() {
		return "loginJSP";
	}
	
	@PostMapping("/loginpage")
	public String submitForm3(EmployeeInfoBean infoBean, ModelMap modelMap) {
		modelMap.addAttribute("infoBean", infoBean);
		return "DisplayServlet";
	}
}

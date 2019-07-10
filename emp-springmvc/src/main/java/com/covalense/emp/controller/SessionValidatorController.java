package com.covalense.emp.controller;

import static com.covalense.emp.commons.EMPCosnstants.PROPERTYFILE;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/validator")
@PropertySource(PROPERTYFILE)
public class SessionValidatorController {

	@PostMapping("/validate/{url1}/{url2}")
	public String validator(HttpSession Session, ModelMap modelMap, @RequestParam String url,
			@Value("${url1}") String url1, @Value("${url2}") String url2, @Value("${msg}") String msg) {
		if (Session.isNew()) {
			modelMap.addAttribute("msg", msg);
			return "loginJSP";
		}
		return "forward:/" + url1 + "/" + url2;

	}

	@GetMapping("/validate")
	public String validate(HttpSession Session, ModelMap modelMap, @RequestParam String url,
			@Value("${url1}") String url1, @Value("${url2}") String url2, @Value("${msg}") String msg) {
		return validate(Session, modelMap, url, url1, url2, msg);

	}

}

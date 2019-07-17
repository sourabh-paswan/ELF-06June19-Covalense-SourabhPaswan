package com.covalense.springcore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.covalense.springcore.beans.DepartmentBean;
import com.covalense.springcore.beans.EmployeeBean;

@Configuration
@Import(DepartmentBean.class)
public class EmployeeConfig {
	@Bean
	public EmployeeBean employeeBean() {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setName("soupas");
		employeeBean.setSalary(87878788);
		return employeeBean;

	}

	

}

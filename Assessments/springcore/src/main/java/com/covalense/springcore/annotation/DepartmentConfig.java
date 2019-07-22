package com.covalense.springcore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.springcore.beans.DepartmentBean;

@Configuration
public class DepartmentConfig {
	@Bean(name = "admin")
	public DepartmentBean getDepartmentadmin() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setdName("admin");
		departmentBean.setDpartmentID(564);
		return departmentBean;

	}
	
	@Bean(name = "it")
	public DepartmentBean getDepartmentit() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setdName("it");
		departmentBean.setDpartmentID(564);
		return departmentBean;

	}
	
	@Bean(name = "science")
	public DepartmentBean getDepartmentscience() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setdName("science");
		departmentBean.setDpartmentID(564);
		return departmentBean;

	}
}

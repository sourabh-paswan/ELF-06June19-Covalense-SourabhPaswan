package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.annotation.DepartmentConfig;
import com.covalense.springcore.annotation.EmployeeConfig;
import com.covalense.springcore.beans.DepartmentBean;
import com.covalense.springcore.beans.EmployeeBean;

import lombok.extern.java.Log;

@Log
public class EmployeeAnotationTest {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class, DepartmentConfig.class);

		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);

		log.info("" + employeeBean.getName());
		log.info("" + employeeBean.getSalary());

		DepartmentBean departmentBean = employeeBean.getDepartmentBean();

		log.info("" + departmentBean.getdName());
		log.info("" + departmentBean.getDpartmentID());

	}

}

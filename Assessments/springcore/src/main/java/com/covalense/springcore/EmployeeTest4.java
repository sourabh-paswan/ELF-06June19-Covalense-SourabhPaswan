package com.covalense.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeTest4 {

	public static void main(String[] args) {

		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Employee3.xml");
		EmployeeInfoBean emp = (EmployeeInfoBean) applicationContext.getBean("employeeInfoBean1");
		
		log.info("name " + emp.getName());
		log.info("salary " + emp.getSalary());
		
		log.info("department id "+emp.getDepartmentBean().getDpartmentID());
		log.info("department name "+emp.getDepartmentBean().getdName());
		
	}

}

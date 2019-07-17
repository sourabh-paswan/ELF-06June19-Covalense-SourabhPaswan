package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeTestByNameType {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("EmployeebyConstructorWiring.xml");

		// ApplicationContext applicationContext = new
		// ClassPathXmlApplicationContext("Employeebyname.xml");

		EmployeeInfoBean emp = (EmployeeInfoBean) applicationContext.getBean("employeeInfoBean1");

		log.info("name " + emp.getName());
		log.info("salary " + emp.getSalary());

		log.info("department id " + emp.getDepartmentBean().getDpartmentID());
		log.info("department name " + emp.getDepartmentBean().getdName());

	}

}

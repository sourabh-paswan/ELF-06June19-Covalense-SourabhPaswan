package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeInfoBean;

import lombok.extern.java.Log;
@Log
public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Employee.xml");
		EmployeeInfoBean emp =  (EmployeeInfoBean) applicationContext.getBean("employeeInfoBean1");
		log.info("name "+emp.getName()); 
		log.info("salary "+emp.getSalary()); 
		
		
		EmployeeInfoBean emp2 =  (EmployeeInfoBean) applicationContext.getBean("employeeInfoBean2 ");
		log.info("name "+emp2.getName()); 
		log.info("salary "+emp2.getSalary()); 
	}

}

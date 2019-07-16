package com.covalense.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.beans.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class EmployeeTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Employee2.xml");
		EmployeeInfoBean emp = (EmployeeInfoBean) applicationContext.getBean("employeeInfoBean1");
		log.info("name 1");
		emp.setName(sc.nextLine());
		sc.nextLine();
		log.info("salary 1");
		emp.setSalary(sc.nextInt());
		sc.nextLine();
		EmployeeInfoBean emp2 = (EmployeeInfoBean) applicationContext.getBean("employeeInfoBean1");
		log.info("name 2");
		emp2.setName(sc.nextLine());
		sc.nextLine();
		log.info("salary 2");
		emp2.setSalary(sc.nextInt());
		sc.nextLine();
		log.info("name " + emp.getName());
		log.info("salary " + emp.getSalary());
		log.info("name " + emp2.getName());
		log.info("salary " + emp2.getSalary());
	}

}

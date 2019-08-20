package com.covalense.hibernatetospring.testapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.hibernatetospring.beans.EmployeeInfoBean;
import com.covalense.hibernatetospring.config.empConfig;

public class SaveRecords {
	public static void main(String[] args) throws ParseException {
		ApplicationContext context = new AnnotationConfigApplicationContext(empConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		EmployeeInfoBean empInfo = new EmployeeInfoBean();
		empInfo.setId(4564);
		empInfo.setName("sourabh");
		empInfo.setAge(25);
		empInfo.setGender("male");
		empInfo.setSalary(15000);
		empInfo.setPhone(981083690);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date = format.parse("2017-12-13");
		Date dob = format.parse("1994-05-04");
		empInfo.setJoiningDate(date);
		empInfo.setAccountNo(789789979);
		empInfo.setEmail("yfyfjyf@hkjj.com");
		empInfo.setDesignation("soft engg");
		empInfo.setDob(dob);
		empInfo.setDepartmentId(455);
		empInfo.setManagerId(789797);

		Transaction transaction = session.beginTransaction();
		session.save(empInfo);
		transaction.commit();
		session.close();
	}

}
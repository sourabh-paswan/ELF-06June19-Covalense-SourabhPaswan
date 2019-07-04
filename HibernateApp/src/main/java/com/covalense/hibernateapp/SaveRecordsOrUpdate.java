package com.covalense.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

public class SaveRecordsOrUpdate {
	public static void main(String[] args) throws ParseException {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//mapping
		//cfg.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		EmployeeInfoBean empInfo = new EmployeeInfoBean();
		empInfo.setId(133);
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
		empInfo.setDesignation("senior soft engg");
		empInfo.setDob(dob);
		empInfo.setDepartmentId(455);
		empInfo.setManagerId(789797);
		
		Transaction transaction= session.beginTransaction();
		session.saveOrUpdate(empInfo);
		transaction.commit();
		session.close();
	}

}

package com.covalense.hibernatetospring.testapp;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.hibernatetospring.beans.EmployeeOtherInfoBean;
import com.covalense.hibernatetospring.config.empConfig;


public class SaveRecordsTwo {
	public static void main(String[] args) throws ParseException {
		ApplicationContext context = new AnnotationConfigApplicationContext(empConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();
		
		EmployeeOtherInfoBean empInfo = new EmployeeOtherInfoBean();
		empInfo.setId(145453);
		empInfo.setPan("8787899797");
		empInfo.setMarried(true);
		empInfo.setBloodGrp("o+");
		empInfo.setChallanged(false);
		empInfo.setEmergencyNo(7898954);
		empInfo.setEmergencyName("danisha");
		empInfo.setNationality("india");
		empInfo.setReligion("hind");
		empInfo.setFatherName("danish");
		empInfo.setMotherName("pritui");
		empInfo.setSpouse("ritika");
		empInfo.setPassport("uighh897897");
		empInfo.setAadhar(9989998);
		
		Transaction transaction= session.beginTransaction();
		session.save(empInfo);
		transaction.commit();
		session.close();
	}

}

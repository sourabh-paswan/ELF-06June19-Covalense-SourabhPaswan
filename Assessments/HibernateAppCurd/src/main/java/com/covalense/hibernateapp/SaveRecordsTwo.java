package com.covalense.hibernateapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;

public class SaveRecordsTwo {
	public static void main(String[] args) throws ParseException {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//mapping
		//cfg.addAnnotatedClass(EmployeeInfoBean.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		EmployeeOtherInfoBean empInfo = new EmployeeOtherInfoBean();
		empInfo.setId(133);
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

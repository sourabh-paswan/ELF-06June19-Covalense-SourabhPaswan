package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.dto.EmployeeOtherInfoBean;

public class DeleteRecords {

	public static void main(String[] args) {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		EmployeeInfoBean ebean = session.get(EmployeeInfoBean.class, 5);
		ebean.setAge(99);
		ebean.setEmail("guriyanew@gmail.com");
		
		EmployeeOtherInfoBean eOtherBean = session.get(EmployeeOtherInfoBean.class, 133);
		eOtherBean.setPan("995454454");
		
		Transaction transaction = session.beginTransaction();
		session.delete(eOtherBean);
		session.delete(ebean);
		transaction.commit();
		session.close();
		
	}

}

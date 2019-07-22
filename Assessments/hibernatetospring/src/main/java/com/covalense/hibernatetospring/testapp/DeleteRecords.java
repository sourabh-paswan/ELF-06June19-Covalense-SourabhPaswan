package com.covalense.hibernatetospring.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.hibernatetospring.beans.EmployeeInfoBean;
import com.covalense.hibernatetospring.beans.EmployeeOtherInfoBean;
import com.covalense.hibernatetospring.config.empConfig;


public class DeleteRecords {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(empConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();
		
		EmployeeInfoBean ebean = session.get(EmployeeInfoBean.class, 7);
		ebean.setAge(99);
		ebean.setEmail("guriyanew@gmail.com");
		
		EmployeeOtherInfoBean eOtherBean = session.get(EmployeeOtherInfoBean.class, 22);
		eOtherBean.setPan("995454454");
		
		Transaction transaction = session.beginTransaction();
		session.delete(eOtherBean);
		session.delete(ebean);
		transaction.commit();
		session.close();
		
	}

}

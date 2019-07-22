package com.covalense.hibernatetospring.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.hibernatetospring.beans.EmployeeInfoBean;
import com.covalense.hibernatetospring.config.empConfig;

import lombok.extern.java.Log;

@Log
public class ReadRecords {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(empConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		EmployeeInfoBean ebean = session.get(EmployeeInfoBean.class, 5);
		log.info("" + ebean.getAge());
		log.info("" + ebean.getAccountNo());

		session.close();
	}

}

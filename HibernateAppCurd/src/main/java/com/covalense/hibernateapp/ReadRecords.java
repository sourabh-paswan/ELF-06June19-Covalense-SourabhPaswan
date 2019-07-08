package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class ReadRecords {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");

		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeInfoBean ebean = session.get(EmployeeInfoBean.class, 5);
		log.info("" + ebean.getAge());
		log.info("" + ebean.getAccountNo());

		session.close();
	}

}

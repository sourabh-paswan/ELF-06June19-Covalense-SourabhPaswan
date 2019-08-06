package com.covalense.hibernateapp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class HibernateUtil {
	public static SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {
//		Configuration configuration = new Configuration();
//		configuration.configure("hibernate.cfg.xml");
//		
//		SessionFactory sessionFactory= configuration.buildSessionFactory();
//		return sessionFactory;

		return new Configuration()
				.configure()
				.addAnnotatedClass(EmployeeInfoBean.class)
				.addAnnotatedClass(EmployeeOtherInfoBean.class)
				.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}
	public static Session openSession() {
		return getSessionFactory().openSession();
		
		
	}

}

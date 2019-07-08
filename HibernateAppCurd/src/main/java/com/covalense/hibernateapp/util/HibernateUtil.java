package com.covalense.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory sessionFactory;
	
	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory= configuration.buildSessionFactory();
		return sessionFactory;
	}
	
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			sessionFactory= buildSessionFactory();	
		}
		return sessionFactory;
	}
	
	
}

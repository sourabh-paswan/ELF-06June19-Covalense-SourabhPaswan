package com.covalense.emp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.emp.dto.EmployeeInfoBean;

public final class HibernateUtil {

	private static SessionFactory sessionFactory = null;
	
	int[] a = new int[]{2,4};
	int[] b = {2,4};
	
	private HibernateUtil() {}

	private static SessionFactory buildSessionFactory() {
		return new Configuration()
				.configure()
				.addAnnotatedClass(EmployeeInfoBean.class)
				.buildSessionFactory();		
	}
	
	private static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}
	
	public static Session openSession() {
		return getSessionFactory().openSession();
	}

}

package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtilCache {
	private static SessionFactory factory=null;

	private static SessionFactory buildFactory() {
		if (factory == null) {
			Configuration config = new Configuration();
			config.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml");
			config.addAnnotatedClass(EmployeeInfoBean.class);

			return config.buildSessionFactory();

		}
		return factory;

	}

	public static Session getSessionFactory() {
		{
			return buildFactory().openSession();
		}

	}
}

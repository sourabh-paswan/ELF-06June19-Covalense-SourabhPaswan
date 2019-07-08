package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCasheTestTwo {

	public static void main(String[] args) {
		log.info("1st " + getEmployeeData(1).toString());
		log.info("2nd " + getEmployeeData(1).toString());
		log.info("3rd " + getEmployeeData(1).toString());

	}// End of main

	private static EmployeeInfoBean getEmployeeData(int id) {
		// 1. Load the config file
		Configuration config = new Configuration();
		config.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(EmployeeNewInfoBean.class);

		// 2. build the session factory
		SessionFactory factory = config.buildSessionFactory();
		// 3. open session
		Session session = factory.openSession();
		// 4. interact with db via connection
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, 1);
		log.info("1st " + bean.toString());

		EmployeeInfoBean beanTwo = session.get(EmployeeInfoBean.class, 1);
		log.info("2nd " + bean.toString());

		EmployeeInfoBean beanThree = session.get(EmployeeInfoBean.class, 1);
		log.info("3rd " + bean.toString());

		EmployeeInfoBean beanFour = session.get(EmployeeInfoBean.class, 1);
		log.info("4th " + bean.toString());
		// close session
		session.close();
		return beanFour;
	}
}// End of class

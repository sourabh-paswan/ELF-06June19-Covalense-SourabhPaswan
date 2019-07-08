package com.covalense.hibernateapp.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCasheTest {

	public static void main(String[] args) {

		// 1. Load the config file
		Configuration config = new Configuration();
		config.configure("com/covalense/hibernateapp/cache/hibernate.cache.cfg.xml");
		config.addAnnotatedClass(EmployeeNewInfoBean.class);

		// 2. build the session factory
		SessionFactory factory = config.buildSessionFactory();
		// 3. open session
		Session session = factory.openSession();
		// 4. interact with db via connection
		EmployeeNewInfoBean bean = session.get(EmployeeNewInfoBean.class, 1);
		log.info("1st " + bean.toString());

		EmployeeNewInfoBean beanTwo = session.get(EmployeeNewInfoBean.class, 1);
		log.info("2nd " + bean.toString());

		EmployeeNewInfoBean beanThree = session.get(EmployeeNewInfoBean.class, 1);
		log.info("3rd " + bean.toString());

		EmployeeNewInfoBean beanFour = session.get(EmployeeNewInfoBean.class, 1);
		log.info("4th " + bean.toString());
		// close session
		session.close();

	}// End of main
}// End of class

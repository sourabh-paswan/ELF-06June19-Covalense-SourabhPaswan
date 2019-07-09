package com.covalense.hibernateapp.awsrds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;
@Log
public class HibernateForAwsRds {
	public static void main(String[] args) {
		
		EmployeeInfoBean beans = new EmployeeInfoBean();
		Configuration configuration = new Configuration();
		configuration.configure("com/covalense/hibernateapp/awsrds/hibernate.awsrds.cfg.xml");
		configuration.addAnnotatedClass(EmployeeInfoBean.class);
		
		SessionFactory sessionFactory= configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, 2);
		log.info("Employee details"+bean.toString());
		session.close();
	}
	
}

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

		EmployeeInfoBean bean;
		try (Session session = HibernateUtilCache.getSessionFactory();) {
			bean = session.get(EmployeeInfoBean.class, id);
		}

		return bean;
	}// End of getEmployeeData
}// End of class

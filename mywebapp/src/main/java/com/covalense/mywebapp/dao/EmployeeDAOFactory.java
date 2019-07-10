package com.covalense.mywebapp.dao;

public class EmployeeDAOFactory {

	private static String dbInteration = "hibernate";

	private EmployeeDAOFactory() {}
	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;
		if (dbInteration.equals("jdbc")) {
			dao = new EmployeeDAOJDBCImpl();
		} else if (dbInteration.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl();
		}
		return dao;

	}

}

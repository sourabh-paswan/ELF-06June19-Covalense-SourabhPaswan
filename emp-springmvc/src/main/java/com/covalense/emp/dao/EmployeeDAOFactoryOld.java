package com.covalense.emp.dao;

public class EmployeeDAOFactoryOld {

	//private static String dbInteractionType = "hibernate";
	
	private EmployeeDAOFactoryOld() {}

	public static EmployeeDAO getInstance(String dbInteractionType) {
		EmployeeDAO dao = null;
		if (dbInteractionType.equals("jdbc")) {
			//dao = new EmployeeDAOJDBCImpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl();
		}
		return dao;
	}// End of getInstance()

}// End of Class

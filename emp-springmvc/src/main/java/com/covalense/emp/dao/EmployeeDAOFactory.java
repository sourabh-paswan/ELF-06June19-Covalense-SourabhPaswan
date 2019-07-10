package com.covalense.emp.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class EmployeeDAOFactory {

	@Bean("jdbc")
	public EmployeeDAO getInstanceJdbc() {
		return null;

	}

	@Bean("hibernate")
	public EmployeeDAO getInstanceHibernate() {
		return new EmployeeDAOHibernateImpl();
	}

}// End of Class

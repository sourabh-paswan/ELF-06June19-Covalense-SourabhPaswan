package com.covalense.assessment.one.curd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.assessment.dto.CustomersBean;

public class InsertCustomers {
public static void main(String[] args) {
	Configuration configuration = new Configuration();
	configuration.configure();
	
	SessionFactory factory = configuration.buildSessionFactory();
	Session session = factory.openSession();
	
	CustomersBean bean = new CustomersBean();
	bean.setId(102);
	bean.setFirstName("sourabh");
	bean.setLastName("paswan");
	bean.setContactNumber(9810836905L);
	bean.setAddress("home");
	bean.setCity("patna");
	bean.setState("bihar");
	bean.setCountry("india");
	
	Transaction transaction = session.beginTransaction();
	session.save(bean);
	transaction.commit();
	session.close();
}
}

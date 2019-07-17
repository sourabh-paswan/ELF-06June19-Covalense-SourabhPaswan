package com.covalense.assessment.one.curd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.assessment.dto.CustomersBean;

import lombok.extern.java.Log;
@Log
public class ReadCustomers {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		CustomersBean bean = session.get(CustomersBean.class, 102);
		log.info(""+bean.getId());
		log.info(""+bean.getFirstName());
		log.info(""+bean.getLastName());
		log.info(""+bean.getContactNumber());
		log.info(""+bean.getAddress());
		log.info(""+bean.getCity());
		log.info(""+bean.getState());
		log.info(""+bean.getCountry());

		session.close();
	}
}

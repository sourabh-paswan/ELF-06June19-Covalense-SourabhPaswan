package com.covalense.assessment.one.curd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.assessment.dto.CustomersBean;

public class DeleteCutomers {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		CustomersBean bean = session.get(CustomersBean.class, 102);
		
		Transaction transaction = session.beginTransaction();
		session.delete(bean);
		transaction.commit();
		session.close();
	}
}

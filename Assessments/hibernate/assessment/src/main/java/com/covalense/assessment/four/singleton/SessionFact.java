package com.covalense.assessment.four.singleton;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


//objective: Write a Session Factory singleton class to get session object.

public class SessionFact {

	private SessionFactory sessionFactory;

	private SessionFact() {
	};

	private SessionFactory buildSessionFactory() {
		return new Configuration().configure().buildSessionFactory();
	}

	public SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();

		}
		return sessionFactory;
	}

	public Session openSession() {
		return getSessionFactory().openSession();
	}

}

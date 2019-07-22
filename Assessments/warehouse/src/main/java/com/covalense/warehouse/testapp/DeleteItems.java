package com.covalense.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.warehouse.beans.ItemBean;
import com.covalense.warehouse.config.ItemsConfig;

public class DeleteItems {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ItemsConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		ItemBean items = session.get(ItemBean.class, 101);
		Transaction transaction = session.beginTransaction();
		session.delete(items);
		transaction.commit();
	}

}

package com.covalense.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.warehouse.beans.ItemBean;
import com.covalense.warehouse.config.ItemsConfig;

public class UpdateItems {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ItemsConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		Session session = factory.openSession();

		ItemBean itemBean = new ItemBean();
		itemBean.setId(12);
		itemBean.setName("iPhone");
		itemBean.setCost(778);
		

		Transaction txn = null;
		txn = session.beginTransaction();
		session.update(itemBean);

		txn.commit();

		session.close();

	}
}

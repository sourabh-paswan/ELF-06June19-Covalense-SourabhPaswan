package com.covalense.warehouse.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.warehouse.beans.ItemBean;
import com.covalense.warehouse.config.ItemsConfig;
import com.covalense.warehouse.util.HibernateUtil;

public class AddTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Session session = context.getBean("hibernateUtil", HibernateUtil.class).openSession();

		ItemBean itemBean = new ItemBean();
		itemBean.setId(1787);
		itemBean.setName("iPhone");
		itemBean.setCost(787878);
		itemBean.setDescription("apple");
		itemBean.setQuantity(45);

		Transaction txn = null;
		txn = session.beginTransaction();
		session.saveOrUpdate(itemBean);

		txn.commit();

		session.close();

	}
}

package com.covalense.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

public class UpdateRecords {

	public static void main(String[] args) {
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		EmployeeInfoBean ebean = session.get(EmployeeInfoBean.class, 6);
		ebean.setAge(9);
		ebean.setEmail("guriyanew@gmail.com");
		
//		EmployeeOtherInfoBean eOtherBean = session.get(EmployeeOtherInfoBean.class, 133);
//		eOtherBean.setPan("995454454");
//		eOtherBean.setMarried(false);
		
		Transaction transaction = session.beginTransaction();
		session.update(ebean);
//		session.update(eOtherBean);
		transaction.commit();
		session.close();
		
	}

}

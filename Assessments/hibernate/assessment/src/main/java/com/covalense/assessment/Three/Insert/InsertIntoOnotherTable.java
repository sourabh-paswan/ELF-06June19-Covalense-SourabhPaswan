package com.covalense.assessment.Three.Insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.covalense.assessment.dto.ProductsBean;

import lombok.extern.java.Log;
@Log
public class InsertIntoOnotherTable {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "insert into StudentBean(rollNum, firstName, lastName) select rollNum,name,age from StudentInfoBean";
		
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			int result = query.executeUpdate();
			log.info("inserts--->" + result);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}
	}

}

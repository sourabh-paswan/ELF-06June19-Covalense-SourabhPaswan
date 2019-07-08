package com.covalense.hibernateapp.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class UpdateRecordDynamic {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "update from EmployeeInfoBean set NAME=:ename where NAME = :enameAfter";
		//String hql = "update from EmployeeInfoBean set name='"+args[0]+"' where NAME = '"+args[1]+"'";
		Query query = session.createQuery(hql);
		query.setParameter("ename",args[0]);
		query.setParameter("enameAfter",args[1]);
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("updates--->" + result);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}

	}

}

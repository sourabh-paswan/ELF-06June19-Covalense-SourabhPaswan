package com.covalense.hibernateapp.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ReadDemoTwo {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String hql = "select name from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		List<String> ename = query.list();

		for (String empname : ename) {
			log.info("NAME is  " + empname);

		}
		session.close();
	}

}

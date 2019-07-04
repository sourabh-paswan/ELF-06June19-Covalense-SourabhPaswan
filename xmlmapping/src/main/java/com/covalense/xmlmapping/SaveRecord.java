package com.covalense.xmlmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.xmlmapping.dto.DepartmentInfoBean;

public class SaveRecord {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		DepartmentInfoBean empInfo = new DepartmentInfoBean();
		empInfo.setDeptId(454);
		empInfo.setDeptName("admin");
		
		
		Transaction transaction= session.beginTransaction();
		session.save(empInfo);
		transaction.commit();
		session.close();
		
	}

}

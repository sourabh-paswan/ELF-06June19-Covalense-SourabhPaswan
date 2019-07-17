package com.covalense.assessment.five.Students;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.covalense.assessment.dto.CustomersBean;
import com.covalense.assessment.dto.StudentBean;

import lombok.extern.java.Log;

//objective: Create an Entity with following details and write a logic to display firstName and totalMarks for all student.
@Log
public class DisplayStudents {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		StudentBean bean = session.get(StudentBean.class, 102);
		String hql = "select from ProdutsBean where price=100";
		Query query = session.createQuery(hql);
		int result = query.executeUpdate();
		log.info(""+result);
		
		log.info("roll no "+bean.getRollNum());
		log.info("roll no "+bean.getFirstName());
		log.info("roll no "+bean.getLastName());
		log.info("roll no "+bean.getSubject());
		log.info("roll no "+bean.getTotalMarks());
		
		session.close();
		
	}
}

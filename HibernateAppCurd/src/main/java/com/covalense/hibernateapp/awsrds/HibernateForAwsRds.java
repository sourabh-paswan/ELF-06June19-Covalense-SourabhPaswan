package com.covalense.hibernateapp.awsrds;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;

import lombok.extern.java.Log;

@Log
public class HibernateForAwsRds {
	public static void main(String[] args) throws ParseException {

		Transaction transaction = null;
		Session session = null;

		EmployeeInfoBean empInfo = new EmployeeInfoBean();
		
		
		empInfo.setId(133);
		empInfo.setName("sourabh");
		empInfo.setAge(25);
		empInfo.setGender("male");
		empInfo.setSalary(15000);
		empInfo.setPhone(981083690);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date = format.parse("2017-12-13");
		Date dob = format.parse("1994-05-04");
		empInfo.setJoiningDate(date);
		empInfo.setAccountNo(789789979);
		empInfo.setEmail("yfyfjyf@hkjj.com");
		empInfo.setDesignation("soft engg");
		empInfo.setDob(dob);
		empInfo.setDepartmentId(455);
		empInfo.setManagerId(789797);

		Configuration configuration = new Configuration();
		configuration.configure("com/covalense/hibernateapp/awsrds/hibernate.awsrds.cfg.xml");
		configuration.addAnnotatedClass(EmployeeInfoBean.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(empInfo);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}

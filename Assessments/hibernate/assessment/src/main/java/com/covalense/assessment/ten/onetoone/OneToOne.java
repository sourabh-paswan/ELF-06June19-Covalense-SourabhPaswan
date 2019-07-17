package com.covalense.assessment.ten.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.assessment.dto.StudentInfoBean;
import com.covalense.assessment.dto.StudentOtherinfoBean;

//objective:Establish a relationship between following Entities, Using Hibernate Annotations (One-To-One).

public class OneToOne {
public static void main(String[] args) {
	Configuration configuration = new Configuration();
	configuration.configure();
	
	SessionFactory factory = configuration.buildSessionFactory();
	Session session = factory.openSession();
	
	 
	
	StudentInfoBean studentInfoBean = new StudentInfoBean();
	int id = 102;
	studentInfoBean.setRollNum(id);
	studentInfoBean.setName("ramu");
	studentInfoBean.setAge(45);
	studentInfoBean.setGender("male");
	studentInfoBean.setMobileNo(7878788878L);
	studentInfoBean.setEmailId("ramu@gmail.com");
	
	StudentOtherinfoBean studentOtherinfoBean = new StudentOtherinfoBean();
	studentOtherinfoBean.setRollNum(id);
	studentOtherinfoBean.setFatherName("kripa");
	studentOtherinfoBean.setMotherName("ramananda");
	studentOtherinfoBean.setReligion("muslim");
	studentOtherinfoBean.setNationality("indian");
	
	studentInfoBean.setStudentOtherinfoBean(studentOtherinfoBean);
	
	Transaction transaction = session.beginTransaction();
	session.save(studentInfoBean);
	transaction.commit();
	session.close();
	
}
}

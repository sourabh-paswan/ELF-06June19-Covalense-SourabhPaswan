package com.covalense.designpattern.dao;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.covalense.designpattern.beans.EmployeeInfoBean;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {
		return null;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		//1. Load the config File
		Configuration conf = new Configuration();
		
		conf.configure();
//		conf.configure();
//		conf.configure();
//		conf.configure();
		conf.addAnnotatedClass(EmployeeInfoBean.class);
		
		//2. build session factory
		SessionFactory factory = conf.buildSessionFactory();
		
		//3.Open Session
		Session session = factory.openSession();
		
		//4. interact with DB via session
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		
		//5. Close session
		session.close();
		
		return bean;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return null;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}
}

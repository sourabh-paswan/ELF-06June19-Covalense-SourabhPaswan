package com.covalense.hibernateapp.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.manytomany.TrainingInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeEducationInfoBean;
import com.covalense.hibernateapp.manytoone.ExperienceInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;
import com.covalense.hibernateapp.onetoone.EmployeeOtherInfoBean;

public class HiberImpl {

	private Configuration configuration = new Configuration();

	private SessionFactory factory = configuration.configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();

	public void createEmployee(EmployeeInfoBean infoBean) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(infoBean);
		transaction.commit();
		session.close();

	}

	public EmployeeInfoBean getEmployeeInfoBean(int id) {
		Session session = factory.openSession();
		EmployeeInfoBean bean = session.get(EmployeeInfoBean.class, id);
		session.close();
		return bean;

	}

	public void createEmployee(EmployeeInfoBean infoBean, EmployeeOtherInfoBean otherInfoBean,
			List<EmployeeAddressInfoBean> addressInfoBean, List<EmployeeEducationInfoBean> employeeEducationInfoBean,
			List<ExperienceInfoBean> experienceInfoBeans) {

		session.save(infoBean);
		session.save(otherInfoBean);

		for (EmployeeAddressInfoBean employeeAddressInfoBean : addressInfoBean) {
			session.save(employeeAddressInfoBean);
		}

		for (EmployeeEducationInfoBean educationInfoBean2 : employeeEducationInfoBean) {
			session.save(educationInfoBean2);
		}

		for (ExperienceInfoBean bean : experienceInfoBeans) {
			session.save(bean);
		}

		transaction.commit();
		session.close();

	}

	public void createTraining(List<TrainingInfoBean> trainingInfoBean) {
		for (TrainingInfoBean bean : trainingInfoBean) {
			session.save(bean);
		}
	}
	
	public void createTraining(TrainingInfoBean trainingInfoBean) {
			session.save(trainingInfoBean);
	}
}

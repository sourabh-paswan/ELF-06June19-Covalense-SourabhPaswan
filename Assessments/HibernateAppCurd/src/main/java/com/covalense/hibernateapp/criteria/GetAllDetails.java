package com.covalense.hibernateapp.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetAllDetails {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		List<EmployeeInfoBean> emp = criteria.list();
		for (EmployeeInfoBean employeeInfoBean : emp) {
			log.info("Id " + employeeInfoBean.getId());
			log.info("NAME " + employeeInfoBean.getName());
			log.info("AGE " + employeeInfoBean.getAge());
			log.info("GENDER " + employeeInfoBean.getGender());
			log.info("SALARY " + employeeInfoBean.getSalary());
			log.info("PHONE " + employeeInfoBean.getPhone());
			log.info("JOINING_DATE " + employeeInfoBean.getJoiningDate());
			log.info("AC_NO " + employeeInfoBean.getAccountNo());
			log.info("EMAIL " + employeeInfoBean.getEmail());
			log.info("DEGIGNATION " + employeeInfoBean.getDesignation());
			log.info("DOB " + employeeInfoBean.getDob());
			log.info("DEPT_ID " + employeeInfoBean.getDepartmentId());
			log.info("MANAGER_ID " + employeeInfoBean.getManagerId());
		}

	}

}

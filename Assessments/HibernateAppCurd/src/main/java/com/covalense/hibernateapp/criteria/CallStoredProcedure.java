package com.covalense.hibernateapp.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class CallStoredProcedure {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		StoredProcedureQuery query = session.createStoredProcedureCall("selectemployee",EmployeeInfoBean.class);
		List<EmployeeInfoBean> employee = query.getResultList();
		
		for(EmployeeInfoBean Emp:employee) {
			log.info("results "+Emp.getId()+" results "+Emp.getName());
		}
	}

}

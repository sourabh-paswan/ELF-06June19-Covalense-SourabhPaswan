package com.covalense.hibernateapp.criteria;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.covalense.hibernateapp.dto.EmployeeInfoBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetDetailsWithProjection {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfoBean.class);
		Projection proName = Projections.property("name");
		Projection proId = Projections.property("id");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(proName);
		projectionList.add(proId);

		criteria.setProjection(projectionList);

		List<Object[]> Ename = criteria.list();

		for (Object[] Emp : Ename) {
			log.info("name is " + Emp[0] + " id is " + Emp[1]);
		}
	}
}

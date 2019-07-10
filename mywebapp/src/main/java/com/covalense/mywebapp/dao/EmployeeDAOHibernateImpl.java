package com.covalense.mywebapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.mywebapp.beans.EmployeeInfoBean;
import com.covalense.mywebapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Override
	public List<EmployeeInfoBean> getAllEmployeeInfo() {
		Session session = HibernateUtil.openSession();
		String hql = "from EmployeeInfoBean";
		Query query = session.createQuery(hql);
		ArrayList<EmployeeInfoBean> employeeInfoBeans = (ArrayList<EmployeeInfoBean>) query.list();
		return employeeInfoBeans;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(int id) {
		EmployeeInfoBean bean;
		try(Session session = HibernateUtil.openSession();) {
			
			bean = session.get(EmployeeInfoBean.class, id);
		} 
		
		return bean;
	}

	@Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try (Session session = HibernateUtil.openSession();) {

			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {

			log.severe(Arrays.toString(e.getStackTrace()));
			if (txn != null) {
				txn.rollback();
			}
			return false;
		}
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(id);

		try (Session session = HibernateUtil.openSession();) {

			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			log.severe(Arrays.toString(e.getStackTrace()));
			if (txn != null) {
				txn.rollback();
			}
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}
}

/**
 * 
 */
package com.covalense.emp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.covalense.emp.dto.EmployeeInfoBean;
import com.covalense.emp.util.HibernateUtil;

import lombok.extern.java.Log;

/**
 * @author Administrator
 *
 */

@Log
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	// @Override
	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException nfe) {
			log.severe("Exception occured while trying to convert parameter id to Integer. id = " + id);
			log.severe(nfe.getMessage());
			return null;
		}
	}

	// @Override
	public EmployeeInfoBean getEmployeeInfo(int id) {

		Session session = HibernateUtil.openSession();
		EmployeeInfoBean infoBean = session.get(EmployeeInfoBean.class, id);
		session.close();

		return infoBean;
	}

	// @Override
	public EmployeeInfoBean readmployeeInfo(String id) {
		return getEmployeeInfo(id);
	}

	// @Override
	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo(String id) {
//		Session session = HibernateUtil.getSession();
//		CriteriaBuilder cb = session.getCriteriaBuilder();
//		CriteriaQuery<EmployeeInfoBean> cr = cb.createQuery(EmployeeInfoBean.class);
//
//		Root<EmployeeInfoBean> root = cr.from(EmployeeInfoBean.class);
//		cr.select(root);
//		 
//		Query<EmployeeInfoBean> query = session.createQuery(cr);
//		cr.select(root).where(cb.like(root.get("id"), id+"%"));
//		List<EmployeeInfoBean> results = query.getResultList();
//		session.close();
//		return new ArrayList<EmployeeInfoBean>(results);
		String hql1 = " From EmployeeInfoBean where str(id) like '" + id + "%'";
		Session session = HibernateUtil.openSession();
		Query<EmployeeInfoBean> query = session.createQuery(hql1);
		List<EmployeeInfoBean> list = query.list();
		return new ArrayList<EmployeeInfoBean>(list);

	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try {
			Session session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	// @Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	// @Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	// @Override
	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

	// @Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(id);
		try {
			Session session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

}

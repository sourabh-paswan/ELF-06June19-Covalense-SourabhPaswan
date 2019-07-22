//package com.covalense.emp.onetoone;
//
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import com.covalense.emp.dto.EmployeeInfoBean;
//import com.covalense.emp.util.HibernateUtil;
//import com.covalense.emp.util.PrepareDataUtil;
//
//import lombok.extern.java.Log;
//
//@Log
//public class HibernateOnetoOnetest {
//	public static void main(String[] args) {
//
//		// prepare the data
//		int id = 67;
//		EmployeeInfoBean data = PrepareDataUtil.prepareData(id);
//		save(data);
//
//	}
//
//	// save
//	private static void save(EmployeeInfoBean data) {
//		Transaction txn = null;
//		try (Session session = HibernateUtil.openSession()) {
//			txn = session.beginTransaction();
//			session.save(data);
//			txn.commit();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		//	log.severe(Arrays.toString(ex.getStackTrace()));
//			if (txn != null) {
//				txn.rollback();
//			}
//
//		}
//	}
//}

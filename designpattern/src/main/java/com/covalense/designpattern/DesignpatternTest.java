package com.covalense.designpattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.covalense.designpattern.beans.EmployeeInfoBean;
import com.covalense.designpattern.dao.EmployeeDAO;
import com.covalense.designpattern.dao.EmployeeDAOFactory;
import com.covalense.designpattern.dao.EmployeeDAOHibernateImpl;
import com.covalense.designpattern.dao.EmployeeDAOJDBCImpl;

import lombok.extern.java.Log;

/**
 * testing the database access from table
 *
 */
@Log
public class DesignpatternTest {
	public static void main(String[] args) throws ParseException {
		EmployeeDAO dao = EmployeeDAOFactory.getInstance();
		printInfo(dao.getEmployeeInfo(1));
		//printInfo(dao.getEmployeeInfo(2));
//		ArrayList<EmployeeInfoBean> beans = dao.getAllEmployeeInfo();
//		for (EmployeeInfoBean bean : beans) {
//			printInfo(bean);
//		}
		
		
		//create an employee info
//		EmployeeInfoBean empInfo = new EmployeeInfoBean();
//		empInfo.setId(134);
//		empInfo.setName("sourabh");
//		empInfo.setAge(25);
//		empInfo.setGender("male");
//		empInfo.setSalary(15000);
//		empInfo.setPhone(981083690);
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
//		Date date = format.parse("2017-12-13");
//		Date dob = format.parse("1994-05-04");
//		empInfo.setJoiningDate(date);
//		empInfo.setAccountNo(789789979);
//		empInfo.setEmail("yfyfjyf@hkjj.com");
//		empInfo.setDesignation("senior soft engg");
//		empInfo.setDob(dob);
//		empInfo.setDepartmentId(455);
//		empInfo.setManagerId(789797);
//		
//		log.info("inserted the employee info ? ans:  "+dao.createEmployeeInfo(empInfo));
		log.info("delete the employee info ? ans:  "+dao.deleteEmployeeInfo(133));
		
	}// end of main

	private static void printInfo(EmployeeInfoBean bean) {
		log.info("Id " + bean.getId());
		log.info("NAME " + bean.getName());
		log.info("AGE " + bean.getAge());
		log.info("GENDER " + bean.getGender());
		log.info("SALARY " + bean.getSalary());
		log.info("PHONE " + bean.getPhone());
		log.info("JOINING_DATE " + bean.getJoiningDate());
		log.info("AC_NO " + bean.getAccountNo());
		log.info("EMAIL " + bean.getEmail());
		log.info("DEGIGNATION " + bean.getDesignation());
		log.info("DOB " + bean.getDob());
		log.info("DEPT_ID " + bean.getDepartmentId());
		log.info("MANAGER_ID " + bean.getManagerId());
	}

}

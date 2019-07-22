package com.covalense.mywebapp.dao;

import java.util.List;

import com.covalense.mywebapp.beans.EmployeeInfoBean;


public interface EmployeeDAO {
	public List<EmployeeInfoBean> getAllEmployeeInfo();

	EmployeeInfoBean getEmployeeInfo(String id);

	EmployeeInfoBean getEmployeeInfo(int id);

	boolean createEmployeeInfo(EmployeeInfoBean bean);

	boolean updateEmployeeInfo(EmployeeInfoBean bean);

	boolean deleteEmployeeInfo(int id);

	boolean deleteEmployeeInfo(String id);
	
		
	
}

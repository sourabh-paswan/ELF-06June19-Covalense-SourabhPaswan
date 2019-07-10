package com.covalense.emp.dao;

import java.util.ArrayList;

import com.covalense.emp.dto.EmployeeInfoBean;

public interface EmployeeDAO {

	ArrayList<EmployeeInfoBean> getAllEmployeeInfo(String id);
	EmployeeInfoBean getEmployeeInfo(String id);
	EmployeeInfoBean getEmployeeInfo(int id);
	
	boolean createEmployeeInfo(EmployeeInfoBean bean);
	EmployeeInfoBean readmployeeInfo(String id);
	boolean updateEmployeeInfo(EmployeeInfoBean bean);
	boolean deleteEmployeeInfo(String id);
	boolean deleteEmployeeInfo(int id);

	
}
package com.covalense.mywebapp.dao;

import java.util.List;

import com.covalense.mywebapp.beans.DepartmentInfoBean;

public interface DepartmentDAO {
	public List<DepartmentInfoBean> getAllEmployeeInfo();

	DepartmentInfoBean getEmployeeInfo(String id);

	DepartmentInfoBean getEmployeeInfo(int id);

	boolean createEmployeeInfo(DepartmentInfoBean bean);

	boolean updateEmployeeInfo(DepartmentInfoBean bean);

	boolean deleteEmployeeInfo(int id);

	boolean deleteEmployeeInfo(String id);
}

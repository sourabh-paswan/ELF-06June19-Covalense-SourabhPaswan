package com.covalense.mywebapp.dao;

import java.util.List;

import com.covalense.mywebapp.beans.DepartmentInfoBean;

public interface DepartmentDAO {
	public List<DepartmentInfoBean> getAllEmployeeInfo();

	DepartmentInfoBean getEmployeeInfo(String id);

	DepartmentInfoBean getEmployeeInfo(int id);

	boolean createDepartmentInfo(DepartmentInfoBean bean);

	boolean updateDepartmentInfo(DepartmentInfoBean bean);

	boolean deleteDepartmentInfo(int id);

	boolean deleteDepartmentInfo(String id);
}

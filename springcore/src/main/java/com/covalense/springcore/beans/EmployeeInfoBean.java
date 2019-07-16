package com.covalense.springcore.beans;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.extern.java.Log;

@Log
public class EmployeeInfoBean implements InitializingBean, DisposableBean, Serializable {
	private String name;
	private int salary;
	private DepartmentBean departmentBean;

	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void destroy() throws Exception {
		log.info("inside destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("insitialoze() method");
	}

}

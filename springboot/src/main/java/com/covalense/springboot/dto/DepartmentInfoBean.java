package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.Data;

@SuppressWarnings("serial")
// @XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "department_info")
public class DepartmentInfoBean implements Serializable {

	@Id
	@Column(name = "DEPT_ID")
	private int deptId;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Column(name = "DEPT_NAME")
	private String deptName;

}

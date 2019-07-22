package com.covalense.mywebapp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="department_info")
public class DepartmentInfoBean {
	@Id
	@Column(name="deptId")
	private int deptId;
	
	@Column(name="deptName")
	private String deptName;

}

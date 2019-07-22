package com.covalense.hibernateapp.onetoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfoBean implements Serializable {
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private EmployeeOtherInfoBean otherInfo;
	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="SALARY")
	private int salary;
	
	@Column(name="PHONE")
	private long phone;
	
	@Column(name="JOINING_DATE")
	private Date joiningDate;
	
	@Column(name="AC_NO")
	private int accountNo;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="DEGIGNATION")
	private String designation;
	
	@Column(name="DOB")
	private Date dob;
	
	@Column(name="DEPT_ID")
	private int departmentId;
	
	@Column(name="MANAGER_ID")
	private int managerId;
	
	@Column(name="password")
	private int password;
	
}

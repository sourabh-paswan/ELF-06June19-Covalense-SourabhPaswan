package com.covalense.hibernateapp.cache;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="employee_info_copy")
public class EmployeeNewInfoBean implements Serializable {
	@Id
	@Column(name="EID")
	private int id;
	
	@Column(name="ENAME")
	private String name;
	
	@Column(name="EAGE")
	private int age;
	
	@Column(name="EGENDER")
	private String gender;
	
	@Column(name="ESALARY")
	private int salary;
	
	@Column(name="EPHONE")
	private long phone;
	
	@Column(name="EJOINING_DATE")
	private Date joiningDate;
	
	@Column(name="EAC_NO")
	private int accountNo;
	
	@Column(name="EEMAIL")
	private String email;
	
	@Column(name="EDEGIGNATION")
	private String designation;
	
	@Column(name="EDOB")
	private Date dob;
	
	@Column(name="EDEPT_ID")
	private int departmentId;
	
	@Column(name="EMANAGER_ID")
	private int managerId;
	
	
}

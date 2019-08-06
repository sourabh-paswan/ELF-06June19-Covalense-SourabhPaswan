package com.covalense.hibernateapp.onetoone;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.covalense.hibernateapp.dto.DepartmentInfoBean;
import com.covalense.hibernateapp.manytomany.TrainingInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeAddressInfoBean;
import com.covalense.hibernateapp.manytoone.EmployeeEducationInfoBean;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean implements Serializable {

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfoBean employeeOtherInfoBean;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPkBean.infoBean")
	private List<EmployeeAddressInfoBean> addressInfoBean;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationPkBean.infoBean")
	private List<EmployeeEducationInfoBean> educationInfoBean;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans")
	private List<TrainingInfoBean> trainingInfoBean;
	

	

	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "AGE")
	private int age;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "SALARY")
	private int salary;

	@Column(name = "PHONE")
	private long phone;

	@Column(name = "JOINING_DATE")
	private Date joiningDate;

	@Column(name = "AC_NO")
	private int accountNo;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "DEGIGNATION")
	private String designation;

	@Column(name = "DOB")
	private Date dob;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DEPT_ID")
	private DepartmentInfoBean departmentInfoBean;

	@ManyToOne
	@JoinColumn(name = "MANAGER_ID", referencedColumnName = "ID")
	private EmployeeInfoBean managerId;

	@Column(name = "password")
	private int password;

}

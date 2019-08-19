package com.covalense.springboot.dto;

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
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

//import lombok.Data;

@SuppressWarnings("serial")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@XmlRootElement(name="EmployeeInfoBean")
@JsonRootName(value = "employee_info")
//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean implements Serializable {

	//@XmlElement(name="employeeOtherInfoBean")
	@JsonProperty(value="employeeOtherInfoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfoBean employeeOtherInfoBean;
	
	
	//@XmlElement(name="addressInfoBean")
	@JsonProperty(value="addressInfoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPkBean.infoBean")
	private List<EmployeeAddressInfoBean> addressInfoBean;
	
	//@XmlElement(name="educationInfoBean")
	@JsonProperty(value="educationInfoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationPkBean.infoBean")
	private List<EmployeeEducationInfoBean> educationInfoBean;
	
	//@XmlElement(name="experienceInfoBeans")
	@JsonProperty(value="experienceInfoBeans")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "experiencePKBean.infoBean")
	private List<ExperienceInfoBean> experienceInfoBeans;
	
	//@XmlElement(name="trainingInfoBean")
	@JsonProperty(value="trainingInfoBean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans")
	private List<TrainingInfoBean> trainingInfoBean;
	
	
	//@XmlElement(name="id")
	@Id
	@Column(name = "ID")
	private int id;

	//@XmlElement(name="name")
	@Column(name = "NAME")
	private String name;
	
	//@XmlElement(name="age")
	@Column(name = "AGE")
	private int age;
	
	//@XmlElement(name="gender")
	@Column(name = "GENDER")
	private String gender;
	
	//@XmlElement(name="salary")
	@Column(name = "SALARY")
	private int salary;
	
	//@XmlElement(name="phone")
	@Column(name = "PHONE")
	private long phone;
	
	//@XmlElement(name="joiningDate")
	@Column(name = "JOINING_DATE")
	private Date joiningDate;
	
	//@XmlElement(name="accountNo")
	@Column(name = "AC_NO")
	private int accountNo;
	
	//@XmlElement(name="email")
	@Column(name = "EMAIL")
	private String email;
	
	
	//@XmlElement(name="designation")
	@Column(name = "DEGIGNATION")
	private String designation;
	
	//@XmlElement(name="dob")
	@Column(name = "DOB")
	private Date dob;
	
	//@XmlElement(name="departmentInfoBean")
	@JsonProperty(value="departmentInfoBean")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DEPT_ID")
	private DepartmentInfoBean departmentInfoBean;
	
	//@XmlElement(name="managerId")
	@JsonProperty(value="managerId")
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "MANAGER_ID", referencedColumnName = "id")
	private EmployeeInfoBean managerId;
	
	//@XmlElement(name="password")
	@Column(name = "password")
	private int password;

	public EmployeeOtherInfoBean getEmployeeOtherInfoBean() {
		return employeeOtherInfoBean;
	}

	public void setEmployeeOtherInfoBean(EmployeeOtherInfoBean employeeOtherInfoBean) {
		this.employeeOtherInfoBean = employeeOtherInfoBean;
	}

	public List<EmployeeAddressInfoBean> getAddressInfoBean() {
		return addressInfoBean;
	}

	public void setAddressInfoBean(List<EmployeeAddressInfoBean> addressInfoBean) {
		this.addressInfoBean = addressInfoBean;
	}

	public List<EmployeeEducationInfoBean> getEducationInfoBean() {
		return educationInfoBean;
	}

	public void setEducationInfoBean(List<EmployeeEducationInfoBean> educationInfoBean) {
		this.educationInfoBean = educationInfoBean;
	}

	public List<ExperienceInfoBean> getExperienceInfoBeans() {
		return experienceInfoBeans;
	}

	public void setExperienceInfoBeans(List<ExperienceInfoBean> experienceInfoBeans) {
		this.experienceInfoBeans = experienceInfoBeans;
	}

	public List<TrainingInfoBean> getTrainingInfoBean() {
		return trainingInfoBean;
	}

	public void setTrainingInfoBean(List<TrainingInfoBean> trainingInfoBean) {
		this.trainingInfoBean = trainingInfoBean;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public DepartmentInfoBean getDepartmentInfoBean() {
		return departmentInfoBean;
	}

	public void setDepartmentInfoBean(DepartmentInfoBean departmentInfoBean) {
		this.departmentInfoBean = departmentInfoBean;
	}

	public EmployeeInfoBean getManagerId() {
		return managerId;
	}

	public void setManagerId(EmployeeInfoBean managerId) {
		this.managerId = managerId;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

}

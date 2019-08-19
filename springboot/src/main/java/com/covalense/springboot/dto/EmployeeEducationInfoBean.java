package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

//import lombok.Data;

@SuppressWarnings("serial")

@Entity
@Table(name = "employee_educational_info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeEducationInfoBean implements Serializable {
	@EmbeddedId
	private EmployeeEducationPkBean educationPkBean;
	@Column(name = "DEGREE_TYPE")
	private String degreeType;
	public EmployeeEducationPkBean getEducationPkBean() {
		return educationPkBean;
	}
	public void setEducationPkBean(EmployeeEducationPkBean educationPkBean) {
		this.educationPkBean = educationPkBean;
	}
	public String getDegreeType() {
		return degreeType;
	}
	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Column(name = "BRANCH")
	private String branch;
	@Column(name = "COLLEGE_NAME")
	private String collegename;
	@Column(name = "UNIVERSITY")
	private String university;
	@Column(name = "YOP")
	private int yop;
	@Column(name = "PERCENTAGE")
	private double percentage;
	@Column(name = "LOCATION")
	private String location;
}

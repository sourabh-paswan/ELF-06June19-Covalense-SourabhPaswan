package com.covalense.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "employee_educational_info")
@ToString
public class EmployeeEducationInfoBean implements Serializable {
	@EmbeddedId
	private EmployeeEducationPkBean educationPkBean;
	@Column(name = "DEGREE_TYPE")
	private String degreeType;
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

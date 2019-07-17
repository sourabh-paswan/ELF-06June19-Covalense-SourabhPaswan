package com.covalense.assessment.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.print.attribute.SetOfIntegerSyntax;

import lombok.Data;

@Data
@Entity
@Table(name="Student_info")
public class StudentInfoBean implements Serializable {
	@Id
	@Column(name = "rollNum")
	@OneToOne(targetEntity=StudentInfoBean.class)
	private int rollNum;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "mobileNo")
	private long mobileNo;

	@Column(name = "emailId")
	private String emailId;
	
	
	private StudentOtherinfoBean studentOtherinfoBean;



}

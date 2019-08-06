package com.covalense.hibernateapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="employee_otherinfo")
@Data
public class EmployeeOtherInfoBean implements Serializable {
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="PAN")
	private String pan;
	
	@Column(name="IS_MAIRRED")
	private boolean married;
	
	@Column(name="BLOOD_GRP")
	private String bloodGrp;
	
	@Column(name="IS_CHALANGED")
	private boolean challanged;
	
	@Column(name="EMERGENCY_NUMBER")
	private int emergencyNo;
	
	@Column(name="EMERGENCY_CONTACT_NAME")
	private String emergencyName;
	
	@Column(name="NATIONALITY")
	private String nationality;
	
	@Column(name="RELIGION")
	private String religion;
	
	@Column(name="FATHER_N")
	private String fatherName;
	
	@Column(name="MOTHER_N")
	private String motherName;
	
	@Column(name="SPOUSE_N")
	private String spouse;
	
	@Column(name="PASSPORT")
	private String passport;
	
	@Column(name="AADHAR")
	private long aadhar;

}

package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import lombok.Data;

@Entity
//@XmlAccessorType(XmlAccessType.FIELD)
@Table(name = "employee_otherinfo")
public class EmployeeOtherInfoBean implements Serializable {

	//@JsonIgnore
	@Id
	@Column(name = "other_info_id")
	@GeneratedValue
	private Integer otherInfoId;

	public Integer getOtherInfoId() {
		return otherInfoId;
	}

	public void setOtherInfoId(Integer otherInfoId) {
		this.otherInfoId = otherInfoId;
	}

	@JsonIgnore
	// @Id
	@OneToOne
	@JoinColumn(name = "ID", unique = true, nullable = false)
	private EmployeeInfoBean infoBean;

	@Column(name = "PAN")
	private String pan;

	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}

	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public String getBloodGrp() {
		return bloodGrp;
	}

	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}

	public boolean isChallanged() {
		return challanged;
	}

	public void setChallanged(boolean challanged) {
		this.challanged = challanged;
	}

	public int getEmergencyNo() {
		return emergencyNo;
	}

	public void setEmergencyNo(int emergencyNo) {
		this.emergencyNo = emergencyNo;
	}

	public String getEmergencyName() {
		return emergencyName;
	}

	public void setEmergencyName(String emergencyName) {
		this.emergencyName = emergencyName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getSpouse() {
		return spouse;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public long getAadhar() {
		return aadhar;
	}

	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}

	@Column(name = "IS_MAIRRED")
	private boolean married;

	@Column(name = "BLOOD_GRP")
	private String bloodGrp;

	@Column(name = "IS_CHALANGED")
	private boolean challanged;

	@Column(name = "EMERGENCY_NUMBER")
	private int emergencyNo;

	@Column(name = "EMERGENCY_CONTACT_NAME")
	private String emergencyName;

	@Column(name = "NATIONALITY")
	private String nationality;

	@Column(name = "RELIGION")
	private String religion;

	@Column(name = "FATHER_N")
	private String fatherName;

	@Column(name = "MOTHER_N")
	private String motherName;

	@Column(name = "SPOUSE_N")
	private String spouse;

	@Column(name = "PASSPORT")
	private String passport;

	@Column(name = "AADHAR")
	private long aadhar;

}

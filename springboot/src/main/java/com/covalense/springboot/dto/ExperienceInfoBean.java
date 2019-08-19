package com.covalense.springboot.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

//import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name = "employee_experience_info")
//@XmlAccessorType(XmlAccessType.FIELD)
public class ExperienceInfoBean implements Serializable {
	
	@EmbeddedId
	private ExperiencePKBean experiencePKBean;
	@Column(name = "DESIGNATION")
	private String designation;
	public ExperiencePKBean getExperiencePKBean() {
		return experiencePKBean;
	}
	public void setExperiencePKBean(ExperiencePKBean experiencePKBean) {
		this.experiencePKBean = experiencePKBean;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Date getLeavingDate() {
		return leavingDate;
	}
	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}
	@Column(name = "JOINING_DATE")
	private Date joiningDate;
	@Column(name = "LEAVING_DATE")
	private Date leavingDate;
}

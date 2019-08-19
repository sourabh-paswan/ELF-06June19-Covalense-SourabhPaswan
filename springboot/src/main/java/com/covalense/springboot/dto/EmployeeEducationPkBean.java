package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import lombok.Data;

@SuppressWarnings("serial")

@Embeddable
//@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeEducationPkBean implements Serializable {
	//@XmlTransient
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "ID")
	private EmployeeInfoBean infoBean;
	@Column(name = "EDUCATION_TYPE")
	private String educationType;
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public String getEducationType() {
		return educationType;
	}
	public void setEducationType(String educationType) {
		this.educationType = educationType;
	}
}

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
public class ExperiencePKBean implements Serializable {

	//@XmlTransient
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "ID")
	private EmployeeInfoBean infoBean;
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Column(name = "COMPANY_NAME")
	private String companyName;
}

package com.covalense.hibernateapp.manytoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.covalense.hibernateapp.onetoone.EmployeeInfoBean;

import lombok.Data;
import lombok.ToString;

@SuppressWarnings("serial")
@Data
@ToString
@Embeddable
public class ExperiencePKBean implements Serializable {

	@ManyToOne
	@JoinColumn(name = "ID")
	private EmployeeInfoBean infoBean;
	@Column(name = "COMPANY_NAME")
	private String companyName;
}

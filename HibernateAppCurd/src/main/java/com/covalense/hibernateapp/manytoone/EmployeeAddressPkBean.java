package com.covalense.hibernateapp.manytoone;

import java.io.Serializable;

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
public class EmployeeAddressPkBean implements Serializable {
	@ManyToOne
	@JoinColumn(name = "ID")
	private EmployeeInfoBean infoBean;
	@Column(name = "Adress_type")
	private String addressType;
}

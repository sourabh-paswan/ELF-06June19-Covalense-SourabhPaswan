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
@Table(name = "employee_address_info")
@ToString
public class EmployeeAddressInfoBean implements Serializable {

	@EmbeddedId
	private EmployeeAddressPkBean addressPkBean;
	@Column(name = "address1")
	private String addressOne;
	@Column(name = "address2")
	private String addressTwo;
	@Column(name = "landmark")
	private String landmark;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "country")
	private String country;
	@Column(name = "pincode")
	private int pincode;
}

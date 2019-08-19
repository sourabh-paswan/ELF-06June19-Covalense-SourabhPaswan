package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

//import lombok.Data;

@SuppressWarnings("serial")

@Entity
@Table(name = "employee_address_info")
//@XmlAccessorType(XmlAccessType.FIELD)
//@ToString
public class EmployeeAddressInfoBean implements Serializable {

	@EmbeddedId
	private EmployeeAddressPkBean addressPkBean;
	@Column(name = "address1")
	private String addressOne;
	@Column(name = "address2")
	private String addressTwo;
	public EmployeeAddressPkBean getAddressPkBean() {
		return addressPkBean;
	}
	public void setAddressPkBean(EmployeeAddressPkBean addressPkBean) {
		this.addressPkBean = addressPkBean;
	}
	public String getAddressOne() {
		return addressOne;
	}
	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}
	public String getAddressTwo() {
		return addressTwo;
	}
	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
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

package com.covalense.springboot.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

//import lombok.Data;

//@Data
@JsonRootName("employee-response")
public class EmployeeResponse {
	
	

	@JsonProperty("statusCode")
	private int statusCode;
	
	private String message;
	
	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<EmployeeInfoBean> getInfoBeans() {
		return infoBeans;
	}

	public void setInfoBeans(List<EmployeeInfoBean> infoBeans) {
		this.infoBeans = infoBeans;
	}

	private String description;
	
	private List<EmployeeInfoBean> infoBeans;

}

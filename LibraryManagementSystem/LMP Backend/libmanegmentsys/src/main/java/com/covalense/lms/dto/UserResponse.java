package com.covalense.lms.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@SuppressWarnings("serial")
@JsonRootName("employee-response")
public class UserResponse implements Serializable {

	@JsonProperty("statusCode")
	private int statusCode;

	private String message;

	private String description;

	private List<UsersBean> usersBeans;

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

	public List<UsersBean> getUsersBeans() {
		return usersBeans;
	}

	public void setUsersBeans(List<UsersBean> usersBeans) {
		this.usersBeans = usersBeans;
	}

	
}

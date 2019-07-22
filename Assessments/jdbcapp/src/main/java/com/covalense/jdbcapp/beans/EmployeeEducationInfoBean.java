package com.covalense.jdbcapp.beans;

import lombok.Data;

@Data
public class EmployeeEducationInfoBean {
	private int id;
	private String educationType;
	private String degreeType;
	private String branch;
	private String collegename;
	private String university;
	private int yop;
	private double percentage;
	private String location;
}

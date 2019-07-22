package com.covalense.jdbcapp.beans;

import java.util.Date;

import lombok.Data;

@Data
public class ExperienceInfoBean {
	private int id;
	private String companyName;
	private String designation;
	private Date joiningDate;
	private Date leavingDate;
}

package com.covalense.filecreationutil.bean;

import java.util.Date;

import lombok.Data;
@Data
public class EmployeeInfoBean {
	private int id;
	private String name;
	private String email;
	private long phone;
	private Date joiningdate;
	private double salary;

}//End of Class

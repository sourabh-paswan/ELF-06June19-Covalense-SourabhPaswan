package com.covalense.designpattern.builder;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class EmployeeData {
	private int id;
	private String name;
	private int age;
	private String gender;
	private int salary;
	private long phone;
	private Date joiningDate;
	private int accountNo;
	private String email;
	private String designation;
	private Date dob;
	private int departmentId;
	private int managerId;

}

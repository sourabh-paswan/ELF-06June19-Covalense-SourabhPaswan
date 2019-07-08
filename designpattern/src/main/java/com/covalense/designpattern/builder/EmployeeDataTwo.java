package com.covalense.designpattern.builder;

import java.util.Date;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class EmployeeDataTwo {
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
	
	private EmployeeDataTwo(EmployeeDataTwoBuilder builder) {
		id = builder.id;
		name = builder.name;
		age = builder.age;
		gender = builder.gender;
		salary = builder.salary;
		phone = builder.phone;
		joiningDate = builder.joiningDate;
		accountNo = builder.accountNo;
		email = builder.email;
		designation = builder.designation;
		accountNo = builder.accountNo;
		dob = builder.dob;
		departmentId = builder.departmentId;
		managerId = builder.managerId;
	}

	public static class EmployeeDataTwoBuilder {
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

		

		public EmployeeDataTwoBuilder id(int id) {
			this.id = id;
			return this;
		}

		public EmployeeDataTwoBuilder name(String name) {
			this.name = name;
			return this;
		}

		public EmployeeDataTwoBuilder age(int age) {
			this.age = age;
			return this;
		}

		public EmployeeDataTwoBuilder gender(String gender) {
			this.gender = gender;
			return this;
		}

		public EmployeeDataTwoBuilder salary(int salary) {
			this.salary = salary;
			return this;
		}

		public EmployeeDataTwoBuilder phone(long phone) {
			this.phone = phone;
			return this;
		}

		public EmployeeDataTwoBuilder joiningDate(Date joiningDate) {
			this.joiningDate = joiningDate;
			return this;
		}

		public EmployeeDataTwoBuilder accountNo(int accountNo) {
			this.accountNo = accountNo;
			return this;
		}

		public EmployeeDataTwoBuilder email(String email) {
			this.email = email;
			return this;
		}

		public EmployeeDataTwoBuilder designation(String designation) {
			this.designation = designation;
			return this;
		}

		public EmployeeDataTwoBuilder dob(Date dob) {
			this.dob = dob;
			return this;
		}

		public EmployeeDataTwoBuilder departmentId(int departmentId) {
			this.departmentId = departmentId;
			return this;
		}

		public EmployeeDataTwoBuilder managerId(int managerId) {
			this.managerId = managerId;
			return this;
		}

		public EmployeeDataTwo build() {
			return new EmployeeDataTwo(this);
		}

	}
}

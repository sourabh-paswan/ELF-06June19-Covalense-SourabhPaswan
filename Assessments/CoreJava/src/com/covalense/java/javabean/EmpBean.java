package com.covalense.java.javabean;
import java.util.Date;

public class EmpBean {
	
		private int id;
		private String name;
		private String department;
		
		public EmpBean(int id, String name, String department, int salary, int age, String gender, Date joinigDate) {
			super();
			this.id = id;
			this.name = name;
			this.department = department;
			this.salary = salary;
			this.age = age;
			this.gender = gender;
			this.joinigDate = joinigDate;
		}
		
		public EmpBean() {}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Date getJoinigDate() {
			return joinigDate;
		}
		@Override
		public String toString() {
			return "EmpBean [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
					+ ", age=" + age + ", gender=" + gender + ", joinigDate=" + joinigDate + "]";
		}
		public void setJoinigDate(Date joinigDate) {
			this.joinigDate = joinigDate;
		}
		private int salary;
		private int age;
		private String gender;
		private Date joinigDate;
		

}

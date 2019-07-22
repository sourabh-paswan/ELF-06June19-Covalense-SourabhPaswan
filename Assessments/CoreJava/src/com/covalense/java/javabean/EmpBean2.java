package com.covalense.java.javabean;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;
@Data
@AllArgsConstructor
public class EmpBean2 {
	
		private int id;
		private String name;
		private String department;
		private int salary;
		private int age;
		private String gender;
		private Date joinigDate;
		 

}

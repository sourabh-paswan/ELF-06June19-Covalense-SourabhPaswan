package com.covalense.java.assignmentfive.two;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class StuTest {
	public static void main(String[] args) {
		Student e1= new Student();
		e1.setName("ramu");
		e1.setId(1);
		e1.setSalary(10000);
		
		Student e2= new Student();
		e2.setName("ramu");
		e2.setId(1);
		e2.setSalary(10000);
		
		Student e3= new Student();
		e3.setName("ramu");
		e3.setId(1);
		e3.setSalary(10000);
		
		Student e4= new Student();
		e4.setName("ramu");
		e4.setId(1);
		e4.setSalary(10000);
		
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		
		for(Student er:al) {
			
			log.info("details are "+er);
		}
		
	}

}

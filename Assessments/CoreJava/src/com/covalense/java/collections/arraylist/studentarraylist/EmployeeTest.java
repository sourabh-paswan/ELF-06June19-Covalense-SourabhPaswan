package com.covalense.java.collections.arraylist.studentarraylist;

import java.util.TreeSet;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.name="ramu";
		e1.id=12;
		e1.salary=78888.9;
		
		Employee e2=new Employee();
		e2.name="ramu";
		e2.id=12;
		e2.salary=78888.9;
		
		Employee e3=new Employee();
		e3.name="ramu";
		e3.id=12;
		e3.salary=78888.9;
		
		Employee e4=new Employee();
		e4.name="ramu";
		e4.id=12;
		e4.salary=78888.9;
		
		
		EmployeeById eid= new EmployeeById();
		TreeSet<Employee> t= new TreeSet<Employee>(eid);
		t.add(e1);
		t.add(e2);
		t.add(e2);
		t.add(e4);
		
		
		for(Employee e:t)
		{
			
			System.out.println("name is "+e.name);
			System.out.println("id is "+e.id);
			System.out.println("salary is "+e.salary);
		}
		
	}

}

package com.covalense.java.lamdaimplimenting;

import java.util.Comparator;
import java.util.TreeSet;

import com.covalense.java.immutable.Emp;

public class TestEmp {
	public static void main(String[] args) {
		Employee e1= new Employee();
		
		EmpById myid = new EmpById();
		
		
		Comparator<Employee> c= (e,f)->{
			if(e.id<f.id) {
				return 1;
			}
			else if(e.id>f.id) {
				return -1;
			}
			else return 0;
		};
		
		
		Comparator<Employee> c2=(e,f)->e.name.compareTo(f.name); 
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(e1);
		
		for(Employee e : ts ) {
			System.out.println(ts);
		}
	}

}

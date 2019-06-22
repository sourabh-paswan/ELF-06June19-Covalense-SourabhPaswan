package com.covalense.java.collections.arraylist.studentarraylist;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	String name;
	int id;
	double salary;
	@Override
	/*public int compare(Employee e1,Employee e2) {
		if (e1.id>e2.id)
		{
			return 1;
		}
		else if (e1.id<e2.id)
		{
			return 1;
		}
		else
		{
			return 0;
		}*/
	
	public int compare(Employee e1,Employee e2) {
		if (e1.salary>e2.salary)
		{
			return 1;
		}
		else if (e1.salary<e2.salary)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
		
		
	}
	

}

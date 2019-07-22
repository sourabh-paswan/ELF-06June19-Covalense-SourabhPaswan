package com.covalense.java.collections.arraylist.studentarraylist;

import java.util.Comparator;

public class EmpByName implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		return e1.name.compareTo(e2.name);
		
	}

}

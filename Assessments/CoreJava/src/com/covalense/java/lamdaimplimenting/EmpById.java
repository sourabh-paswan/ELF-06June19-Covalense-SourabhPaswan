package com.covalense.java.lamdaimplimenting;

import java.util.Comparator;

public class EmpById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.id > o2.id) {
			return 1;
		}
		else if(o1.id<o1.id) {
			return -1;
		}
		else return 0;
	}

}

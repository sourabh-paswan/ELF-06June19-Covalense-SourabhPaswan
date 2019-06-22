package com.covalense.java.constructor;

public class Salary {
	int name;
	String id;
	double salary;

	Salary(int name, String id, double salary)
	{
	this.name=name;
	this.id=id;
	this.salary=salary;
	}

	void Display()
	{
		System.out.println("rollno is "+name);
		System.out.println("name is "+id);
		System.out.println("percentage is "+salary);
	}

}

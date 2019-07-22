package com.covalense.java.basics;

public class Student {

	public static void main(String[] args) {
		Sdata s= new Sdata();
		s.rollno=29;
		s.name="suresh";
		s.branch="cs";
		s.study();

	}

}

class Sdata
{
int rollno;
String name;
String branch;
void study()
{
System.out.println("stud");	
}

}

package com.covalense.java.supplier;

import java.util.function.Consumer;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student(23, 67, 67, "ramu");
		 Consumer<Student> c = s->{
			 double avg =(s1.m1+s1.m2+s1.m3)/3.0;
			 System.out.println(s1.name+" avearge is "+avg);
		 };
		 c.accept(s1);
	}

}

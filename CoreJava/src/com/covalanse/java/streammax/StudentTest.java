package com.covalanse.java.streammax;

import java.util.Comparator;

public class StudentTest {
	static Comparator<Student> c = (i,j)->{
		Double p1 = i.getPercentage();
		Double p2 = j.getPercentage();
		return p1.compareTo(p2);
	};
	
	
	
	public static void main(String[] args) {
		
	}
	
	

}

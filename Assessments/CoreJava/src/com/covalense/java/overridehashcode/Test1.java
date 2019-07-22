package com.covalense.java.overridehashcode;

public class Test1 {
public static void main(String[] args) {
	Student s= new Student("na",24,6.76);
	Student p= new Student("na",24,8.76);
	
	System.out.println(s);
	System.out.println(s.equals(p));
			
}
}

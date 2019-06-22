package com.covalense.java.collections.arraylist;

import java.util.ArrayList;

public class TestH {
	public static void main(String[] args) {
		ArrayList<Double> al= new ArrayList<Double>();
		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);
		
		
		
		System.out.println("Before------>"+al);
		
		boolean ref=al.remove(9.2);//if prsnt then remove
		System.out.println("Result is  "+ref);
		
		System.out.println("After------>"+al);
		
	}

}

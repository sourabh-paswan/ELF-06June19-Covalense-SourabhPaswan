package com.covalense.java.collections.arraylist;

import java.util.ArrayList;

public class GenricArraylist {
	public static void main(String[] args) {
		ArrayList<Double> al= new ArrayList<Double>();
		al.add(30.4);
		al.add(80.4);
		al.add(80.4);
		al.add(90.4);
		
		for(int i=0;i<al.size();i++)
		{
			Double r=al.get(i);
			System.out.println(r);
		}
		
	}

}

package com.covalense.java.collections.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class GenricListItrator {
	public static void main(String[] args) {
		ArrayList<Double> al= new ArrayList<Double>();
		al.add(67.7);
		al.add(56.8);
		al.add(98.6);
		al.add(09.8);
		al.add(0989.8);
		
		ListIterator<Double> it= al.listIterator();
		while(it.hasNext())
		{
		Double r=it.next();
		System.out.println(r);
		}
		System.out.println("back");
		while(it.hasPrevious())
		{
		Double r= it.previous();
		System.out.println(r);
		}
		System.out.println(al);
	}

}

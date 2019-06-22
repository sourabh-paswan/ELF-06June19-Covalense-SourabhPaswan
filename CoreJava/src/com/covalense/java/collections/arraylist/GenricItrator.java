package com.covalense.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class GenricItrator {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("ramu");
		al.add("you");
		al.add("are");
		al.add("smart");
		al.add("enough");
		
		Iterator<String> it= al.iterator();
		while(it.hasNext())
		{
		String r=it.next();
		System.out.println(r);
		}
		//System.out.println("back");
//		while(it.hasPrevious<>())
//		{
//		String r=it.previous();
//		System.out.println(r);
//		}
	}

}

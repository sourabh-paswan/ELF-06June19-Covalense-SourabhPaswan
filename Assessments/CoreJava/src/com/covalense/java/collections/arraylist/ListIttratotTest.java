package com.covalense.java.collections.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIttratotTest {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(97);
		al.add("yeus");
		al.add('r');
		al.add("9898k98");
		al.add('r');
		
		ListIterator it= al.listIterator();
		while(it.hasNext())
		{
		Object r=it.next();
		System.out.println(r);
		}
		System.out.println("back");
		while(it.hasPrevious())
		{
		Object r=it.previous();
		System.out.println(r);
		}
	}

}

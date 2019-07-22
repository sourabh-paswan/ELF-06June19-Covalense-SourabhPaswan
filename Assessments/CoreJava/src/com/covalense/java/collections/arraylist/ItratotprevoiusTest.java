package com.covalense.java.collections.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ItratotprevoiusTest {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(97);
		al.add("yeus");
		al.add('r');
		al.add("9898k98");
		al.add('r');
		
		//ListIterator it= al.listIterator(4);
		//to backward from 4th index
		ListIterator it= al.listIterator(al.size());
		
		System.out.println("<--------------------backward");
		while(it.hasPrevious())
		{
		Object r=it.previous();
		System.out.println(r);
		}
	}

}

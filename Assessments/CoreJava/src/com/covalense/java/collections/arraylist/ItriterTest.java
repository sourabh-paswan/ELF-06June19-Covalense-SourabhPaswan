package com.covalense.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
  // Use of itrator Hashnext
  //its check the next element then move

public class ItriterTest {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(97);
		al.add("yeus");
		al.add('r');
		al.add("989898");
		al.add('r');
		
		Iterator it= al.iterator();
		while(it.hasNext())
		{
		Object r=it.next();
		System.out.println(r);
		}
	}

}

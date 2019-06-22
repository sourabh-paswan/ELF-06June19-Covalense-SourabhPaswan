package com.covalense.java.collections.arraylist;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(97);
		al.add("yes");
		al.add('r');
		al.add("989898");
		al.add('r');
		
		
		for(int i= 0; i<al.size();i++)
		{
			Object r= al.get(i);
			System.out.println(r);
		}
	}

}

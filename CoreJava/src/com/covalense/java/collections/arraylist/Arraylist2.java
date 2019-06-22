package com.covalense.java.collections.arraylist;

import java.util.ArrayList;

public class Arraylist2 {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(97);
		al.add("yes");
		al.add('r');
		al.add("989898");
		al.add('r');
		
		for(Object o:al)
		{
			System.out.println(o);
		}
	}

}

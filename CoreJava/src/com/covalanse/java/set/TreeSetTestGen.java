package com.covalanse.java.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTestGen {
	public static void main(String[] args) {
		TreeSet<Integer> h= new TreeSet<Integer>();
		h.add(45);
		h.add(9);
		h.add(76);
		h.add(3);
		for (Integer r : h) {
			System.out.println(r);}
			Iterator<Integer> it= h.iterator();
			while(it.hasNext())
			{
				Integer i=it.next();
				System.out.println(i);
			}
		}
	}



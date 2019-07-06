package com.covalense.java.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetNonGen {
	public static void main(String[] args) {
		TreeSet h = new TreeSet();
		h.add(45);
		h.add(98);
		//h.add(54.8);
		h.add(30);
		for (Object r : h) {
			System.out.println(r);
		}
		Iterator it= h.iterator();
		while(it.hasNext())
		{
			Object i=it.next();
			System.out.println(i);
		}
	}

}

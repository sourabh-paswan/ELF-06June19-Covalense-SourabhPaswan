package com.covalense.java.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListGen {
	public static void main(String[] args) {
		LinkedList<Double> l1 = new LinkedList<Double>();
		l1.add(89.25);
		l1.add(78.2);
		l1.add(78.3);
		l1.add(90.2);

		for (Double r : l1) {
			System.out.println(r);
		}

		Iterator<Double> it = l1.iterator();
		while (it.hasNext()) {
			Double r = it.next();
			System.out.println(r);
		}
		
		ListIterator<Double> lit=l1.listIterator();
		while(lit.hasNext()) {
			Double r=lit.next();
			System.out.println(r);
		}
		while(lit.hasPrevious()) {
			Double r=lit.previous();
			System.out.println(r);
		}

	}


}

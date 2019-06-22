package com.covalanse.java.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlistTest {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add("ramu");
		l1.add(78);
		l1.add("riya");
		l1.add(90.2);

		for (Object r : l1) {
			System.out.println(r);
		}

		Iterator it = l1.iterator();
		while (it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
		}
		
		ListIterator lit=l1.listIterator();
		while(lit.hasNext()) {
			Object r=lit.next();
			System.out.println(r);
		}
		while(lit.hasPrevious()) {
			Object r=lit.previous();
			System.out.println(r);
		}

	}

}

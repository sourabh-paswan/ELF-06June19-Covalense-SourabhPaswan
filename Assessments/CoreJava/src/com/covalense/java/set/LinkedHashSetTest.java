package com.covalense.java.set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		LinkedHashSet h = new LinkedHashSet();
		h.add(45);
		h.add("you");
		h.add('w');
		h.add(30.6);
		for (Object r : h) {
			System.out.println(r);
		}
	}

}

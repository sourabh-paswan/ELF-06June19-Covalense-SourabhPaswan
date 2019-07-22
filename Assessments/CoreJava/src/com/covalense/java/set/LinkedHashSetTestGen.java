package com.covalense.java.set;

import java.util.LinkedHashSet;

public class LinkedHashSetTestGen {
	public static void main(String[] args) {
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		h.add(45);
		h.add(64);
		h.add(87);
		h.add(989);
		for (Integer r : h) {
			System.out.println(r);
		}

	}
}

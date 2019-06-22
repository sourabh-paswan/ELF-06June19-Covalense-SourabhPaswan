package com.covalanse.java.set;

import java.util.HashSet;

public class HasSetTest {
	public static void main(String[] args) {
		HashSet h= new HashSet();
		h.add(45);
		h.add("you");
		h.add('w');
		h.add(30.6);
		for (Object r : h) {
			System.out.println(r);
		}
	}

}

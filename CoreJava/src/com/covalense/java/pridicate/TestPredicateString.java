package com.covalense.java.pridicate;

import java.util.function.Predicate;

public class TestPredicateString {
	public static void main(String[] args) {
		Predicate<String> s= a->a.length()>=5;
		boolean t=s.test("myname");
		System.out.println(t);
	}

}

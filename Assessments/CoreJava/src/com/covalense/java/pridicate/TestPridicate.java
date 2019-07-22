package com.covalense.java.pridicate;

import java.util.function.Predicate;

public class TestPridicate {

	public static void main(String[] args) {
		Predicate<Integer> p= a ->a%2==0;
		boolean a = p.test(13);
		System.out.println(a);
	}

}

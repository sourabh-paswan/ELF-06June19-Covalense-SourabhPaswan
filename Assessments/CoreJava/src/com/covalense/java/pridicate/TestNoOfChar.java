package com.covalense.java.pridicate;

import java.util.function.Function;

public class TestNoOfChar {
	public static void main(String[] args) {
		Function<String, Integer> f= r -> r.length();
		int x = f.apply("retaa");
		System.out.println(x);
	}

}

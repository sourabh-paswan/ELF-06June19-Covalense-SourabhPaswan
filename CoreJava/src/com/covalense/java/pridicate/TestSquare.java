package com.covalense.java.pridicate;

import java.util.function.Function;

public class TestSquare {
	public static void main(String[] args) {
		Function<Integer, Integer> f =r ->r*r;
		int x = f.apply(4);
		System.out.println(x);
	}

}

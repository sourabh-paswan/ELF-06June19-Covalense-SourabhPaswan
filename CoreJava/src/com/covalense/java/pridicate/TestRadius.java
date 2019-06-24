package com.covalense.java.pridicate;

import java.util.function.Function;

public class TestRadius {

	public static void main(String[] args) {
		Function<Double, Double> f = r->3.14*r*r;
		double x = f.apply(6.0);
		System.out.println(x);
	}

}

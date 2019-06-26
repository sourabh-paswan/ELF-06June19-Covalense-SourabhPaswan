package com.covalense.java.supplier;

import java.util.function.Supplier;

public class TestGun {
	public static void main(String[] args) {
		Supplier<Gun> v= ()->new Gun(100);
		Gun g= v.get();
		System.out.println(g.bullets);
	}

}

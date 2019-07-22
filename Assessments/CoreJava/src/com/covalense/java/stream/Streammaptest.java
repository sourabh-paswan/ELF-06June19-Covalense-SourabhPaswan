package com.covalense.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streammaptest {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		List<Boolean> x = al.stream().map(i->i%2==0).collect(Collectors.toList());
		System.out.println(x);
	}

}

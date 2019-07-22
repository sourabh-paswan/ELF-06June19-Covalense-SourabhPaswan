package com.covalense.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest3 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(22);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		al.stream().sorted();
		System.out.println(al);
		
		/*
		 * Stream<Integer> s = al.stream().sorted(); List<Integer> b1 =
		 * s.collect(Collectors.toList()); System.out.println(b1);
		 */
		
		List<Integer> s = al.stream().sorted().collect(Collectors.toList());
		System.out.println(s);
		
	}

}

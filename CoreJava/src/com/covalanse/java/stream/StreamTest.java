package com.covalanse.java.stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		List<Integer> x = al.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println(x);
		
		List<Integer> x2 = al.stream().filter(i->i%3==0).collect(Collectors.toList());
		System.out.println(x2);
	}

}

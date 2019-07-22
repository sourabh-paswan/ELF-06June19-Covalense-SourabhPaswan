package com.covalense.java.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest5 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(22);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		
		Comparator<Integer> c = (i,j)->i.compareTo(j)*-1;
		List<Integer> s = al.stream().sorted(c).collect(Collectors.toList());
		System.out.println(s);
		
		
		
		
	}

}

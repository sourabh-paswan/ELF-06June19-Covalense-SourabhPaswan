package com.covalanse.java.stream;

import java.util.ArrayList;

public class StreamTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		long t = al.stream().filter(i->i%2!=0).count();
		System.out.println(t);
		
		
	}


}

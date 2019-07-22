package com.covalense.java.stream;

import java.util.ArrayList;

public class StreamTest4 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(22);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);

		al.stream().forEach(i -> System.out.println(i));

	}

}

package com.covalense.java.streammax;

import java.util.stream.Stream;



/* we can refer println method in stream (no need to write lembda expression)*/


public class ArrayStream3 {
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(39,99,88);
		s.forEach(System.out::println);
	}

}

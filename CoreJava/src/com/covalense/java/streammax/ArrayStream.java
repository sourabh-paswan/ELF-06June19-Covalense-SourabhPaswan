package com.covalense.java.streammax;

import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log

/* we can shown array group of no.s in stream */


public class ArrayStream {
	public static void main(String[] args) {
		Integer a[]= {2,3,4,5,54};
		Stream<Integer> s = Stream.of(a);
		s.forEach(i->log.info(""+i));
	}

}

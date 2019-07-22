package com.covalense.java.streammax;

import java.util.stream.Stream;

import lombok.extern.java.Log;

@Log

/* we can shown group of no.s in stream */


public class ArrayStream2 {
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(39,99,88);
		s.forEach(i->log.info(""+i));
	}

}

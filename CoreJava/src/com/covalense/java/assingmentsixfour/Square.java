package com.covalense.java.assingmentsixfour;

import lombok.extern.java.Log;

@Log
public class Square {
	public static void main(String[] args) {
		SquareInterface expression = num -> num*num;
		int sqr = expression.square(12);
		log.info("square is "+sqr);
	}

}

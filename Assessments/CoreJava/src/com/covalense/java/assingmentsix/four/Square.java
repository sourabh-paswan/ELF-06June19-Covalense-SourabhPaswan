package com.covalense.java.assingmentsix.four;

import lombok.extern.java.Log;

@Log
public class Square {
	public static void main(String[] args) {
		SquareInterface expression = num -> num*num;
		int sqr = expression.square(18);
		log.info("square is "+sqr);
	}

}

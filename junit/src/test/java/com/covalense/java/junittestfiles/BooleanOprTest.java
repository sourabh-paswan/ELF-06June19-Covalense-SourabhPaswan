package com.covalense.java.junittestfiles;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.covalense.java.junit.BooleanOpr;

public class BooleanOprTest {

	private BooleanOpr bo = new BooleanOpr();
	
	@Test
	public void testoddEvenMethodForOdd() {
		assertEquals(true, bo.oddEven(7));
	}

}

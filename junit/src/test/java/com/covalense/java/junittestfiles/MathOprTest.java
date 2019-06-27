package com.covalense.java.junittestfiles;

import static org.junit.Assert.*;

import org.junit.Test;

import com.covalense.java.junit.MathOpr;

public class MathOprTest {

	MathOpr m = new MathOpr();

	@Test
	public void testAddMethod() {
		assertEquals(60, m.add(10, 50));
	}

	@Test
	public void testDivmethod() {
		assertEquals(6, m.div(60, 10));
	}
	
	
	@Test(expected = ArithmeticException.class)
	public void testDivForExeption() {
		m.div(10, 0);
	}

}

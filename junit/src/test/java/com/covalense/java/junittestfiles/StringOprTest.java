package com.covalense.java.junittestfiles;

import static org.junit.Assert.*;

import org.junit.Test;

import com.covalense.java.junit.StringOpr;

public class StringOprTest {

	private StringOpr strOpp = new StringOpr();
	
	@Test
	public void testcountCharInString() {
		int expected = 4;
		int actual = strOpp.countCharInString("ramu");
		
		assertEquals(expected, actual);
	}
	
	
}

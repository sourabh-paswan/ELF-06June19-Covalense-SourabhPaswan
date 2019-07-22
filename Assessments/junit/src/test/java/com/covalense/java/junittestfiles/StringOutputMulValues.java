package com.covalense.java.junittestfiles;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.covalense.java.junit.StringOpr;

@RunWith(Parameterized.class)
public class StringOutputMulValues {

	private StringOpr str = new StringOpr();

	private String name;
	private int value;

	public StringOutputMulValues(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Parameters
	public static Collection<Object[]> getPairs() {
		Object[][] obj = { { "ram", 3 }, { "sita", 4 } };
		return Arrays.asList(obj);

	}

	@Test
	public void testcountCharInString() {
		int res = str.countCharInString(name);
		assertEquals(value, res);
	}

}

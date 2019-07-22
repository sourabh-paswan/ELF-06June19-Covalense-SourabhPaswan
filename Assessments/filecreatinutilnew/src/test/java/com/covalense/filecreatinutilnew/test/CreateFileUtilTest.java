package com.covalense.filecreatinutilnew.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.covalense.filecreatinutilnew.util.CreateFileUnit;

public class CreateFileUtilTest {
	@Test
	public void CreateFileTest() {
		
		CreateFileUnit c = new CreateFileUnit();
		boolean expected = true;
		boolean actual = c.createFile("mytextfile.txt","here is my file");

		assertEquals(expected, actual);
	}

}

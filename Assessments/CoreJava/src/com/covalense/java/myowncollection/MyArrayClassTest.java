package com.covalense.java.myowncollection;

import java.util.logging.Logger;

public class MyArrayClassTest {
	private static final Logger Log = Logger.getLogger("MyArrayClassTest");
	
	public static void main(String[] args) {
		int datasize = 10;
		MyArrayClass m = new MyArrayClass();
		for (int i = 0; i < datasize; i++) {
			m.add(i);
		}
		
		
		long start= System.currentTimeMillis();
		Log.info("removing 4th");
		m.remove(19);
		
		
		long end= System.currentTimeMillis();
		
		for (int i = 0; i < datasize; i++) {
			Log.info(" output " + m.get(i));
			
			
			Log.info("ms"+(start-end));
			
		}
	}
}
		
	
		





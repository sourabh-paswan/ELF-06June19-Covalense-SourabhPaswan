package com.covalense.java.runnabletread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMouse {
	public static void main(String[] args) {
		 
		Mouse m1 = new Mouse("myfirst");
		Mouse m2 = new Mouse("mysecond");
		Mouse m3 = new Mouse("mythird");
		Mouse m4 = new Mouse("myfourth");
		Mouse m5 = new Mouse("myfifth");
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(m1);
		service.execute(m2);
		service.execute(m3);
		service.execute(m4);
		service.execute(m5);
		
		service.shutdown();
	}

}

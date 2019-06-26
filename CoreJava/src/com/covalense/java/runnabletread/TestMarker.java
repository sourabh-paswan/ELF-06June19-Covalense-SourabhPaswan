package com.covalense.java.runnabletread;

public class TestMarker {
	public static void main(String[] args) {
		Marker m = new Marker();
		Thread t1 = new Thread(m);
		t1.start();
		
		Thread t2 = new Thread(m);
		t2.start();
	}

}

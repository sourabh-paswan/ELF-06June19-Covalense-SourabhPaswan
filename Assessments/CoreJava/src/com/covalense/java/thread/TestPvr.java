package com.covalense.java.thread;

public class TestPvr {
	public static void main(String[] args) {
		Pvr p = new Pvr();
		
		Browser b = new Browser(p);
		b.start();
		
		Browser b2 = new Browser(p);
		b2.start();
	}

}

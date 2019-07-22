package com.covalense.java.doublecolon;

public class MyStudent {
	void calavg(int a, int b, int c) {
		double r = (a+b+c)/3.0;
		System.out.println(r);
	}

	void fact(int a) {
		int f=1;
		for(int i=1;i<a;i++) {
			f=f*i;
		}
	}
}

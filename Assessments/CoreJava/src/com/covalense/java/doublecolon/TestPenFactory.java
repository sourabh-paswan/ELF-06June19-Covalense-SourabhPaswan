package com.covalense.java.doublecolon;

public class TestPenFactory {

	public static void main(String[] args) {
		PenFactory pf = Pen :: new;
		Pen x = pf.getpen();
		System.out.println(x);
	}

}

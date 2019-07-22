package com.covalense.jdbcapp.commons;

public class MainMethodClass {

	public static void main(String[] args) {
//		ClassA ref = new ClassA();
//		ref.printMessage();
		Connection ref = DriverManager.getInstance(args[0]);
		ref.printMessage();
	}

}

package com.covalense.java.exceptionhandle;

public class Test {

	public static void main(String[] args) {
		Paytm p= new Paytm();
		
		try
		{
			p.getTicket();
		}
		catch(ArithmeticException j)
		{
			System.out.println("donot");
		}

	}

}

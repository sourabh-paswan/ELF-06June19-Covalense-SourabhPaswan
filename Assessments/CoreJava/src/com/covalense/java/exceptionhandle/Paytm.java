package com.covalense.java.exceptionhandle;

public class Paytm extends Irctc {
	void getTicket() throws ArithmeticException
	{
		System.out.println("getTicket() method started ");
		try
		{
			System.out.println(20/3);
			System.out.println(20/0);
		}
		catch(ArithmeticException b)
		{
			System.out.println("do not divide with zero");
			throw b;
		}

		System.out.println("getTicket() method ended ");
	}

}

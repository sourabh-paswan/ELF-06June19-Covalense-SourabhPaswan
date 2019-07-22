package com.covalense.java.exceptionhandle;

public class Irctc {
	void train()
	{
		System.out.println("train() method started");
		try
		{
			System.out.println(10/2);
		}
		catch(ArithmeticException a)
		{
			System.out.println("do not divide with zero");
			throw a;
		}
		System.out.println("train() method ended");
	}

}

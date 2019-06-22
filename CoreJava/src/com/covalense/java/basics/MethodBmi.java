package com.covalense.java.basics;

public class MethodBmi {

	public static void main(String[] args) {
		double bb=b(50,56);
		System.out.println(bb);
		

	}
	static double b(double x,double y) {

		double result = 0.0;
		return result = x/(y*y);
	}
	static void result(double result)
	{
		if (result<=18.5)
		{
			System.out.println("normal");
			if (result>18.5 && result <=24.5)
			{
				System.out.println("");
				if (result>24.5 && result <=29.9)
				{
					System.out.println("overweight");}
					else
					{
						System.out.println("obese");
					}
				}
			}

		}
}

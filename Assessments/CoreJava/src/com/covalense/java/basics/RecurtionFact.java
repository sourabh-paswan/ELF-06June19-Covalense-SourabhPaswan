package com.covalense.java.basics;

public class RecurtionFact {

	public static void main(String[] args) {
		int res= fact(5);
		
		System.out.println(res);
		
	}
	static int fact(int a)
	{
		if(a==0)
		{
			return 1;	
		}
		return a*(fact(a-1));
	}

}

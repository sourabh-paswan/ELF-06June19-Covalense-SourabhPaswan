package com.covalense.java.basics;

public class MethodFact {

	public static void main(String[] args) {
		int p=fact(6);
		System.out.println("p");

	}
	
static int fact(int a)
{
	int f=1;
	for(int i=1; i<a; i++) {
		f=f*i;
		
	}
	return f;
}
}


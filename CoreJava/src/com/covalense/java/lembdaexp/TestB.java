package com.covalense.java.lembdaexp;
interface Square{
	int sqr(int a);
	
}
public class TestB {
	public static void main(String[] args) {
		Square s=a->a*a;
		int p=s.sqr(5);
		System.out.println(p);
	}

}

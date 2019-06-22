package com.covalense.java.lembdaexp;
interface StringDemo
{
int getCharCount(String st);	
}
public class TestC {
	public static void main(String[] args) {
		StringDemo s= a->a.length();
		int i= s.getCharCount("rere");
		System.out.println(i);}

}

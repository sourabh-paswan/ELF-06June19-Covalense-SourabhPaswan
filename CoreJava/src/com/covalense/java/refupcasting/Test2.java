package com.covalense.java.refupcasting;

public class Test2 {
	public static void main(String[] args) {
		Chips c= new Lays();
		Lays l= (Lays)c;
		l.open();
		l.eat();
		System.out.println();
		System.out.println("***************************");
		System.out.println();
		
		Chips p= new Bingo();
		Bingo b=(Bingo)p;
		l.open();
		b.bite();
	}

}

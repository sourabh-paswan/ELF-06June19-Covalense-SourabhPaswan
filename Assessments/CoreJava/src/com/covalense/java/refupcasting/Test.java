package com.covalense.java.refupcasting;

public class Test {
	public static void main(String[] args) {
		Animal a= new Cow();
		
		
		Cow c= (Cow)a;
		c.run();
		c.eat();
		
		
	}

}

package com.covalense.java.constructor;

public class Superthis {
	class A
	{
		int a=10;
	}
	
	class B extends A
	{
		int a=30;
		
		
			
			void m()
			{
				int a= 40;
				System.out.println(a);
				System.out.println(this.a);
				System.out.println(super.a);
			}
			
		}
	}



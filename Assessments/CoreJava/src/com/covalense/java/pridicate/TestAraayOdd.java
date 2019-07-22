package com.covalense.java.pridicate;

import java.util.function.Predicate;

public class TestAraayOdd {
	public static void main(String[] args) {
		int[] b= {23,45,67,45,66,55};
		//Predicate<Integer> p= a ->a%2==0; 
		Predicate<Integer> p= a ->a>4;
		
		
		for(int i=0;i<=b.length-1;i++) {	
		if(p.test(b[i])) {
			System.out.println(b[i]);
		}			
				
			
		}
	}

}

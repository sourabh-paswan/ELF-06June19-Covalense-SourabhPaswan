package com.covalense.java.collections.arraylist.studentarraylist;

import java.util.ArrayList;
import java.util.TreeSet;

public class ProductTest {
	public static void main(String[] args) {
		
		
		Product p1= new Product();
		p1.name="lays";
		p1.cost=20;
		p1.rating=4.5;
		
		Product p2= new Product();
		p2.name="lays";
		p2.cost=20;
		p2.rating=4.5;
		
		Product p3= new Product();
		p3.name="lays";
		p3.cost=20;
		p3.rating=4.5;
		
		
		
		TreeSet<Product> t= new TreeSet<Product>();
		
		t.add(p1);
		t.add(p2);
		t.add(p3);
		
		for(Product r:t)
		{
			System.out.println(r);
		}
	}

}

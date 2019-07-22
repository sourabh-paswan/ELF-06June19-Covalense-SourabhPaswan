package com.covalense.java.collections.arraylist.studentarraylist;

public class Product implements Comparable<Product> {
	String name;
	int cost;
	Double rating;
	@Override
	public int compareTo(Product o) {
		if(this.cost < o.cost)
		{
			return -1;
		}
		else if(this.cost<o.cost)
		{
			return 1;
		}
		else 
		{
			return 0;
		}
	}
	

}

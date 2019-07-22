package com.covalense.java.basics;

public class CarPrice {

	public static void main(String[] args) {
int exPrice=570000;
double rto= (exPrice*14.26)/100;
double ins=(exPrice*9.76)/100;
double total=exPrice+rto+ins;
System.out.println("Ex Showroom price is "+exPrice);
System.out.println("RTO is "+rto);
System.out.println("insurance is "+ins);
System.out.println("on road price is "+total);
	}

}

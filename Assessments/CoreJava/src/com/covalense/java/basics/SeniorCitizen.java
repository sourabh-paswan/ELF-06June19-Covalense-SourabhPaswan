package com.covalense.java.basics;

public class SeniorCitizen {

	public static void main(String[] args) {
		int age=67;
		int t=100;
		double disc=15.2;
		if(age>=60)
		{
			double sticket=t-(t*disc)/100;
			System.out.println("Ticket price is "+sticket);
		}
		
		
	}

}

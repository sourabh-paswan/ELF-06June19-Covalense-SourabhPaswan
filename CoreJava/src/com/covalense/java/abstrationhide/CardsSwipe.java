package com.covalense.java.abstrationhide;

public class CardsSwipe {

	public static void main(String[] args) {
Card a= new Card();
Card j= new Card();

a.swipe();
j.swipe();
a.swipe();

System.out.println("java count is"+j.count);

	}

}

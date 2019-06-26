package com.covalense.java.doublecolon;

public class TestBoy {
	public static void main(String[] args) {
		MyBoy mb = Boy :: new;
		Boy b = mb.getBoy("ramu", 34, 11.5);
		System.out.println(b.name+b.Age+b.hieght);
	}

}

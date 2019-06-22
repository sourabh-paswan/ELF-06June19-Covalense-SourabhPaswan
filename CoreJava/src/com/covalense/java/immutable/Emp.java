package com.covalense.java.immutable;

public class Emp {
	private final String name;
	private final int age;
	private final char gender;
	public Emp(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	

}

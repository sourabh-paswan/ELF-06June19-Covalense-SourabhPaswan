package com.covalense.springcore.beans;

import com.covalense.springcore.interfaces.Animal;

public class Monkey implements Animal {

	@Override
	public void eat() {
		System.out.println("Monkey is eating");
	}

	@Override
	public void makeSound() {
		System.out.println("Monkey is making Sound");
	}

}

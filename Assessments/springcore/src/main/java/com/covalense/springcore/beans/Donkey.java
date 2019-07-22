package com.covalense.springcore.beans;

import com.covalense.springcore.interfaces.Animal;

public class Donkey implements Animal {

	@Override
	public void eat() {
		System.out.println("donkey is eating");
	}

	@Override
	public void makeSound() {
		System.out.println("donkey is making sound");
	}

}

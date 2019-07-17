package com.covalense.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.covalense.springcore.interfaces.Animal;

public class Pet {
	
	private String name;
	@Autowired
	@Qualifier("monkey")
	private Animal animal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public void doSomething() {
		animal.eat();
		animal.makeSound();
	}
	

}

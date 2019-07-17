package com.covalense.springcore.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.springcore.Pet;
import com.covalense.springcore.beans.Donkey;
import com.covalense.springcore.beans.Monkey;
import com.covalense.springcore.interfaces.Animal;

@Configuration

public class PetConfig {
	@Bean
	public Pet pet() {
		return new Pet();
	}

	@Bean(name= "donkey")
	public Animal getDonkey() {
		return new Donkey();
	}

	@Bean(name= "monkey")
	public Animal getMonkey() {
		return new Monkey();
	}

}

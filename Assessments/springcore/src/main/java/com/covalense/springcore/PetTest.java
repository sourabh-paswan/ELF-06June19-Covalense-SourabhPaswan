package com.covalense.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.covalense.springcore.annotation.PetConfig;

public class PetTest {

	public static void main(String[] args) {
		//ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("petConfig.xml");
		
		
		Pet pet = context.getBean(Pet.class);

		pet.doSomething();
	}

}

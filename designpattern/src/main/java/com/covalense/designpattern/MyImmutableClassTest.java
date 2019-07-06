package com.covalense.designpattern;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
	public static void main(String[] args) {
		MyImmutableClass immutableClass = null;

		immutableClass = new MyImmutableClass("ram", 23, 9810836905L);
		log.info("name: " + immutableClass.getName());
		log.info("age: " + immutableClass.getAge());
		log.info("phone: " + immutableClass.getPhone());

		immutableClass = new MyImmutableClass("ram", 23, 9810836905L);
		log.info("name: " + immutableClass.getName());
		log.info("age: " + immutableClass.getAge());
		log.info("phone: " + immutableClass.getPhone());
	}

}

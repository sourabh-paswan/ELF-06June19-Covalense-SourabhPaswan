package com.covalense.jdbcapp.commons;

import lombok.extern.java.Log;

@Log
public class ClassB implements Connection {
	public void printMessage() {
		log.info("printing b");
	}
}

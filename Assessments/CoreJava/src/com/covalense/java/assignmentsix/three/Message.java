package com.covalense.java.assignmentsix.three;

import lombok.extern.java.Log;

@Log
public class Message {

	public static void main(String[] args) {
		LemdaInterfaceMessage expression = msg -> msg +"Hello there";
		String getMessage = expression.message("hey ");
		log.info("message is --->"+getMessage);
	}

}

package com.covalense.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;


public class MessageBean2 {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@PostConstruct
	public void init() {
		System.out.println("init phase");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy phase");
	}

}

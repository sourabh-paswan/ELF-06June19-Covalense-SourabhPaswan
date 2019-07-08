package com.covalense.designpattern.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class MyImmutableClass {
	private String name;
	private int age;
	private long phone;

}// End of class
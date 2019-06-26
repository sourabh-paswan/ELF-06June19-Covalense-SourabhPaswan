package com.covalense.java.supplier;

import java.util.function.Supplier;

public class TestCar {
	public static void main(String[] args) {
		Supplier<Car> v= ()->new Car(15.42);
		Car c = v.get();
		System.out.println(c.fuel);
	}

}

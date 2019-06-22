package com.covalense.java.miphonegift;

public class Girl {
	void recieve(Phone p) {
		if (p instanceof Iphone) {
			System.out.println("love");

		} else if (p instanceof MIphone) {
			System.out.println("brother");
		}

	}

}

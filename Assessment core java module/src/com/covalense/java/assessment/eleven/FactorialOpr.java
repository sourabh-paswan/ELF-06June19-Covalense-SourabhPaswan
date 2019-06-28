package com.covalense.java.assessment.eleven;

public class FactorialOpr {
	static int factorial = 1;

	int fact(int num) {
		for (int i = 0; i < num; i++) {
			factorial = factorial * num;
		}
		return factorial;
	}

}

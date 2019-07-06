package com.covalense.java.assignmentsix.one;

import lombok.extern.java.Log;

@Log
public class SumOfNum {

	public static void main(String[] args) {
		LembdaInterface expression = (num1 , num2) -> num1+num2;
		int res = expression.add(45, 78);
		log.info("sum is "+res);
	}

}

package com.covalense.java.assignmentsixtwo;

import lombok.extern.java.Log;
@Log
public class FactOfNum {
	public static void main(String[] args) {
		LembdaInterfaceFact expression = num ->{
			int fact=1;
			for(int i=1;i<num;i++) {
				fact=fact*i;
			}
			return fact;
		};
		int factOfNum = expression.fact(7);
		log.info("factorial is "+factOfNum);
	}

}

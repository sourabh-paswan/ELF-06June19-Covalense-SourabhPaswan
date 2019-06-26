package com.covalense.java.lamdaimplimenting;

public enum LoanEnum {
	HOME(240),PERSONAL(241),CAR(242);

	
	public int value;
	private LoanEnum (int value) {
		this.value= value;
	}
	int getValue() {
		return value;
	}
}

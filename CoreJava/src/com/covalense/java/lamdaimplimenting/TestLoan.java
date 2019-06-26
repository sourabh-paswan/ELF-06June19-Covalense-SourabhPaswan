package com.covalense.java.lamdaimplimenting;

import lombok.extern.java.Log;

@Log
public class TestLoan {
	public static void main(String[] args) {
		
		LoanEnum t = LoanEnum.HOME;
		int constvalue = t.getValue();
		log.info("loan value is for home  "+constvalue);
	}

}

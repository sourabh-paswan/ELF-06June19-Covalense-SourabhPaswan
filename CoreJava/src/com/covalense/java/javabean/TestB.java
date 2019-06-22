package com.covalense.java.javabean;
import java.util.logging.Logger;

public class TestB {
	private static final Logger Log= Logger.getLogger("TestB");
	public static void main(String[] args) {
		
		EmpBean2 e= new EmpBean2();
		Log.info("without lambok"+e.toString());
		
		EmpBean2 e2= new EmpBean2();
		e.setAge(34);
		Log.info("with lambok"+e2.toString());
		
		e.toString();
	}

}

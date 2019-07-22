package com.covalense.java.lamdaimplimenting;

public class TryExeption {
	public static void main(String[] args) {


		try {

		} catch (ArithmeticException | NullPointerException e) {
			System.out.println(e.getMessage());
		} /*
			 * catch (NullPointerException e) { System.out.println(e.getMessage()); }
			 */ catch (Exception e) {
			System.out.println("genral block");
		}

	}

}

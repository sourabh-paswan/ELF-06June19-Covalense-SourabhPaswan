package com.covalense.java.assessment.four;

public class Train {
	private int tNumber;
	private String tName;
	public Train(int tNumber, String tName) {
		this.tNumber = tNumber;
		this.tName = tName;
	}
	public int gettNumber() {
		return tNumber;
	}
	public void settNumber(int tNumber) {
		this.tNumber = tNumber;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}

}

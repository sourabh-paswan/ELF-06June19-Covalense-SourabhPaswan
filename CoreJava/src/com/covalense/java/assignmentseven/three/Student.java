package com.covalense.java.assignmentseven.three;

public class Student {
	private String name;
	private double percent;
	public Student(String name, double percent) {
		this.name = name;
		this.percent = percent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}

}

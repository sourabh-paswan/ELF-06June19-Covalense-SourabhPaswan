package com.covalense.java.abstrationhide;

public class Test {

	public static void main(String[] args) {
		Browser b= new Browser();
		Gmail g= new Gmail();
		Gdrive gd= new Gdrive();
		b.open(g);
	}

}

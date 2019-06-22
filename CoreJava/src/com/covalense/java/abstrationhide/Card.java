package com.covalense.java.abstrationhide;

public class Card {
	static int orgCount;
	int count;
	void swipe()
	{
		orgCount++;
		count++;
	}
}

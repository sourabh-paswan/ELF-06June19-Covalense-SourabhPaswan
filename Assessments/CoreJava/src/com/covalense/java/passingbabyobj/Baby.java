package com.covalense.java.passingbabyobj;

public class Baby {
	String name;
	String color;
	void take(Object p)
	{
		if (p instanceof Object )
		{
			System.out.println("take object");
		}
	}

}

package com.covalense.java.singleton;

public class Marker {
	public final static Marker m= new Marker();
	private Marker()
	{
		System.out.println("marker is here");
	}
	public static Marker getMarker()
	{
		return m;
	}
	

}

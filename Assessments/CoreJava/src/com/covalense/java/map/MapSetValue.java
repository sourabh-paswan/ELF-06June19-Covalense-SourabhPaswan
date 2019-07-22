package com.covalense.java.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapSetValue {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> h = new LinkedHashMap<String, Integer>();
		h.put("one", 1);
		h.put("two", 2);
		h.put("three", 3);
		h.put("four", 4);
		
		Collection<Integer> c= h.values();
		Iterator<Integer> i= c.iterator();
		while(i.hasNext())
		{
			Integer r= i.next();
			System.out.println(r);
		}
	}

}

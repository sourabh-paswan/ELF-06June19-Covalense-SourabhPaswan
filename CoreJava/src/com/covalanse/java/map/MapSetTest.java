package com.covalanse.java.map;

import java.util.LinkedHashMap;
import java.util.Set;

public class MapSetTest {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> h = new LinkedHashMap<String, Integer>();
		h.put("one", 1);
		h.put("two", 2);
		h.put("three", 3);
		h.put("four", 4);
		
		Set<String> ts =h.keySet();
		for(String s: ts)
		{
			System.out.println(s);
		}
	}

}

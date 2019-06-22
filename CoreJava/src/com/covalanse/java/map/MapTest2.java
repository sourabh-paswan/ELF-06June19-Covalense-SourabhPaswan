package com.covalanse.java.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest2 {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> h = new LinkedHashMap<String, Integer>();
		h.put("one", 1);
		h.put("two", 2);
		h.put("three", 3);
		h.put("four", 4);
		
		for(Map.Entry<String, Integer> a:h.entrySet())
		{
			String key= a.getKey();
			Integer value= a.getValue();
			
			
			System.out.println("key is "+key);
			System.out.println("value is "+value);
			System.out.println("***********");
		}
	}


}

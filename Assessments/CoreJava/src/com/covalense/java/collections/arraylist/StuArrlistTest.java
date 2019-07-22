package com.covalense.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class StuArrlistTest {
	public static void main(String[] args) {
		ArrayList<StuArrayList> al= new ArrayList<StuArrayList>();
		StuArrayList s1=new StuArrayList();
		s1.name="ramu";
		s1.id=45;
		s1.percent=34.45;
		
		StuArrayList s2=new StuArrayList();
		s2.name="ramesh";
		s2.id=44;
		s2.percent=39.45;
		
		StuArrayList s3=new StuArrayList();
		s3.name="pinki";
		s3.id=85;
		s3.percent=78.45;
		
		StuArrayList s4=new StuArrayList();
		s4.name="reta";
		s4.id=78;
		s4.percent=74.45;
		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		
		
		for(int i=0;i<al.size();i++)
		{
			StuArrayList s=al.get(i);
			System.out.println("name is "+s.name);
			System.out.println("id is "+s.id);
			System.out.println("percentage is "+s.percent);
			System.out.println();
		}
		Iterator<StuArrayList> it= al.iterator();
		while(it.hasNext())
		{
		StuArrayList r=it.next();
		System.out.println(r);
		}
		TreeSet<StuArrayList> h= new TreeSet<StuArrayList>();
		h.add(s1);
		h.add(s2);
		h.add(s3);
		h.add(s4);
		for (StuArrayList r : h) {
			System.out.println(r);}
			Iterator<StuArrayList> it2= h.iterator();
			while(it2.hasNext())
			{
				StuArrayList i=it2.next();
				System.out.println(i);
			}
		
		
	}

}

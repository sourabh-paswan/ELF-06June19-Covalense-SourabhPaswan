package com.covalense.java.collections.arraylist;

public class StuArrayList implements Comparable<StuArrayList> {
	
		String name;
		int id;
		double percent;
		/*@Override
		 * logic to sort arraylist with respect to id
		public int compareTo(StuArrayList o) {
			if(this.id < o.id)
			{
				return -1;
			}
			else if(this.id<o.id)
			{
				return 1;
			}
			else 
			{
				return 0;
			}*/
		@Override
		public int compareTo(StuArrayList o) {
			String a=this.name;
			String b=o.name;
			int i=a.compareTo(b);
			return i;
			
		}
			
		}
		//logic to sort with percentage
		//@Override
		/*public int compareTo(StuArrayList o) {
			if(this.percent < o.percent)
			{
				return -1;
			}
			else if(this.percent < o.percent)
			{
				return 1;
			}
			else 
			{
				return 0;
			}
			
		}*/
		
	



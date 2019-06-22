package com.covalense.java.arraycopy;

public class Test2 {

	public static void main(String[] args) {
		int arr1[]= {565,6768,98,78};
		int arr2[]= {67,76,787,79,78};
		System.arraycopy(arr1, 1, arr2, 2, 2);
		
		for(int t:arr2)
		{
			System.out.println(t);
		}
	}

}

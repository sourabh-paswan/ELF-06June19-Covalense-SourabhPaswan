package com.covalense.java.arraycopy;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("array size ");
		int s1=sc.nextInt();
			int arr1[]=new int[s1];
			int arr2[]=new int[s1];
			
			for(int i=0; i<=arr1.length-1; i++)
			{
				arr1[i]=sc.nextInt();
			}
			for(int i=2; i<=arr1.length-1; i++)
			{
				
				arr2[i]=arr1[i++];
				
			}
			
			for(int i=0; i<=arr2.length-1; i++)
			{
				System.out.println(arr2[i]);	
			}
			
			
			
			
			
			
	}

}

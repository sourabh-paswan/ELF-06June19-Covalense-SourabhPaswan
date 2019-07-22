package com.covalense.java.assignmentone;

public class AssignmentOneSix {
	public static void main(String[] args) {
		{
			
			
			
			
			for (int i=1; i<=9; i++)
			{
				for (int j=9;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=2;k<=2*i;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}

package com.covalense.java.sortarray;
import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			System.out.println("no. " + i);
			num[i] = s.nextInt();
		}

		int[] array = new int[5];
		for (int i = 0; i < num.length; i++) {
			array[i] = num[i];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if (array[i] == num[j]) {
					System.out.println("equal");
				}
			}
		}

	}

}

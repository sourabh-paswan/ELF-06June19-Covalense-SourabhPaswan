package com.covalense.java.sortarray;
import java.util.Arrays;
import java.util.Collections;

public class SortString {
	public static void main(String[] args) {
		String[] s= {"aas","tr","rte","hh","ded","ty"};
		Arrays.sort(s,Collections.reverseOrder());
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}

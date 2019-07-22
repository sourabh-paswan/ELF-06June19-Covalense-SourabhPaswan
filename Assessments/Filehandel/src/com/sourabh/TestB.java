package com.sourabh;

import java.io.File;
import java.io.IOException;

public class TestB {
	public static void main(String[] args) {
		File f=new File("Programfile/a/b.txt");
		boolean res= f.mkdirs();
		try {
			boolean res1=f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("result is "+res);
	}
			

}

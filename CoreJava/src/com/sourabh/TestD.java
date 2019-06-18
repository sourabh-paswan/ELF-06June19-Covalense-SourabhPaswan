package com.sourabh;

import java.io.FileWriter;
import java.io.IOException;

public class TestD {
	public static void main(String[] args) {
		String ms = "nobody here";
		char c[] = ms.toCharArray();
		try {
			FileWriter f = new FileWriter("password.txt");
			f.write(c);
			f.flush();
			f.close();
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

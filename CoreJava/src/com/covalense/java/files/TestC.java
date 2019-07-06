package com.covalense.java.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestC {
	public static void main(String[] args) {
		String msg="hey its me agian";
		byte b[]=msg.getBytes();
		try {
			FileOutputStream fout= new FileOutputStream("myFile.txt",false);
			
			fout.write(b);
			System.out.println("data writen");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

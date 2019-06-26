package com.covalense.java.fileinputtwosixjune;

import java.io.FileOutputStream;
import java.io.IOException;

public class InputFile {
	public static void main(String[] args) {
		String msg = "Hello";
		byte[] by = msg.getBytes();
		
		
		//for resc leak we can write in try ()block, 
		//we can write multiple statements by use semicolon
		/*try {
			FileOutputStream fout = new FileOutputStream("vikas22.txt");
			fout.write(by);
		}*/
		
		try (FileOutputStream fout = new FileOutputStream("vikas22.txt")){
			
			fout.write(by);
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}

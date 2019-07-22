import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;                                                          

public class FileHandelingExample {

	public static void main(String[] args) {
		try {
			//FileUtils.writeStringToFile(new File("sourabh2.txt"), "this is this");
			//FileUtils.writeStringToFile(new File("sourabh2.txt"), "this is this",Charset.defaultCharset());
			//System.out.println("created the file");
			
			System.out.println("reading the file");
			FileUtils.readFileToString(new File("textfile2.txt"));
			System.out.println("file read");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// end of main

}// end of class

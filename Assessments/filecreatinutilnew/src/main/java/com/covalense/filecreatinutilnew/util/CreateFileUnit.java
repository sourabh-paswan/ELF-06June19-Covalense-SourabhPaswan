package com.covalense.filecreatinutilnew.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class CreateFileUnit {
	public boolean createFile(String fileloc, String data) {
		 
		
		try {
			FileUtils.writeStringToFile(new File (fileloc),data,Charset.defaultCharset());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}//End of createFile

}//End of Class

package com.covalanse.java.propertiesfile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class WriteToProperties {
	public static void main(String[] args) {
		
			try {
				FileOutputStream fout = new FileOutputStream("demo.properties");
				Properties p = new Properties();
				p.setProperty("companyname", "testyantra");
				p.setProperty("phoneno", "78788878787");
				
				p.store(fout, "company details");
				log.info("created the file");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}

}

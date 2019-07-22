package com.covalense.java.propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;
@Log
public class ReadProperties {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("demo.properties");
			Properties pro = new Properties();
			pro.load(fin);
			
			String phone = pro.getProperty("phoneno");
			String name = pro.getProperty("companyname");
			
			log.info("phone no is "+phone);
			log.info("name is "+name);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

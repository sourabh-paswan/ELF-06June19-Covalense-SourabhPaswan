package com.covalense.jdbcapp.connectionpool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class PropertyUtils {
	private static PropertyUtils prop = null;
	Properties properties;
	
	public static PropertyUtils getPropertyUtil() throws Exception {
		if(prop==null) {
			prop = new PropertyUtils();
		}
		return prop;
	}
	
	private PropertyUtils() throws Exception {
		Properties properties = new Properties();
		FileOutputStream fis = new FileOutputStream("ConnectionPoolFile.properties");
		properties.setProperty("poolSize", "10");
		properties.setProperty("dbUrl", "jdbc:mysql://localhost:3306/covalense_db");
		properties.setProperty("userName", "root");
		properties.setProperty("userPassword", "root");
		properties.setProperty("DriverClassName", "com.jdbc..");
		
		properties.store(fis, "ConnectionPool");
		properties.load(new FileInputStream("ConnectionPoolFile.properties"));
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
	

}

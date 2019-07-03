package com.covalense.jdbcapp.connectionpool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyUtil {
	private static propertyUtil util = null;
	Properties properties = null;
	private static ConnectionPool poolRef=null;
	public static propertyUtil getPropertyUtil() throws FileNotFoundException, IOException {
		if(util==null) {
			util= new propertyUtil();
		}return util;
	}
	
	
	private propertyUtil() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream("db.properties"));
	}
	
	private ConnectionPool propertyUtil () throws Exception {
		
		if(poolRef==null) {
			poolRef= new ConnectionPool();
		}
		return poolRef;
	}


	public String getProperty(String string) {
		
		return null;
	}


	public static Properties getPropertyUtil1() {
		return null;
	}
	}


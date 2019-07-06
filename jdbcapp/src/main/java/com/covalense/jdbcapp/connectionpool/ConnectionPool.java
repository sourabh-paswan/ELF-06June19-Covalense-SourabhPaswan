package com.covalense.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

import static com.covalense.jdbcapp.connectionpool.PropertyConstant.*;
import lombok.extern.java.Log;

@Log
public class ConnectionPool {

	private Vector<Connection> pool;
	private int poolSize = 10;
	private static ConnectionPool poolRef=null;
	private String dbUrl;
	private String userName ;
	private String userPassword ;
	
	private ConnectionPool() throws Exception {	
		loadPropertyInfo();			
		initialezPool();

	}//end of constructor
	
	public Connection getConnectionFromPool() {
		/*
		 * Connection con = pool.get(0); pool.remove(0); return pool.get(0);
		 */
		return pool.remove(0);
	}
	
	public void returnConnectionToPool(Connection con) {
		
		pool.add(con);
	}
	
	public static ConnectionPool getConnectionPool() throws Exception {
		if(poolRef==null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;
	}
	
	private void loadPropertyInfo() throws Exception {
		
		dbUrl = PropertyUtils.getPropertyUtil().getProperty(DBURL);
		userName =PropertyUtils.getPropertyUtil().getProperty(USER_NAME);
		userPassword =PropertyUtils.getPropertyUtil().getProperty(USER_PASS);
	
	}
	
	private void initialezPool() throws Exception{
		pool = new Vector<Connection>();
		Connection con = null;
		Class.forName(PropertyUtils.getPropertyUtil().getProperty("driverClassName")).newInstance();
		for (int i = 0; i < poolSize; i++) {
			con = DriverManager.getConnection(dbUrl,userName,userPassword);
			pool.add(con);
		}
	}

	

}//end of class

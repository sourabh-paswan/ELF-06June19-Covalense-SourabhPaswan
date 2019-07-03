package com.covalense.jdbcapp.connectionpool;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Vector;

public class ConnectionPool {
	Vector<Connection> pool = new Vector<>();
	private int poolsize =10;
	private String dburl ="jdbc:mysql://localhost:3306/covalense_db";
	private String username="root";
	private String password = "root";
	private Connection con= null;
	private String driverClassNM = "com.mysql.jdbc.Driver";
	static ConnectionPool poolRef=null;
	
	
	
	public static ConnectionPool getConnectionPool() throws Exception {
		if(poolRef==null) {
			poolRef= new ConnectionPool();
		}
		return poolRef; 
	}
	
	ConnectionPool() throws Exception{
		Properties p = new Properties();
		p.load(new FileInputStream("db.properties"));
		
		poolsize = Integer.parseInt(propertyUtil.getPropertyUtil().getProperty("poolsize"));
		dburl = propertyUtil.getPropertyUtil().getProperty("dburl");
		username= propertyUtil.getPropertyUtil().getProperty("username");
		password = propertyUtil.getPropertyUtil().getProperty("password");
		driverClassNM = propertyUtil.getPropertyUtil().getProperty("driverClassNM");
		
		Class.forName(driverClassNM);
		for(int i=0; i<poolsize;i++) {
			con =DriverManager.getConnection(dburl,username,password);
			pool.add(con);
		}
	}//end of constructor
	
	public Connection getConnectionFromPool() {
		//it will remove , and arrraylist get shifted
		return pool.remove(0);
	}
	
	public void returnConnectioToPool(Connection con) {
		pool.add(con);
	}

}


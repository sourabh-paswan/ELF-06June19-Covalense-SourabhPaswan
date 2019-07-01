package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public class MyFirstJdbcProg {

	public static void main(String[] args) {
		Connection con= null;
		Statement stmt= null;
		ResultSet rs= null;
		//1. Load the "driver"
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
		//2. Get the DB connection via driver
			String dburl = "jdbc:mysql://localhost:3306/covalense_db?user=root&password=root";
			 con = DriverManager.getConnection(dburl);
			
		//3.
			String query="select*from employee_info";
			 stmt = con.createStatement();
			 rs = stmt.executeQuery(query);
			
		//4. "process the results" returned by "SQL queries"
			while(rs.next()) {
				log.info("ID (PK)          ===>"+rs.getInt("ID"));
				log.info("NAME             ===>"+rs.getString("NAME"));      
				log.info("AGE              ===>"+rs.getInt("AGE"));      
				log.info("GENDER           ===>"+rs.getString("GENDER"));
				log.info("SALARY           ===>"+rs.getInt("SALARY"));
				log.info("PHONE            ===>"+rs.getInt("PHONE"));
				log.info("JOINING_DATE     ===>"+rs.getDate("JOINING_DATE"));
				log.info("AC_NO            ===>"+rs.getInt("AC_NO"));
				log.info("EMAIL            ===>"+rs.getString("EMAIL"));
				log.info("DEGIGNATION      ===>"+rs.getString("DEGIGNATION"));
				log.info("DOB              ===>"+rs.getDate("DOB"));
				log.info("DEPT_ID (FK)     ===>"+rs.getInt("DEPT_ID"));
				log.info("MANAGER_ID       ===>"+rs.getInt("MANAGER_ID"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. close all"jdbc objects"
			try {
				if(con!=null) {
					con.close();
				}if(stmt!=null) {
					stmt.close();
				}if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
	}

}

package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.Driver;

//import org.gjt.mm.mysql.Driver;

//import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public class MyFirstJdbcTryWithResorces {

	public static void main(String[] args) {

		String dburl = "jdbc:mysql://localhost:3306/covalense_db";
		String query = "select*from employee_info";

		try (Connection con = DriverManager.getConnection(dburl, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			// 1. Load the "driver"
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 4. "process the results" returned by "SQL queries"
			while (rs.next()) {
				log.info("ID (PK)          ===>" + rs.getInt(1));
				log.info("NAME             ===>" + rs.getString(2));
				log.info("AGE              ===>" + rs.getInt("AGE"));
				log.info("GENDER           ===>" + rs.getString("GENDER"));
				log.info("SALARY           ===>" + rs.getInt("SALARY"));
				log.info("PHONE            ===>" + rs.getInt("PHONE"));
				log.info("JOINING_DATE     ===>" + rs.getDate("JOINING_DATE"));
				log.info("AC_NO            ===>" + rs.getInt("AC_NO"));
				log.info("EMAIL            ===>" + rs.getString("EMAIL"));
				log.info("DEGIGNATION      ===>" + rs.getString("DEGIGNATION"));
				log.info("DOB              ===>" + rs.getDate("DOB"));
				log.info("DEPT_ID          ===>" + rs.getInt("DEPT_ID"));
				log.info("MANAGER_ID       ===>" + rs.getInt("MANAGER_ID"));
			}

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

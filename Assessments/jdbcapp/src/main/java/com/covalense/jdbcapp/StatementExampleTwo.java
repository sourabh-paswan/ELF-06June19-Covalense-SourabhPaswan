package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Driver;
import java.sql.Statement;

//import org.gjt.mm.mysql.Driver;

//import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public class StatementExampleTwo {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int rs1 = 0;

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl = "jdbc:mysql://localhost:3306/covalense_db";
			con = DriverManager.getConnection(dburl, "root", "root");
			log.info("connection impl class===>" + con.getClass());

			String query = "insert into employee_info values(27,'ramu',23,'male',343434,"
					+ "646656,'2017-05-02',6766786,'sommething@gmail.com','boss','1888-12-04',878,7887)";
			stmt = con.createStatement();
			rs1 = stmt.executeUpdate(query);
			log.info("" + rs1);

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}

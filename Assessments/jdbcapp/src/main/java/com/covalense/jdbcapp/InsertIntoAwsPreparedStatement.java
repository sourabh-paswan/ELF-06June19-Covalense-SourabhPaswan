package com.covalense.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Driver;
import java.sql.Statement;
import java.util.Date;

//import org.gjt.mm.mysql.Driver;

//import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public class InsertIntoAwsPreparedStatement {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int rs1 = 0;
		PreparedStatement pstmt = null;
		String query= null;

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			String dburl = "jdbc:mysql://myfirstdb.chbpsrul2gij.ap-south-1.rds.amazonaws.com:3306/awsdb";
			con = DriverManager.getConnection(dburl, "root", "rootroot");
			//log.info("connection impl class===>" + con.getClass());

			query = "insert into employee_info values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, (args[1]));
			pstmt.setInt(3, Integer.parseInt(args[2]));
			pstmt.setString(4, (args[3]));
			pstmt.setInt(5, Integer.parseInt(args[4]));
			pstmt.setInt(6, Integer.parseInt(args[5]));
			pstmt.setString(7, (args[6]));
			pstmt.setInt(8, Integer.parseInt(args[7]));
			pstmt.setString(9, (args[8]));
			pstmt.setString(10, (args[9]));
			pstmt.setString(11, (args[10]));
			pstmt.setInt(12, Integer.parseInt(args[11]));
			pstmt.setInt(13, Integer.parseInt(args[12]));
			
			int rsnew = pstmt.executeUpdate();
			log.info(""+rsnew);

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

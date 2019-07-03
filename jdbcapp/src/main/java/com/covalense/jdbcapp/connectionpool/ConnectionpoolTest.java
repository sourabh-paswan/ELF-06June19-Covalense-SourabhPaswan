package com.covalense.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.Driver;

//import org.gjt.mm.mysql.Driver;

//import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public class ConnectionpoolTest {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ConnectionPool pool = null;

		try {
			pool = ConnectionPool.getConnectionPool();
			con = pool.getConnectionFromPool();

			// 3. issues sql queries via connection
			String query = "select*from employee_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

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
				log.info("DEPT_ID (FK)     ===>" + rs.getInt("DEPT_ID"));
				log.info("MANAGER_ID       ===>" + rs.getInt("MANAGER_ID"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.returnConnectioToPool(con);
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

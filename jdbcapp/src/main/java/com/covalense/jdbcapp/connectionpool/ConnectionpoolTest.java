package com.covalense.jdbcapp.connectionpool;

import java.sql.*;

import lombok.extern.java.Log;

@Log
public final class ConnectionPoolTest {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ConnectionPool pool = null;

		try {
			pool = ConnectionPool.getConnectionPool();
			con = pool.getConnectionFromPool();
			
			// 3. Issues "SQL Queries" via "Connection"
			String query = "Select * from employee_info";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			// 4. "Process the Results" returned by "SQL Queries"
			while (rs.next()) {
				
				log.info("Id (PK)        ====> " + rs.getInt(1));
				log.info("Name     		 ====> " + rs.getString(2));
				log.info("age     		 ====> " + rs.getInt("AGE"));
				log.info("Gender  		 ====> " + rs.getString("GENDER"));
				log.info("salary  		 ====> " + rs.getDouble("SALARY"));
				log.info("phone   		 ====> " + rs.getInt("PHONE"));
				log.info("email   		 ====> " + rs.getDate("JOINING_DATE"));
				log.info("designation    ====> " + rs.getInt("ACCNT_NO"));
				log.info("dob            ====> " + rs.getString("EMAIL"));
				log.info("Acnt_no        ====> " + rs.getString("DESIGNATION"));
				log.info("joining_date   ====> " + rs.getDate("DOB"));
				log.info("Dept_ID        ====> " + rs.getInt("DEPT_ID"));
				log.info("Manager_ID     ====> " + rs.getInt("MANAGER_ID"));				
			} // end of while
			} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5. Close all "JDBC objects"

			try {
				pool.returnConnectionToPool(con);

					if (stmt != null) {
						stmt.close();
					}
					if (rs != null) {
						rs.close();
					}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			} // end of try-catch block
		}

	}// end of main
}// end of class

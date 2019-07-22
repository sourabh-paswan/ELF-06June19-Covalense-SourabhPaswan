package com.covalense.designpattern.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Driver;
import java.sql.Statement;
import java.util.ArrayList;

import com.covalense.designpattern.beans.EmployeeInfoBean;

//import org.gjt.mm.mysql.Driver;

//import com.mysql.jdbc.Driver;

import lombok.extern.java.Log;

@Log
public class EmployeeDAOJDBCImpl implements EmployeeDAO {

	public ArrayList<EmployeeInfoBean> getAllEmployeeInfo() {

		String dburl = "jdbc:mysql://localhost:3306/covalense_db";
		String query = "select*from employee_info";

		try (Connection con = DriverManager.getConnection(dburl, "root", "root");
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {

			// 1. Load the "driver"
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 4. "process the results" returned by "SQL queries"
			ArrayList<EmployeeInfoBean> beans = new ArrayList<>();
			while (rs.next()) {
				EmployeeInfoBean bean = new EmployeeInfoBean();
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getInt("SALARY"));
				bean.setPhone(rs.getInt("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setAccountNo(rs.getInt("AC_NO"));
				bean.setEmail(rs.getString(rs.getString("DEGIGNATION")));
				bean.setDesignation(rs.getString("EMAIL"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDepartmentId(rs.getInt("DEPT_ID"));
				bean.setManagerId(rs.getInt("MANAGER_ID"));

				beans.add(bean);// adding it to arraylist
			}
			return beans;

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public EmployeeInfoBean getEmployeeInfo(String id) {
		try {
			return getEmployeeInfo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return null;
		}

	}// end of getEmployeeInfo

	public EmployeeInfoBean getEmployeeInfo(int id) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		String query = null;

		try {
			// 1. Load the "driver"
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// 2. Get the DB connection via driver
			String dburl = "jdbc:mysql://localhost:3306/covalense_db";
			con = DriverManager.getConnection(dburl, "root", "root");
			log.info("connection impl class===>" + con.getClass());

			// 3. issues sql queries via connection
			query = "select*from employee_info" + " where id=? ";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			// 4. "process the results" returned by "SQL queries"
			EmployeeInfoBean bean = new EmployeeInfoBean();
			while (rs.next()) {
				bean.setId(rs.getInt("ID"));
				bean.setName(rs.getString("NAME"));
				bean.setAge(rs.getInt("AGE"));
				bean.setGender(rs.getString("GENDER"));
				bean.setSalary(rs.getInt("SALARY"));
				bean.setPhone(rs.getInt("PHONE"));
				bean.setJoiningDate(rs.getDate("JOINING_DATE"));
				bean.setAccountNo(rs.getInt("AC_NO"));
				bean.setEmail((rs.getString("DEGIGNATION")));
				bean.setDesignation(rs.getString("EMAIL"));
				bean.setDob(rs.getDate("DOB"));
				bean.setDepartmentId(rs.getInt("DEPT_ID"));
				bean.setManagerId(rs.getInt("MANAGER_ID"));
			}
			return bean;

		} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} finally {
			// 5. close all"jdbc objects"
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

	@Override
	public boolean createEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfoBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}

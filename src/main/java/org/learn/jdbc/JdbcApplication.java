package org.learn.jdbc;

import org.learn.jdbc.dao.EmployeeDao;
import org.learn.jdbc.domain.Employee;
import org.learn.jdbc.domain.impl.EmployeeDaoImpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApplication {
	
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/query?useSSL=false";
	static final String USER_NAME = "root";
	static final String PASSWORD = "Education@123";
	
	public static void main(String[] args) {

		Employee employee = new Employee(1010,"Eric Sherman");
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		employeeDao.insert(employee);
	}
}

package com.vforum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionUtility {
	static Connection connection;

	static {
		try {
			final String databaseURL = "jdbc:mysql://localhost:3306/vforum";
			final String databaseUserName = "root";
			final String databasePassword = "blah123";
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			connection = DriverManager.getConnection(databaseURL, databaseUserName, databasePassword);
		} catch (SQLException e) {

		}
	}

	public static Connection getConnection() {
		return connection;
	}
}

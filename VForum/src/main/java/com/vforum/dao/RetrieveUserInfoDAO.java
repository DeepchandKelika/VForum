package com.vforum.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveUserInfoDAO extends PreparedStatementsForDAO{

	final public static String retrieveUserId(final String emailId) {
		try {
			ResultSet resultSet;
			preparedStatementToRetrieveUserId.setString(1, emailId);
			resultSet = preparedStatementToRetrieveUserId.executeQuery();
			resultSet.next();
			return resultSet.getString("id");
		} catch (SQLException e) {
//			logger.warn(e);
			return null;
		}
	}

	final public static String retrieveUserName(String emailId) {
		try {
			ResultSet resultSet;
			preparedStatementToRetrieveUserName.setString(1, emailId);
			resultSet = preparedStatementToRetrieveUserName.executeQuery();
			resultSet.next();
			return resultSet.getString("username");
		} catch (SQLException e) {
//			logger.warn(e);
			return null;
		}
	}
}

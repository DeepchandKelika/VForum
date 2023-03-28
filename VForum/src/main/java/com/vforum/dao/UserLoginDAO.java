package com.vforum.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.vforum.model.UserModel;

public class UserLoginDAO extends PreparedStatementsForDAO{

	// <---------BEGIN------->
		final static public boolean userLoginAuthentication(final UserModel user) {
			try {
				ResultSet resultSet;
				String emailId = user.getEmailId();
				String password = user.getPassword();
				preparedStatementForUserLogin.setString(1, emailId);
				resultSet = preparedStatementForUserLogin.executeQuery();
				if (resultSet.next()) {
					if (password.equals(resultSet.getString("password"))) {
						user.setUserType(resultSet.getString("UserType"));
						 return true;
					}
				}
				return false;
			} catch (SQLException e) {
//				logger.warn("Driver Exception Handled. " + e);
				return false;
			}
		}
		// <--------END-------->
}

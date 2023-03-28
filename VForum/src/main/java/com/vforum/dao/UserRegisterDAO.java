package com.vforum.dao;

import java.sql.SQLException;

import com.vforum.model.UserModel;

public class UserRegisterDAO extends PreparedStatementsForDAO {

	
	// <---------BEGIN------->
		final static public boolean registerUser(final UserModel user) {
			try {
				// Check For Duplicate Entries - Logic need to be written
				preparedStatementForUserRegister.setInt(1, user.getUserId());
				preparedStatementForUserRegister.setString(4, user.getUserName());
				preparedStatementForUserRegister.setString(2, user.getEmailId());
				preparedStatementForUserRegister.setString(3, user.getPassword());
				preparedStatementForUserRegister.setString(6, user.getPhoneNumber());
				preparedStatementForUserRegister.setString(5, user.getDob());
				preparedStatementForUserRegister.execute();
				return true;
			} catch (SQLException e) {
//				logger.warn("Driver Exception Handled. " + e);
				return false;
			} catch (Exception e) {
//				logger.warn(e);
				return false;
			}
		}
		// <--------END-------->
}

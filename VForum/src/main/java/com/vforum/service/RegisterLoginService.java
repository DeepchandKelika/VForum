package com.vforum.service;

//import org.apache.log4j.Logger;

import com.vforum.dao.UserLoginDAO;
import com.vforum.dao.UserRegisterDAO;
import com.vforum.model.UserModel;

public class RegisterLoginService {

//	static Logger logger = Logger.getLogger(RegisterLoginService.class);

	// <---------BEGIN------->
	final public boolean registerUser(final UserModel user) {
		return UserRegisterDAO.registerUser(user);
	}
	// <--------END-------->

	// <---------BEGIN------->
	final public boolean userLoginAuthentication(final UserModel user) {
		return UserLoginDAO.userLoginAuthentication(user);
	}
	// <--------END-------->

}

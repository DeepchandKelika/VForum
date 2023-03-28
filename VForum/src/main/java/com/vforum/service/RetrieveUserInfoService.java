package com.vforum.service;

//import org.apache.log4j.Logger;

import com.vforum.dao.RetrieveUserInfoDAO;

public class RetrieveUserInfoService {

//	static Logger logger = Logger.getLogger(RetrieveUserInfoService.class);
	final public static String retrieveUserId(final String emailId) {
		try {
			return RetrieveUserInfoDAO.retrieveUserId(emailId);
		} catch (Exception e) {
//			logger.warn(e);
			return null;
		}
	}

	public static String retrieveUserName(String emailId) {
		try {
			return RetrieveUserInfoDAO.retrieveUserName(emailId);
		} catch (Exception e) {
//			logger.warn(e);
			return null;
		}
	}

}

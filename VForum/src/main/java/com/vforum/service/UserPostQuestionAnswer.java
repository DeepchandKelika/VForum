package com.vforum.service;

//import org.apache.log4j.Logger;

import com.vforum.dao.PostAnswerDAO;
import com.vforum.dao.PostQuestionDAO;
import com.vforum.model.UserPostAnswerModel;
import com.vforum.model.UserPostQuestionModel;

public class UserPostQuestionAnswer {
//	static Logger logger = Logger.getLogger(UserPostQuestionAnswer.class);

	public static void postAnswer(final UserPostAnswerModel post) {

		try {
			PostAnswerDAO.postAnswer(post);
		} catch (Exception e) {
//			logger.warn(e);
		}
	}

	// <---------BEGIN------->
	final public static void postQuestion(UserPostQuestionModel question) {
		try {
			PostQuestionDAO.postQuestion(question);
		} catch (Exception e) {
//			logger.warn(e);
		}
	}
	// <--------END-------->

}

package com.vforum.service;

import java.util.ArrayList;

//import org.apache.log4j.Logger;

import com.vforum.dao.RetrieveAllPostsDAO;
import com.vforum.model.Answers;
import com.vforum.model.Questions;

public class RetrieveAllPostsService {
//	static Logger logger = Logger.getLogger(UserPostQuestionAnswer.class);

	public static ArrayList<Questions> getAllQuestions() {
		try {
			return RetrieveAllPostsDAO.getAllQuestions();
		} catch (Exception e) {
//			logger.warn(e);
			return null;
		}
	}

	public static ArrayList<Answers> getAllAnswers() {
		try {
			
			return RetrieveAllPostsDAO.getAllAnswers();
		} catch (Exception e) {
//			logger.warn(e);
			return null;
		}
	}
	
//	public static int retrieveQuestionId(String question) {
//		try {
//			return RetrieveAllPostsDAO.retrieveQuestionId(question);
//		} catch (Exception e) {
//			logger.warn(e);
//			return 0;
//		}
//	}



}

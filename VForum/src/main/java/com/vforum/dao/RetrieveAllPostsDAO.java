package com.vforum.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vforum.model.Answers;
import com.vforum.model.Questions;

public class RetrieveAllPostsDAO extends PreparedStatementsForDAO{

	public static ArrayList<Questions> getAllQuestions() {
		try {
			ResultSet resultSet;
			ArrayList<Questions> questions = new ArrayList<Questions>();
			resultSet = preparedStatementToGetAllQuestions.executeQuery();
			
			while (resultSet.next()) {
				Questions question = new Questions();
				question.setUsername(resultSet.getString("username"));
				question.setQuestionContent(resultSet.getString("postQuestion"));
				question.setQuestionId(resultSet.getInt("questionId"));

				questions.add(question);
			}

			return questions;
		} catch (SQLException e) {
//			logger.warn(e);
			return null;
		}
	}

	final public static ArrayList<Answers> getAllAnswers() {
		try {
			ResultSet resultSet;
			ArrayList<Answers> answers = new ArrayList<Answers>();
			resultSet = preparedStatementToGetAnswers.executeQuery();
			
			while (resultSet.next()) {
				Answers answer = new Answers();
				answer.setUsername(resultSet.getString("username"));
				answer.setAnswerContent(resultSet.getString("postAnswer"));
				answer.setQuestionId(resultSet.getInt("questionId"));

				answers.add(answer);
			}

			return answers;
		} catch (SQLException e) {
	//		logger.warn(e);
			return null;
		}
	}
	
	final public static int retrieveQuestionId(String question) {
		ResultSet resultSet;
		try {
			preparedStatementToRetrieveQuestionid.setString(1, question);
			resultSet = preparedStatementToRetrieveQuestionid.executeQuery();
			resultSet.next();
			return resultSet.getInt("questionId");
		} catch (SQLException e) {
		//	logger.warn(e);
			return 0;
		}
	}

}

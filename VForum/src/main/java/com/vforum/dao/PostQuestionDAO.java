package com.vforum.dao;

import java.sql.SQLException;

import com.vforum.model.UserPostQuestionModel;

public class PostQuestionDAO extends PreparedStatementsForDAO {

	// <---------BEGIN------->
		final public static void postQuestion(UserPostQuestionModel question) {
			try {
				// QuestionID is AUTO INCREMENT value.
				preparedStatementToPostQuestion.setInt(1, question.getUserId());
				preparedStatementToPostQuestion.setString(2, question.getQuestionContent());
				preparedStatementToPostQuestion.execute();
			} catch (SQLException e) {
//				logger.warn(e);
			}
		}
		// <--------END-------->
}

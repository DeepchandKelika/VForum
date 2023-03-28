package com.vforum.dao;

import java.sql.SQLException;

import com.vforum.model.Questions;

public class AdminDeleteUserPostDAO extends PreparedStatementsForDAO{

	// <---------BEGIN------->
		final public static void adminDeleteUserPost(Questions post) {
			try {
				int questionId = post.getQuestionId();
				preparedStatementToDeleteUserPostQuestion.setInt(1, questionId);
				preparedStatementToDeleteUserPostQuestion.execute();
				
				preparedStatementToDeleteUserPostAnswers.setInt(1, questionId);
				preparedStatementToDeleteUserPostAnswers.execute();
			} catch (SQLException e) {
//				logger.warn("Damn it. Looks like admin can't delete the post with an issue: " + e);
			}
		}
		// <--------END-------->
	
}

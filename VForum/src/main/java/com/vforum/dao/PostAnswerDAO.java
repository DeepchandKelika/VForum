package com.vforum.dao;

import java.sql.SQLException;

import com.vforum.model.UserPostAnswerModel;

public class PostAnswerDAO extends PreparedStatementsForDAO {
	public static void postAnswer(final UserPostAnswerModel post) {

		try {
			// System.out.println(post.getQuestionId());
			preparedStatementToPostAnswer.setInt(1, post.getQuestionId());
			preparedStatementToPostAnswer.setString(2, post.getAnswer());
			preparedStatementToPostAnswer.setInt(3, post.getUserId());
			preparedStatementToPostAnswer.execute();
		} catch (SQLException e) {
//			logger.warn(e);
		}
	}
}

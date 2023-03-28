package com.vforum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import org.apache.log4j.Logger;

public class PreparedStatementsForDAO {
//	static Logger logger = Logger.getLogger(PreparedStatementsForDAO.class);
	static PreparedStatement preparedStatementForUserRegister;
	static PreparedStatement preparedStatementForUserLogin;
//	static PreparedStatement preparedStatementForAdminLogin;
	static PreparedStatement preparedStatementToRetrieveUserName;
	static PreparedStatement preparedStatementToGetAllQuestions;
	static PreparedStatement preparedStatementToGetAnswers;
	static PreparedStatement preparedStatementToPostAnswer;
	static PreparedStatement preparedStatementToRetrieveUserId;
	static PreparedStatement preparedStatementToRetrieveQuestionid;
	static PreparedStatement preparedStatementToPostQuestion;
	static PreparedStatement preparedStatementToDeleteUserPostQuestion;
	static PreparedStatement preparedStatementToDeleteUserPostAnswers;
	static {
	try {
		Connection connection = DataBaseConnectionUtility.getConnection();
		preparedStatementToDeleteUserPostQuestion = connection.prepareStatement("DELETE FROM answers WHERE questionId = ?");
		preparedStatementToDeleteUserPostAnswers = connection.prepareStatement("DELETE FROM questions WHERE questionId = ?");
		preparedStatementForUserRegister = connection.prepareStatement("INSERT INTO users(id,email,password,username,dob,phone_number) VALUES(?,?,?,?,?,?);");
		preparedStatementForUserLogin = connection.prepareStatement("SELECT Id, password, UserType FROM users WHERE email=?");
//		preparedStatementForAdminLogin = connection.prepareStatement("SELECT password FROM admin WHERE email=?");
		preparedStatementToRetrieveUserName = connection
				.prepareStatement("SELECT username from users WHERE email = ?");
		preparedStatementToGetAllQuestions = connection.prepareStatement(
				"SELECT username, postQuestion, questionId FROM users, questions WHERE users.id = questions.id ORDER BY questions.questionId");
		preparedStatementToGetAnswers = connection.prepareStatement(
				"SELECT username, postAnswer, questionId FROM users, answers WHERE users.id = answers.id ORDER BY questionId");
		preparedStatementToPostAnswer = connection.prepareStatement("INSERT INTO answers VALUES(?,?,?);");
		preparedStatementToPostQuestion = connection
				.prepareStatement("INSERT INTO QUESTIONS(ID,postQuestion) VALUES(?,?);");
		preparedStatementToRetrieveUserId = connection.prepareStatement("SELECT id FROM users WHERE email = ?");
		preparedStatementToRetrieveQuestionid = connection
				.prepareStatement("SELECT questionId FROM questions WHERE postQuestion = ?");
	} catch (SQLException e) {
//		logger.warn(e);
	}
	}
}

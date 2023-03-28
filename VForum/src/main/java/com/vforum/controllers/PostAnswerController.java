package com.vforum.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vforum.model.UserPostAnswerModel;
import com.vforum.service.UserPostQuestionAnswer;

//@WebServlet("/PostAnswer")
public class PostAnswerController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// Logger logger = Logger.getLogger(PostAnswerServlet.class);
		HttpSession postAnswerSession = request.getSession();
		String answer = request.getParameter("answer");
		
		int questionId = Integer.parseInt(request.getParameter("questionId"));
		
		UserPostAnswerModel post = new UserPostAnswerModel();
		post.setQuestionId(questionId);
		post.setAnswer(answer);
		post.setUserId(Integer.parseInt((String) postAnswerSession.getAttribute("userId")));
		
		UserPostQuestionAnswer.postAnswer(post);

		// Redirecting to HomePage After Posting Answer.
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/UserHomePage");
		requestDispatcher.forward(request, response);
	}
}

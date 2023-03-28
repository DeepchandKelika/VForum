package com.vforum.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vforum.model.UserPostQuestionModel;
import com.vforum.service.UserPostQuestionAnswer;

//@WebServlet("/PostQuestion")
public class PostQuestionController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*
		 * You have User ID in the Session. Take the Question Content from UserInput and
		 * pass it to PostQuestion function.
		 */
		HttpSession session = request.getSession();
		UserPostQuestionModel question = new UserPostQuestionModel();
		question.setUserId(Integer.parseInt((String) session.getAttribute("userId")));
		question.setQuestionContent(request.getParameter("newQuestion")); // Keep the name 'newQuestion' for that input
																			// field of Question in HTML.
		UserPostQuestionAnswer.postQuestion(question);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/UserHomePage");
		requestDispatcher.forward(request, response);
	}
}

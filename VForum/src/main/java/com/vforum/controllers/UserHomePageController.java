package com.vforum.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.vforum.model.Answers;
import com.vforum.model.Questions;
import com.vforum.service.RetrieveAllPostsService;
import com.vforum.service.RetrieveUserInfoService;

//@WebServlet("/UserHomePage")
public class UserHomePageController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	final public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		HttpSession userHomePageSession = request.getSession(false);
		String emailId = (String) userHomePageSession.getAttribute("emailID");
		userHomePageSession.setAttribute("accountUsername", RetrieveUserInfoService.retrieveUserName(emailId));

		ArrayList<Questions> questions = RetrieveAllPostsService.getAllQuestions();
		ArrayList<Answers> answers = RetrieveAllPostsService.getAllAnswers();

		request.setAttribute("questions", questions);
		request.setAttribute("answers", answers);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("UserHomePage.jsp");
		requestDispatcher.forward(request, response);
	}
}

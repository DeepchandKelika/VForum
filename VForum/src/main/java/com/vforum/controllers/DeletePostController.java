package com.vforum.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vforum.model.Questions;
import com.vforum.service.AdminDeleteUserPostService;

//@WebServlet("/DeletePost")
public class DeletePostController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		
		int questionId = Integer.parseInt(request.getParameter("Id"));
		Questions post = new Questions();
		post.setQuestionId(questionId);
		AdminDeleteUserPostService.adminDeleteUserQuestion(post);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("UserHomePage.hsp");
		requestDispatcher.forward(request, response);

	}

}

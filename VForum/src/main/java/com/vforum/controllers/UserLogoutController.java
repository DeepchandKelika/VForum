package com.vforum.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/UserLogout")
public class UserLogoutController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		response.setContentType("text/html");
		HttpSession sessionEnd = request.getSession();
		sessionEnd.invalidate();
		request.logout();
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("VForum.jsp");
		requestDispatcher.forward(request, response);
	}
}

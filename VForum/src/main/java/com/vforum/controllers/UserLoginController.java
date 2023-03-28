package com.vforum.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.apache.log4j.Logger;

import com.vforum.model.UserModel;
import com.vforum.service.RegisterLoginService;
import com.vforum.service.RetrieveUserInfoService;

//@WebServlet("/UserLogin")
public class UserLoginController extends HttpServlet {

//	static Logger logger = Logger.getLogger(UserLoginController.class);
	private static final long serialVersionUID = 1L;
	RegisterLoginService serviceRegisterLogin = new RegisterLoginService();
	RequestDispatcher requestDispatcher;

	final public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		try {
			UserModel model = new UserModel();
			HttpSession session = request.getSession();
			String emailId = request.getParameter("emailID");
			model.setEmailId(emailId);
			String password = request.getParameter("password");
			model.setPassword(password);
			if (serviceRegisterLogin.userLoginAuthentication(model)) {
				if (model.getUserType().equals("admin")) {
					request.setAttribute("userType", model.getUserType());
				}
				session.setAttribute("userId", RetrieveUserInfoService.retrieveUserId(emailId));
				session.setAttribute("emailID", emailId);
				/*
				 * Session Values: USER ID, EMAIL ID
				 */
				requestDispatcher = request.getRequestDispatcher("/UserHomePage");
				requestDispatcher.forward(request, response);
			} else {

				request.setAttribute("credentials", "Invalid Credentials");
				requestDispatcher = request.getRequestDispatcher("Login.jsp");
				requestDispatcher.include(request, response);
			}
		} catch (Exception e) {

		}
	}
}
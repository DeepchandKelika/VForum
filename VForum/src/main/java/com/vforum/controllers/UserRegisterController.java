package com.vforum.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.log4j.Logger;

import com.vforum.model.UserModel;
import com.vforum.service.RegisterLoginService;

///@WebServlet("/UserRegister")
public class UserRegisterController extends HttpServlet {
	Validation validation = new Validation();
//	static Logger logger = Logger.getLogger(UserRegisterController.class);
	private static final long serialVersionUID = 1L;
	RegisterLoginService serviceRegisterLogin = new RegisterLoginService();
	RequestDispatcher requestDispatcher;

	final public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		// PrintWriter printer = response.getWriter();
		try {
			UserModel model = new UserModel();

			// Validations need to be done in JavaScript maybe?
			int userId = Integer.parseInt(request.getParameter("empid"));
			model.setUserId(userId);

			String emailId = request.getParameter("email");
			// if (!validation.emailID(emailId)) {
			// throw new InvalidEmailException("Entered Email is Invalid");
			// }
			model.setEmailId(emailId);

			String password = request.getParameter("password");
			// if (!validation.password(password)) {
			// throw new PasswordNotMatchedException("Password didn't match the
			// requirements.");
			// }
			model.setPassword(password);

			String firstName = request.getParameter("firstName");
			// if (!validation.nameCheck(firstName)) {
			// throw new InvalidNameFormatException("Invalid First Name");
			// }

			String lastName = request.getParameter("lastName");
			// if (!validation.nameCheck(lastName)) {
			// throw new InvalidNameFormatException("Invalid First Name");
			// }

			String userName = firstName.concat(" ".concat(lastName));
			model.setUserName(userName);

			String phoneNumber = request.getParameter("phoneNumber");
			// if (!validation.phoneNumberFormat(phoneNumber)) {
			// throw new PhoneNumberFormatException("Invalid Phone Number");
			// }
			model.setPhoneNumber(phoneNumber);

			String dateOfBirth = request.getParameter("dob");
			model.setDob(dateOfBirth);
			// if (!validation.dateOfBirth(dateOfBirth)) {
			// throw new DateOfBirthFormatException("Invalid Date Format");
			// }

			if (serviceRegisterLogin.registerUser(model)) {
				requestDispatcher = request.getRequestDispatcher("VForum.jsp");
				requestDispatcher.forward(request, response);
			} else {
				requestDispatcher = request.getRequestDispatcher("Register.jsp");
				requestDispatcher.forward(request, response);
			}
		} catch (Exception e) {
//			logger.warn(e);
		}

		// catch (NumberFormatException e) {
		// logger.warn(e);
		// } catch (InvalidEmailException e) {
		// logger.warn(e);
		// } catch (PasswordNotMatchedException e) {
		// logger.warn(e);
		// } catch (InvalidNameFormatException e) {
		// logger.warn(e);
		// } catch (DateOfBirthFormatException e) {
		// logger.warn(e);
		// } catch (PhoneNumberFormatException e) {
		// logger.warn(e);
		// }

	}
}

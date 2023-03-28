package com.vforum.service;

import com.vforum.dao.AdminDeleteUserPostDAO;
import com.vforum.model.Questions;

public class AdminDeleteUserPostService {

	
	public static void adminDeleteUserQuestion(Questions post) {
		AdminDeleteUserPostDAO.adminDeleteUserPost(post);
	}
	
}


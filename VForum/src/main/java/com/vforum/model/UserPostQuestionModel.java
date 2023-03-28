package com.vforum.model;

public class UserPostQuestionModel {

	private int userId;
	private String questionContent;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userID) {
		this.userId = userID;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String content) {
		this.questionContent = content;
	}
}

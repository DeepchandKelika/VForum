package com.vforum.model;

public class Questions {

	private String questionContent;
	private int questionId;
	private String username;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questiondID) {
		this.questionId = questiondID;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String postQuestionContent) {
		this.questionContent = postQuestionContent;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}

}

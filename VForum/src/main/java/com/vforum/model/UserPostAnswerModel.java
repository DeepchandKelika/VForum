package com.vforum.model;

public class UserPostAnswerModel {

	
	private String answer;
	private int questionId;
	int userId;
	
	final public void setAnswer(String postAnswer) {
		this.answer = postAnswer;
	}
	
	final public String getAnswer() {
		return answer;
	}
	
	final public void setQuestionId(int questionID) {
		this.questionId = questionID;
	}
	
	final public int getQuestionId() {
		return questionId;
	}
	
	final public void setUserId(int userID) {
		this.userId = userID;
	}
	
	final public int getUserId() {
		return userId;
	}
	
	public String toString() {
		return (questionId+ " "+userId+" "+answer+" ");
	}
}	
